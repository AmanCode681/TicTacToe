package TicTacToe;

public class Player {

	private int id;
	private String name;
	private PieceType type;
	private int[] rowSum;
	public int[] getRowSum() {
		return rowSum;
	}

	public void setRowSum(int[] rowSum) {
		this.rowSum = rowSum;
	}

	public int[] getColSum() {
		return colSum;
	}

	public void setColSum(int[] colSum) {
		this.colSum = colSum;
	}

	public int getMainDiagonal() {
		return mainDiagonal;
	}

	public void setMainDiagonal(int mainDiagonal) {
		this.mainDiagonal = mainDiagonal;
	}

	public int getReverseDiagonal() {
		return reverseDiagonal;
	}

	public void setReverseDiagonal(int reverseDiagonal) {
		this.reverseDiagonal = reverseDiagonal;
	}

	private int[] colSum;
	private int mainDiagonal;
	private int reverseDiagonal;
	public Player(int id, String name,PieceType type) {
		super();
		this.id = id;
		this.name = name;
		this.type=type;
		rowSum=new int[10000000];
		colSum=new int[10000000];
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PieceType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
}
