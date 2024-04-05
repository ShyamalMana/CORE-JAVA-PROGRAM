package com.shyam;

import java.util.Scanner;

public class Tic_Tac_Toe_Game 
{
	private static final int SIZE = 3;
	private static char[][] board = new char[SIZE][SIZE];
	private static char currentPlayer = 'X';

	public static void main(String[] args) {
		initializeBoard();
		printBoard();

		Scanner scanner = new Scanner(System.in);
		int row, col;

		while (true) {
			System.out.println("Player " + currentPlayer + "'s turn");
			System.out.print("Enter row  (0-2): ");
			row = scanner.nextInt();
			System.out.print("Enter column (0-2): ");
			col = scanner.nextInt();

			if (isValidMove(row, col)) {
				board[row][col] = currentPlayer;
				printBoard();

				if (isWin()) {
					System.out.println("Player " + currentPlayer + " wins!");
					break;
				}

				if (isBoardFull()) {
					System.out.println("It's a draw!");
					break;
				}

				currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			} else {
				System.out.println("Invalid move. Try again.");
			}
		}

		scanner.close();
	}

	private static boolean isBoardFull() {
		// TODO Auto-generated method stub
		return false;
	}

	private static void initializeBoard() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static void printBoard() {
		System.out.println("-------------");
		for (int i = 0; i < SIZE; i++) {
			System.out.print("| ");
			for (int j = 0; j < SIZE; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}

	private static boolean isValidMove(int row, int col) {
		return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
	}

	private static boolean isWin() {
		System.out.println("See by Your Self in the screen");
		return false;
		
	}


}
