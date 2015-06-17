import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class addItem extends JDialog {
	private JTextField formattedNameField;
	private JTextField formattedPriceField;
	private JTextField formattedDayField;
	private Item mainItem;
	private JTextField formattedMonthField;
	private JTextField formattedYearField;

	public Item getMainItem() {
		return mainItem;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			addItem dialog = new addItem();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public addItem() {
		mainItem = new Item();
		setTitle("Add");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reason for the expence:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 33, 200, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPrice = new JLabel("Amount of the expence:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(10, 81, 200, 25);
		getContentPane().add(lblPrice);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDay.setBounds(10, 125, 39, 25);
		getContentPane().add(lblDay);
		
		formattedNameField = new JTextField();
		formattedNameField.setBounds(249, 34, 175, 24);
		getContentPane().add(formattedNameField);
		formattedNameField.setColumns(10);
		
		formattedPriceField = new JTextField();
		formattedPriceField.setBounds(249, 81, 175, 25);
		getContentPane().add(formattedPriceField);
		formattedPriceField.setColumns(10);
		
		formattedDayField = new JTextField();
		formattedDayField.setBounds(59, 125, 39, 25);
		getContentPane().add(formattedDayField);
		formattedDayField.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonth.setBounds(140, 125, 60, 25);
		getContentPane().add(lblMonth);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYear.setBounds(259, 125, 39, 25);
		getContentPane().add(lblYear);
		
		formattedMonthField = new JTextField();
		formattedMonthField.setColumns(10);
		formattedMonthField.setBounds(210, 127, 39, 25);
		getContentPane().add(formattedMonthField);
		
		formattedYearField = new JTextField();
		formattedYearField.setColumns(10);
		formattedYearField.setBounds(313, 127, 39, 25);
		getContentPane().add(formattedYearField);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener (){

			@Override
			public void actionPerformed(ActionEvent e) {
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				String name = formattedNameField.getText();
				double price = 0;
				int day = 0;
				int month =0;
				int year =0;
				
				
				try {
					price = numberFormat.parse(formattedPriceField.getText()).doubleValue();
					day = numberFormat.parse(formattedDayField.getText()).intValue();
					month = numberFormat.parse(formattedMonthField.getText()).intValue();
					year = numberFormat.parse(formattedYearField.getText()).intValue();
					
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}
				
				
				
				mainItem.setName(name);
				mainItem.setPrice(price);
				mainItem.setDay(day);
				mainItem.setMonth(month);
				
				mainItem.setYear(year);
				mainItem.setCalendar(year,month-1 , day);
				
				
				setVisible(false);
				
			}
			
		});
		btnAdd.setBounds(40, 211, 89, 23);
		getContentPane().add(btnAdd);
		
		JButton btnCencel = new JButton("Cencel");
		btnCencel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				mainItem=null;
				setVisible(false);
				
			}
			
		});
		btnCencel.setBounds(249, 211, 89, 23);
		getContentPane().add(btnCencel);
		
		
	}
}
