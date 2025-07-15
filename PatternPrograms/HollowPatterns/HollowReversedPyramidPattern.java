import java.util.Scanner;
/*
	Pattern:
		
		* * * * * * * * *
		  *           *
		    *       *
		      *   *
		        *

*/
class HollowReversedPyramidPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		int star=row;
		int space=0;
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				if (k==1||k==star||i==1)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			space++;
			star=star-2;
			System.out.println();

		}
	}
}

