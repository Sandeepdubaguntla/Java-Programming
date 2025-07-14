import java.util.Scanner;
/*
   Pattern:
	
	            a
	          b a b
	        c b a b c
	      d c b a b c d
	        c b a b c
	          b a b
	            a

*/
class MirrorDiamondPatternWithPalindromeAlphabets
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		int star=1;
		int space=row-1;
		char ch='a';
		for (int i=1;i<=row ;i++ )
		{
			
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			char m=ch;
			for (int k=1;k<=star ;k++ )
			{
				if (k<=star/2)
				{
					System.out.print(m+" ");
					m--;
				}
				else
				{
					System.out.print(m+" ");
					m++;
				}
			}
			if (i<=row/2)
			{
				space--;
				star=star+2;
				ch++;
			}
			else
			{
				space++;
				star=star-2;
				ch--;
			}
			
			System.out.println();
		}
	}
}
