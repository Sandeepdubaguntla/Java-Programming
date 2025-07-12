import java.util.Scanner;
/*
   pattern:


       1 0 1 0 1
	   0 1 0 1 0
	   1 0 1 0 1
	   0 1 0 1 0
	   1 0 1 0 1

*/

class ChessBoardPattern
{   // Decrement Approach
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
				System.out.print(n-- + " ");
				if(n == -1)
					n=1;
			}
			System.out.println();
		}
		/*
	        	or 
		int count =0;
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(count % 2 == 0)
					System.out.print("1" + " ");
				else
					System.out.print("0" + " ");
				count++;
			}
			System.out.println();
		}
        */
	}

}
