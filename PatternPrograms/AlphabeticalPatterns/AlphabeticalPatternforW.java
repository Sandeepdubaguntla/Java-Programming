import java.util.Scanner;
/*
   Pattern:
      
	   *        *
	   *        * 
           *   *    *
	   * *    * *
	   *        *

   Note: This will only satisfy if rows and cols are equal. 
*/
class AlphabeticalPatternforW
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		if(row % 2 == 0)
			row++;
		if(col % 2 ==0)
			col++;
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=col ; j++)
			{
				if(( j==1 ) || (j == col) || (i==j && i>=row/2 + 1) || (i+j == row+1 && i>=row/2+1) )
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
