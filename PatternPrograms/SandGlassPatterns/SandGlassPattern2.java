import java.util.Scanner;
/*
	Pattern:

		1 2 3 4 5 6 7
		  a b c d e
		    1 2 3
		      a
		    1 2 3
		  a b c d e
		1 2 3 4 5 6 7
*/

class SandGlassPattern2 
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
			char ch='a';
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				if (i%2==1)
				{
					System.out.print(num+" ");
				    num++;

				}
				else
				{
					System.out.print(ch+" ");
				    ch++;
				}
				
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
