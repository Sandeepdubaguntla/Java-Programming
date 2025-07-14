import java.util.Scanner;
/*
	Pattern:
		
		            a
		          a b a
		        a b c b a
		      a b c d c b a
		        a b c b a
		          a b a
		            a
*/
class DiamondPatternWithPalindromeAlphabets
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
			char ch='a';
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				if (k<=star/2)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
				{
					System.out.print(ch+" ");
					ch--;
				}
			}
			if (i<=row/2)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}
}
