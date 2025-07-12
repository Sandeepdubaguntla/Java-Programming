import java.util.Scanner;
/*
   Pattern:
      
	   
       * * * *
	   *       *
	   * * * *
	   *     *
	   *       *

   Note: This will only satisfy if rows and cols are equal. 
*/
class AlphabeticalPatternforR
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		//if(row % 2 == 0)
		//	row++;
		//if(col % 2 ==0)
		//	col++;
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=col ; j++)
			{
				if(( i == 1 && j!=col) || (j == 1) || (i==row/2 + 1 && j!=col) || (j == col && i<row/2+1 && i!=1) || (i == j && i>row/2)) 
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
