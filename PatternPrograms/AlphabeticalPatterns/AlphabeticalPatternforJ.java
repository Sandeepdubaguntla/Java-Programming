import java.util.Scanner;
/*
   Pattern:
      
	  * * * * * 
	      *
      *   *
	  *	  *   
	  * * * 

   Note: This will only satisfy if rows and cols are equal. 
*/
class AlphabeticalPatternforJ
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		//if(row % 2 == 0 || col % 2 == 0)
		//{
		//	row++;
		//	col++;
		//}
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=col ; j++)
			{
				if((i == 1) || (j == 1 && i>=row/2 +1 && i!=row) 
					|| (i == row && j<=col/2 +1 && j!=1 && j!=col/2+1) 
					|| (j == col/2 +1 && i!=row))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
