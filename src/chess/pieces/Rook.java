package chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "R";
	}
	@Override
	public boolean[][] positionMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);

		//above
		p.setValues(position.getRow()-1, position.getColumn());
		
		while (getBoard().positionExists(p) && ! getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()-1);
			}
		//left
		p.setValues(position.getRow(), position.getColumn()-1);
		
		while (getBoard().positionExists(p) && ! getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()-1);
		}
		//right
		p.setValues(position.getRow(), position.getColumn()+1);
		
		while (getBoard().positionExists(p) && ! getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn()+1);
		}
		//below
		p.setValues(position.getRow()+1, position.getColumn());
		
		while (getBoard().positionExists(p) && ! getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow()+1);
		}
		
		return mat;
	}
}
