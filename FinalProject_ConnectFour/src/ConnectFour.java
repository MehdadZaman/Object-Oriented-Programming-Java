/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
import java.util.Scanner;
public class ConnectFour {
	public static void main(String[] args)
	{
		boolean tie = true;
		Scanner stdin = new Scanner(System.in);
		int user_inp;
		int turn = 0;
		System.out.println("Hello. Welcome to my Connect Four Game!");
		System.out.println("This is the board that you will be playing on:");
		String[][] board = new String[7][7];
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				board[i][j] = " ";
			}
		}
		for(int j = 0; j < board[(board.length - 1)].length; j++)
		{
			board[(board.length - 1)][j] = "-";
		}
		for(int i = 0; i < (board.length - 1); i++)
		{
			System.out.print("|");
			for(int j = 0; j < board[i].length; j++)
			{
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
		}
		System.out.print("-");
		for(int j = 0; j < board[(board.length - 1)].length; j++)
		{
			System.out.print(board[(board.length - 1)][j] + "-");
		}
		System.out.println("");
		while(isntfull(board))
		{
			if(turn % 2 == 0)
			{
				System.out.print("Drop a red disk at column (0 - 6): ");
				user_inp = stdin.nextInt();
				try
				{
					for(int i = 0; i < board.length; i++)
					{
						if(!(board[i][user_inp].equals(" ")))
						{
							board[i - 1][user_inp] = "R";
							break;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					if(user_inp >= 0 && user_inp <= 6)
					{
						System.out.println("The column is full");
					}
					else
					{
						System.out.println("That is not a proper column");
					}
				}
				turn++;
			}
			else
			{
				System.out.print("Drop a yellow disk at column (0 - 6): ");
				user_inp = stdin.nextInt();
				try
				{
					for(int i = 0; i < board.length; i++)
					{
						if(!(board[i][user_inp].equals(" ")))
						{
							board[i - 1][user_inp] = "Y";
							break;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					if(user_inp >= 0 && user_inp <= 6)
					{
						System.out.println("The column is full");
					}
					else
					{
						System.out.println("That is not a proper column");
					}
				}
				turn++;
			}
			for(int i = 0; i < (board.length - 1); i++)
			{
				System.out.print("|");
				for(int j = 0; j < board[i].length; j++)
				{
					System.out.print(board[i][j] + "|");
				}
				System.out.println();
			}
			System.out.print("-");
			for(int j = 0; j < board[(board.length - 1)].length; j++)
			{
				System.out.print(board[(board.length - 1)][j] + "-");
			}
			System.out.println("");
			if(diagchecker(board, "R") || vertichecker(board, "R") || horizchecker(board, "R"))
			{
				System.out.println("The red player won.");
				tie = false;
				break;
			}
			else if(diagchecker(board, "Y") || vertichecker(board, "Y") || horizchecker(board, "Y"))
			{
				System.out.println("The yellow player won");
				tie = false;
				break;
			}
		}
		if(tie)
		{
			System.out.println("Tie Game");
		}
		stdin.close();
	}
	public static boolean diagchecker(String[][] board, String inp)
	{
		boolean returnval = false;
		boolean retleft = false, retright = false;
		int diagleftcounter = 0, diagrightcounter = 0;
		boolean leftcheck = true;
		boolean rightcheck = true;
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				try
				{
					leftcheck = true;
					int rowleftcheck = i, colleftcheck = j;
					while(leftcheck)
					{
						if(board[rowleftcheck][colleftcheck].equals(inp))
						{
							diagleftcounter++; rowleftcheck--; colleftcheck--;
						}
						else
						{
							diagleftcounter = 0;
							leftcheck = false;
						}
						if(diagleftcounter == 4)
						{
							retleft = true;
							leftcheck = false;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					leftcheck = false;
					retleft = false;
					diagleftcounter = 0;
				}
				try
				{
					rightcheck = true;
					int rowrightcheck = i, colrightcheck = j;
					while(rightcheck)
					{
						if(board[rowrightcheck][colrightcheck].equals(inp))
						{
							diagrightcounter++; rowrightcheck--; colrightcheck++;
						}
						else
						{
							diagrightcounter = 0;
							rightcheck = false;
						}
						if(diagrightcounter == 4)
						{
							rightcheck = false;
							retright = true;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					rightcheck = false;
					retright = false;
					diagrightcounter = 0;
				}
				if(retleft || retright)
				{
					returnval = true;
					break;
				}
			}
			if(retleft || retright)
			{
				break;
			}
		}
		return returnval;
	}
	public static boolean vertichecker(String[][] board, String inp)
	{
		boolean retvert = false;
		boolean verticheck = false;
		int inpcount = 0;
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				try
				{
					verticheck = true;
					int rowcheck = i;
					while(verticheck)
					{
						if(board[rowcheck][j].equals(inp))
						{
							inpcount++; rowcheck++;
						}
						else
						{
							verticheck = false;
							inpcount = 0;
						}
						if(inpcount == 4)
						{
							retvert = true;
							verticheck = false;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					verticheck = false;
					retvert = true;
					inpcount = 0;
				}
				if(retvert)
				{
					break;
				}
			}
			if(retvert)
			{
				break;
			}
		}
		return retvert;
	}
	public static boolean horizchecker(String[][] board, String inp)
	{
		boolean rethoriz = false;
		boolean horizcheck = false;
		int inpcount = 0;
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				try
				{
					horizcheck = true;
					int colcheck = j;
					while(horizcheck)
					{
						if(board[i][colcheck].equals(inp))
						{
							inpcount++; colcheck++;
						}
						else
						{
							horizcheck = false;
							inpcount = 0;
						}
						if(inpcount == 4)
						{
							rethoriz = true;
							horizcheck = false;
						}
					}
				}
				catch(IndexOutOfBoundsException ex)
				{
					horizcheck = false;
					rethoriz = false;
					inpcount = 0;
				}
				if(rethoriz)
				{
					break;
				}
			}
			if(rethoriz)
			{
				break;
			}
		}
		return rethoriz;
	}
	public static boolean isntfull(String[][] board)
	{
		int emptyspacect = 0;
		boolean torf = true;
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{

				if(!(board[i][j].equals(" ")))
				{
					emptyspacect++;
				}
			}
		}
		if(emptyspacect == ((board.length * board[0].length)))
		{
			torf = false;
		}
		else
		{
			torf = true;
		}
		return torf;
	}
}
