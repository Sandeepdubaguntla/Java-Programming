import java.util.Scanner;
/*
   Pattern:
      
	  * * * * * 
	  *       *
	  *       *
	  *       *
	  * * * * *

   Note: This will only satisfy if rows and cols are equal. 
*/
class SquarePatternWithStar1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=col ; j++)
			{
				if(i == 1 || j == 1 || i == row || j == col)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
