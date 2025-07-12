import java.util.Scanner;

/*
      Pattern:

	    a b c d e d c b a
		  a b c d c b a
		    a b c b a
		      a b a
		        a
				

*/

class PyramidReversedPatternWithPalindromicAlphabets
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Rows...");
		int row=sc.nextInt();
		int star=row*2 - 1;
		int space = 0;
		
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k <= star/2 )
					System.out.print(ch++ + " ");
				else
					System.out.print(ch-- +" ");
			}
			star = star - 2;
			space ++ ;
			System.out.println();
		}
	}
}
