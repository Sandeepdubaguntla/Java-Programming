import java.util.Scanner;
/*
	Pattern:

		a b c d e f g
		  a b c d e
		    a b c
		      a
		    a b c
		  a b c d e
		a b c d e f g

*/
class SandGlassPattern5
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
			char ch='a';
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				
				System.out.print(ch+" ");
				ch++;
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
