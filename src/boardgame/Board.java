package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] piece;
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		piece =new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
