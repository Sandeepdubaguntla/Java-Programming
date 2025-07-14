import java.util.Scanner;
/*
	Pattern:

		1 2 3 4 5 6 7
		  1 2 3 4 5
		    1 2 3
		      1
		    1 2 3
		  1 2 3 4 5
		1 2 3 4 5 6 7
*/
class SandGlassPattern1 
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
			int num=1;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				
				System.out.print(num+" ");
				num++;
			}
			if (i<=row/2)
			{
				space++;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
}
