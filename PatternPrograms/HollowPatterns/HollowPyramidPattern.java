import java.util.Scanner;
/*
	Pattern:
		            *
		          *   *
		        *       *
		      *           *
		    *               *
		  *                   *
		* * * * * * * * * * * * *
*/
class HollowPyramidPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		int star=1;
		int space=row-1;
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				if (k==1||k==star||i==row)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			space--;
			star=star+2;
			System.out.println();

		}
	}
}

