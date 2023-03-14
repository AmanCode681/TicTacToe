package TicTacToe;

public class PieceX implements PieceType{


char ch;
	public char getCh() {
	return ch;
}
public void setCh(char ch) {
	this.ch = ch;
}
	public PieceX() {
		super();
		ch='X';
	}
	@Override
	public String toString() {
		return "" + ch + "";
	}
	
	
}
