package TicTacToe;

public class PieceY implements PieceType{

	
char ch;
		public char getCh() {
	return ch;
}
public void setCh(char ch) {
	this.ch = ch;
}
		public PieceY() {
			super();
			ch='Y';
		}
		@Override
		public String toString() {
			
			return "" + ch + "";
		}
		
		
	}

