import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;

public class App {

	private JFrame frmTest;
	private JTable table;
	private JButton btnOneWeek;
	private JButton btnOneMonth;
	private JButton btnOneYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayList<Item> items=new ArrayList<Item>();
		frmTest = new JFrame();
		frmTest.setTitle("My first app");
		frmTest.setBounds(100, 100, 515, 373);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTest.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add Item");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addItem dialog = new addItem();
				dialog.setModal(true);
				dialog.setVisible(true);
				Item item =dialog.getMainItem();
				if(item==null){
					return;
				}
				else{
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] { item.getDate(), item.getName(),item.getPrice(), });
					items.add(item);
				}
			}
		});
		btnAdd.setBounds(10, 283, 106, 40);
		frmTest.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 479, 168);
		frmTest.getContentPane().add(scrollPane);
		
		Object[][] rowData = new Object[0][3];
		Object[] columnNames = { "DATE", "Reason for the expence", "Price",};
		
		table = new JTable();
		table.setModel(new DefaultTableModel(rowData,columnNames));
		scrollPane.setViewportView(table);
		
		btnOneWeek = new JButton("One Week");
		btnOneWeek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oneWeek dialog = new oneWeek();
				dialog.setModal(true);
				dialog.setVisible(true);
				
			}
		});
		btnOneWeek.setBounds(126, 283, 94, 40);
		frmTest.getContentPane().add(btnOneWeek);
		
		btnOneMonth = new JButton("One Month");
		btnOneMonth.setBounds(230, 284, 106, 38);
		frmTest.getContentPane().add(btnOneMonth);
		
		btnOneYear = new JButton("One Year");
		btnOneYear.setBounds(346, 284, 115, 39);
		frmTest.getContentPane().add(btnOneYear);
		
		
		
		JButton btnImport = new JButton("Import");
		btnImport.setBounds(10, 238, 106, 34);
		frmTest.getContentPane().add(btnImport);
		
		btnImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Data file", "txt"));
					fileChooser.showDialog(null, "Open file");
					
					File file = fileChooser.getSelectedFile();
					
					List<String> fileContent = Files.readAllLines(file.toPath());
					
					for (String line : fileContent) {
						NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
						
					String[] row = line.split("[\\|]");
						for(String item : row ) {
					    
						    System.out.println(item);
						}
						
//						String target = row[0];
						
						
						DateFormat dF = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);
//						Date date = (Date) dateF.parse(dateStr);
						
					    Date result = dF.parse(row[0]);  
					    System.out.println(result);
						
						
						
						
						
						String name = "";
						double price = 0;
						
						
						try {
							name = row[1];
							price = numberFormat.parse(row[2]).doubleValue();
						} catch (ParseException ex) {
							JOptionPane.showMessageDialog(null, "Error parsing data!");
							ex.printStackTrace();
						}
						Item item = new Item(result, name, price);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] { item.getDate(), item.getName(), item.getPrice()});
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error loading file!");
					System.exit(0);
				}
				JOptionPane.showMessageDialog(null, "File loaded successfully!");
				
			}
		});
		
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(126, 238, 94, 34);
		frmTest.getContentPane().add(btnExport);
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setFileFilter(new FileNameExtensionFilter("Data file", "txt"));
					fileChooser.showDialog(null, "Save file");
					
					File file = fileChooser.getSelectedFile();
					if (file == null){
						return;
					}
					
					String path = file.getPath();
					if (path == null){
						return;
					}
					
					path = path.endsWith(".txt") ? path : path + ".txt";
					
					FileWriter fileStream = new FileWriter(path);
					BufferedWriter writer = new BufferedWriter(fileStream);
					
					ArrayList<String> list = new ArrayList<String>();
					
					int rowCount = table.getRowCount();
					for (int i = 0; i < rowCount; i++) {
						String line = String.format("%s|%s|%s", table.getValueAt(i, 0),
																table.getValueAt(i, 1),
																table.getValueAt(i, 2));
						list.add(line);
			        }
					
					for (String line : list) {
						writer.append(line);
						writer.newLine();
					}
					
					writer.close();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Error! File is not saved correctly!");
				}
				JOptionPane.showMessageDialog(null, "File saved successfully!");
			}
		});
		
		
		
		
	}
}
