import java.util.Scanner;
/*
    Pattern:

	        1
	      1 2 1
	    1 2 3 2 1
	  1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1

*/

class  PyramidPatternWithPalindromicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star =1;
		int space=row-1;
		
		for(int i=1;i<=row;i++)
		{
			int n=1;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<=star/2)
					System.out.print(n++ +" ");
				else 
					System.out.print(n-- +" ");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		
	}
}
