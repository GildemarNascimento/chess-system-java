package chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "K";
	}
	private boolean canMove(Position position) {
		 ChessPiece p = (ChessPiece)getBoard().piece(position);
		 return p != null && p.getColor() != getColor();
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		
		
		return mat;
	}
	
}
