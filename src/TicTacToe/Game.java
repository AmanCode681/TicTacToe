package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

	Board board;
	Deque<Player> players;
	Player Winner;
	Scanner sc;
	public Game()
	{
		players=new LinkedList();
		sc=new Scanner(System.in);
		this.initializeBoard();
		this.registerPlayers(2);
	}

	private void registerPlayers(int i) {
		// TODO Auto-generated method stub
		players.add(new Player(1,"Aman",new PieceX()));
		players.add(new Player(2,"Anurag",new PieceY()));
	}

	private void initializeBoard() {
		// TODO Auto-generated method stub
		this.board=new Board(3,3);
		
	}
	
	public void beginGame()
	{
		while(!board.isFull())
		{
			Player cur=players.getFirst();
			this.board.displayBoard();
			System.out.println("Player "+ cur.getId()+" Enter The row and col no where next piece has to be placed");
			int r=sc.nextInt();
			int c=sc.nextInt();
			if(!board.validPosition(r,c))
			{
				System.out.println("Wrong Position!!! Already Filled Try Again......");
				continue;
			}
			
			else
			{
				this.board.filledSpaces++;
				this.board.pieceType[r][c]=cur.getType();
				if(this.board.checkWinner())
				{
					System.out.println(cur+" player wins the game");
					this.board.displayBoard();
					break;
				}
				else
				{
					players.removeFirst();
					players.addLast(cur);
				}
			}
			
		}
		this.board.displayBoard();
		System.out.println("Game Tied");
	}
	
}
