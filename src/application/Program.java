package application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			IU.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = IU.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Targer: ");
			ChessPosition target = IU.readChessPosition(sc);
			
			ChessPiece capuredPiece = chessMatch.performaceChessMove(source, target); 
		}
	 	
		

	}

}
