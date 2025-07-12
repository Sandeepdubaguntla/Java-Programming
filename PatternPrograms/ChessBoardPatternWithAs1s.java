import java.util.Scanner;
/*
   pattern:


       A 1 A 1 A
	   1 A 1 A 1
	   A 1 A 1 A
	   1 A 1 A 1
	   A 1 A 1 A
	   

*/

class ChessBoardPatternWithAs1s
{   // Shelf Approach
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the Number of cols");
		int col=sc.nextInt();
		int n=1;
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=col;j++)
			{
				if((i+j) % 2 == 0)
					System.out.print("A" + " ");
				else
					System.out.print("1" + " ");
			}
			System.out.println();
		}

	}

}
