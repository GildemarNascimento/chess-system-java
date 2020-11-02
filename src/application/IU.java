package application;

import Chess.ChessPiece;

public class IU {
	
	public static void printBoard(ChessPiece[][]pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((8-i) + " ");
			for(int j=0; j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g");
	}
	private static void printPiece(ChessPiece peice) {
		if (peice == null) {
			System.out.print("-");
		}else {
			System.out.print(peice);
		}
		System.out.print(" ");
	}

}
