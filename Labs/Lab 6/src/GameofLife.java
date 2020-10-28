import java.util.Arrays;
/*
 * Assignment: Lab 6
 * Author: Austin Lynn User: auslynn
 * Last Updated : 2/26/20
 */
public class GameofLife {

	private boolean[][] board;
	private final int NUMROW;
	private final int NUMCOL;
	
	public GameofLife(boolean[][] initialBoard) {
		NUMROW = initialBoard.length;
		NUMCOL = initialBoard[0].length;
		board = new boolean[NUMROW][NUMCOL];
		for (int i = 0; i < NUMROW; i++)
		{
			for (int j = 0; j < NUMCOL; j++)
			{
				board[i][j] = initialBoard[i][j];
			}
		}
		
		
		
	}
	public String toString() 
	{
		int rowNum = NUMROW;
		int colNum = NUMCOL;
		
		String matString = "";
		
		boolean[][] mat = board;
		
		for(int i = 0; i < rowNum; i++)
		{
			if (i < rowNum)
			{
				for (int j = 0; j < colNum; j++)
				{
					if (j < (colNum - 1))
					{
						matString = matString + toStringHelper(mat[i][j]) + " ";
					}
					else
					{
						matString = matString + toStringHelper(mat[i][j]) + "\n"; 
					}
				}
			}
		}
		
		return matString;
	}
	
	public static String toStringHelper(boolean inputBool)
	{
		String boolStr = "o";
		
		if (inputBool == false)
		{
			 boolStr = "+";
		}
		return boolStr;
	}
	
	public void grow(int generation, int freqPrint) 
	{
		for (int i = 0; i <= generation; i++)
		{
			boolean[][] liveBoard = new boolean[NUMROW][NUMCOL];
			
			for (int z = 0; z < this.board.length; z++)
			{
				liveBoard[z] = Arrays.copyOf(this.board[z], this.board[z].length);
			}
			for (int j = 0; j < NUMROW; j++)
			{
				for (int k = 0; k < NUMCOL; k++)
				{
					if (checkNeighbor(j, k) > 3)
					{
						liveBoard[j][k] = false;
					}
					if (checkNeighbor(j, k) == 3)
					{
						liveBoard[j][k] = true;
					}
					if (checkNeighbor(j, k) == 2 && this.board[j][k] == true)
					{
						liveBoard[j][k] = true;
					}
					if (checkNeighbor(j, k) < 2)
					{
						liveBoard[j][k] = false;
					}
					
				}
			}
		}
	}
	
	private int checkNeighbor(int x, int y) 
	{
		int numNeighbors = 0;
		int farRow = this.NUMROW - 1;
		int farCol = this.NUMCOL - 1;
		
		if (x == 0)
		{
			if (y == farCol) // bottom left corner
			{
				numNeighbors =  isAlive(this.board[x+1][y-1]) + isAlive(this.board[x][y-1]) + isAlive(this.board[x+1][y]);
			}
			else if (y == 0) // top left corner
			{
				numNeighbors = isAlive(this.board[x+1][y+1]) + isAlive(this.board[x+1][y]) + isAlive(this.board[x][y+1]);
			}
			else //rest of the top row 
			{
				for (int i = 0; i <= x; i++)
				{
					for (int j = 0; j <= y; j++)
					{
						numNeighbors = numNeighbors + isAlive(this.board[i][j]);
					}
				}
				if(this.board[x][y] == true) // subtracts one if the current space is alive this took forever
				{
					numNeighbors = numNeighbors - 1;
				}
			}
		}
		else if (x == farRow)
		{
			if (y == farCol) //bottom right corner
			{
				numNeighbors =  isAlive(this.board[x-1][y+1]) + isAlive(this.board[x-1][y]) + isAlive(this.board[x][y+1]);
			}
			else if (y == 0) // top right corner
			{
				numNeighbors = isAlive(this.board[x-1][y-1]) + isAlive(this.board[x-1][y]) + isAlive(this.board[x][y-1]);
			}
			else
			{
				for (int i = 0; i <= x; i++)
				{
					for (int j = 0; j <= y; j++)
					{
						numNeighbors = numNeighbors + isAlive(this.board[i][j]);
					}
				}
				if (this.board[x][y] == true)
				{
					numNeighbors = numNeighbors - 1;
				}
			}
		}
		else //rest
		{
			if (y == 0)
			{
				for (int i = x - 1; i <= x + 1; i++)
				{
					for (int j = y; j <= y + 1; j++)
					{
						numNeighbors = numNeighbors + isAlive(this.board[i][j]);
					}
				}
				if (this.board[x][y] == true)
				{
					numNeighbors = numNeighbors - 1;
				}
			}
			else if (y == farCol)
			{
				for (int i = x-1; i <= x + 1; i++)
				{
					for (int j = y - 1; j <= y; j++)
					{
						numNeighbors = numNeighbors + isAlive(this.board[i][i]);
					}
				}
				if (this.board[x][y] == true)
				{
					numNeighbors = numNeighbors - 1;
				}
			}
			else
			{
				for (int i = x - 1; i <= x + 1; i++)
				{
					for (int j = y - 1; j <= y + 1; j++)
					{
						numNeighbors = numNeighbors + isAlive(this.board[i][j]);
					}
				}
				if (this.board[x][y] == true)
				{
					numNeighbors = numNeighbors - 1;
				}
			}
		}
		return numNeighbors;
	}
	
	private int isAlive(boolean space)
	{
		int alive = 0;
		if (space == true)
		{
			alive = 1;
		}
		return alive;
	}
	
	
	public int generation;
	
	public void setGen(int generation)
	{
		this.generation = generation;
	}
	
	public int freqPrint;
	
	public void setFPrint(int freqPrint)
	{
		this.freqPrint = freqPrint;
	}
}
