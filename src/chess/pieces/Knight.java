package chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Knight extends ChessPiece{

		public Knight(Board board, Color color) {
			super(board, color);
		}
		@Override
		public String toString() {
			return "N";
		}
		private boolean canMove(Position position) {
			 ChessPiece p = (ChessPiece)getBoard().piece(position);
			 return p == null || p.getColor() != getColor();
		}
		
		@Override
		public boolean[][] possibleMoves() {
			boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
			
			Position p = new Position(0,0);
			
			
			p.setValues(position.getRow()-1, position.getColumn()-2);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//below
			p.setValues(position.getRow()-2, position.getColumn()-1);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//left
			p.setValues(position.getRow()-2, position.getColumn()+1);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//Right
			p.setValues(position.getRow()-1, position.getColumn()+2);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//nw
			p.setValues(position.getRow()+1, position.getColumn()+2);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//ne
			p.setValues(position.getRow()+2, position.getColumn()+1);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//sw
			p.setValues(position.getRow()+2, position.getColumn()-1);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			//se
			p.setValues(position.getRow()+1, position.getColumn()-2);
			if(getBoard().positionExists(p) && canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}


			return mat;
		}
}
