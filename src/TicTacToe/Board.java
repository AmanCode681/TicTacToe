package TicTacToe;

public class Board {

	int filledSpaces=0;
	PieceType[][] pieceType;
	
	Board(int m,int n)
	{
		this.pieceType=new PieceType[m][n];
	}
	
	public void displayBoard()
	{
		int r=pieceType.length;
		int c=pieceType[0].length;
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(pieceType[i][j]!=null)
				{
					System.out.print(pieceType[i][j]+" | ");
				}
				else
				{
					System.out.print("   | ");
				}
			}
			System.out.println();
		}
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		if(filledSpaces==pieceType.length*pieceType[0].length)
			return true;
		return false;
	}

	public boolean validPosition(int r, int c) {
		// TODO Auto-generated method stub
		return pieceType[r][c]==null;
	}

	public boolean checkWinner() {
		
		
		return false;
		
		
	}
}
