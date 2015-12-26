import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	static void cPU(char[][] board) {
		int[] numberOfSpaces = new int[8];
		int lineNumber = 0;

		int countO = 0;
		int maxO = 0;
		int maxOLine = 0;

		int countX = 0;
		int maxX = 0;
		int maxXLine = 0;

		int countSpaces = 0;

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == 'X') {
					countX++;
				}

				if (board[row][col] == 'O') {
					countO++;
				}

				if (board[row][col] == ' ') {
					countSpaces++;
				}
			}

			numberOfSpaces[lineNumber] = countSpaces;
			countSpaces = 0;

			if (countX > maxX) {

				maxX = countX;
				maxXLine = lineNumber;

			}
			countX = 0;

			if (countO > maxO) {

				maxO = countO;
				maxOLine = lineNumber;

			}

			countO = 0;
			lineNumber++;

		}

		for (int col = 0; col < board[0].length; col++) {
			for (int row = 0; row < board.length; row++) {
				if (board[row][col] == 'X') {
					countX++;
				}

				if (board[row][col] == 'O') {
					countO++;
				}

				if (board[row][col] == ' ') {
					countSpaces++;
				}
			}

			numberOfSpaces[lineNumber] = countSpaces;
			countSpaces = 0;

			if (countX > maxX) {

				maxX = countX;
				maxXLine = lineNumber;

			}
			countX = 0;

			if (countO > maxO) {

				maxO = countO;
				maxOLine = lineNumber;

			}
			countO = 0;
			lineNumber++;

		}

		for (int col = 0, row = 0; col < board[0].length; col++, row++) {

			if (board[row][col] == 'X') {
				countX++;
			}

			if (board[row][col] == 'O') {
				countO++;
			}

			if (board[row][col] == ' ') {
				countSpaces++;
			}
		}

		numberOfSpaces[lineNumber] = countSpaces;
		countSpaces = 0;

		if (countX > maxX) {

			maxX = countX;
			maxXLine = lineNumber;

		}
		countX = 0;

		if (countO > maxO) {

			maxO = countO;
			maxOLine = lineNumber;

		}
		countO = 0;
		lineNumber++;

		for (int row = 0, col = 2; col >= 0; col--, row++) {

			if (board[row][col] == 'X') {
				countX++;
			}

			if (board[row][col] == 'O') {
				countO++;
			}

			if (board[row][col] == ' ') {
				countSpaces++;
			}
		}

		numberOfSpaces[lineNumber] = countSpaces;
		countSpaces = 0;

		if (countX > maxX) {

			maxX = countX;
			maxXLine = lineNumber;

		}
		countX = 0;

		if (countO > maxO) {

			maxO = countO;
			maxOLine = lineNumber;

		}
		countO = 0;
		
		if (maxX == 2&&numberOfSpaces[maxXLine]==1) {
			if (maxXLine > -1 && maxXLine < 3) {
				findEmptyAndFillCRU(board,maxXLine);
			}
		}
		System.out.println(Arrays.toString(numberOfSpaces));

	}

	static void findEmptyAndFillCRU(char[][] board, int line) {
		switch (line) {

		case 0:
			
				for (int col = 0,row = 0; col < board.length; col++) {
					if (board[row][col] == ' ') {
						fillChar(row, col, board, 'O');

					}

				}

			
			
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		}
	}

	static void printBoardWithCoordinates(char[][] board) {
		System.out.println("  1 2 3");
		for (int i = 0; i <= 2; i++) {
			System.out.print((i + 1) + "|");
			for (int j = 0; j <= 2; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
		}
	}

	static boolean fillChar(int x, int y, char board[][], char player) {
		if (x < 0 || x > board.length || y < 0 || y > board.length) {
			System.out
					.println("Invalid coordinates try again.Here is the field to help you see");
			printBoardWithCoordinates(board);
			return false;
		}
		if (board[x][y] != ' ') {
			System.out
					.println("Not empty coordinates try again. Here is the field to help you see");
			printBoardWithCoordinates(board);
			return false;
		}
		board[x][y] = player;
		return true;
	}

	static boolean somebodyHasWon(char board[][], char player) {
		if ((board[0][0] == player && board[0][1] == player && board[0][2] == player)
				|| (board[1][0] == player && board[1][1] == player && board[1][2] == player)
				|| (board[2][0] == player && board[2][1] == player && board[2][2] == player)
				|| (board[0][0] == player && board[1][0] == player && board[2][0] == player)
				|| (board[0][1] == player && board[1][1] == player && board[2][1] == player)
				|| (board[0][2] == player && board[1][2] == player && board[2][2] == player)
				|| (board[0][0] == player && board[1][1] == player && board[2][2] == player)
				|| (board[2][0] == player && board[1][1] == player && board[0][2] == player)) {
			System.out.println("Player " + player + " has won! \n Game Over");
			return true;

		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];
		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 2; j++) {
				board[i][j] = ' ';
			}

		}

		System.out
				.println("Welcome to tic tac toe! \nHere is the empty field with it`s coordinates to help you play.");
		printBoardWithCoordinates(board);
		char player = 'X';

		for (int moves = 0;;) {
			int x1, y1;

			do {

				System.out.println("Please input the row of the '" + player
						+ "':");
				x1 = sc.nextInt();
				System.out.println("Please input the column of the '" + player
						+ "':");
				y1 = sc.nextInt();
			} while (!fillChar(x1 - 1, y1 - 1, board, player));

			printBoardWithCoordinates(board);

			if (somebodyHasWon(board, player)) {
				break;
			}
			// player = player == 'X' ? 'O' : 'X';
			moves++;

			cPU(board);

			printBoardWithCoordinates(board);

			if (somebodyHasWon(board, player)) {
				break;
			}

			moves++;

			if (moves == (board.length * board.length - 1)) {

				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board.length; j++) {
						if (board[i][j] == ' ') {
							fillChar(i, j, board, player);
						}
					}
				}
				if (somebodyHasWon(board, player)) {
					printBoardWithCoordinates(board);
					break;
				}

				System.out.println("Nobody wins");
				printBoardWithCoordinates(board);
				break;

			}

		}

		sc.close();
	}
}