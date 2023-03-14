package TicTacToe;

public class Player {

	private int id;
	private String name;
	private PieceType type;
	public Player(int id, String name,PieceType type) {
		super();
		this.id = id;
		this.name = name;
		this.type=type;
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
