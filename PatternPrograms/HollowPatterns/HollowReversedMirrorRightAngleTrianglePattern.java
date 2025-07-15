import java.util.Scanner;
/*
	Pattern:
		
		* * * * * * *
		  *         *
		    *       *
		      *     *
		        *   *
		          * *
		            *

*/
class HollowReversedMirrorRightAngleTrianglePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		System.out.println("Enter no of columns");
		int col=sc.nextInt();
		for (int i=1;i<=row ;i++ )
		{
			for (int j=1;j<=col ;j++ )
			{
				if (i==1||j==col||i==j)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
