import java.util.Scanner;

public class TicTacToe {

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

				System.out.println("Please input the row of the '" + player	+ "':");
				x1 = sc.nextInt();
				System.out.println("Please input the column of the '" + player	+ "':");
				y1 = sc.nextInt();
			} while (!fillChar(x1 - 1, y1 - 1, board, player));
			
			printBoardWithCoordinates(board);
			
			if (somebodyHasWon(board, player)) {
				break;
			}
			player = player == 'X' ? 'O' : 'X';
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
