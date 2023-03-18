package TicTacToe;

public class Board {

	int filledSpaces=0;
	PieceType[][] pieceType;
	
	Board(int n)
	{
		this.pieceType=new PieceType[n][n];
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
	public boolean checkWinner2(Player p,int r,int c)
	{
		int[] rowSum=p.getRowSum();
		int[] colSum=p.getColSum();
		int mainDiagonal=p.getMainDiagonal();
		int reverseDiagonal=p.getReverseDiagonal();
		int n=pieceType.length;
		
		rowSum[r]++;
		colSum[c]++;
		if(r==c)
			mainDiagonal++;
		if(r+c==n)
			reverseDiagonal++;
		
		p.setRowSum(rowSum);
		p.setColSum(colSum);
		p.setMainDiagonal(mainDiagonal);
		p.setReverseDiagonal(reverseDiagonal);
		
		if(rowSum[r]==n || colSum[c]==n || mainDiagonal==n || reverseDiagonal==n)
			return true;
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean checkWinner(int r,int c,char ch) {
	if(r<0 || c<0 || r>=pieceType.length || c>=pieceType.length)
			return true;
		boolean rowCheck=true,colCheck=true,mainDiagonalCheck=false,reverseDiagonalCheck=false;
		
		for(int i=0;i<pieceType.length;i++)
		{
			if(pieceType[r][i]==null || pieceType[r][i].getCh()!=ch)
			{
				rowCheck=false;
				break;
			}
		}
		for(int i=0;i<pieceType.length;i++)
		{
			if(pieceType[i][c]==null || pieceType[i][c].getCh()!=ch)
			{
				colCheck=false;
				break;
			}
		}
		if(r!=c && (r+c)!=(pieceType.length))
			return rowCheck||colCheck;
		if(r==c)
		{
		for(int i=0;i<pieceType.length;i++)
		{
			if(pieceType[i][i]==null || pieceType[i][i].getCh()!=ch)
			{
				mainDiagonalCheck=false;
				break;
			}
			else
			{
				mainDiagonalCheck=true;
			}
		}
		}
		if(r+c==pieceType.length)
		{
			for(int i=0;i<pieceType.length;i++)
			{
				if(pieceType[i][pieceType.length-1-i]==null || pieceType[i][pieceType.length-1-i].getCh()!=ch)
				{
					reverseDiagonalCheck=false;
					break;
				}
				else
				{
					reverseDiagonalCheck=true;
				}
			}
		}
		return rowCheck || colCheck || mainDiagonalCheck || reverseDiagonalCheck;
		
	}
}
