import java.util.Scanner;
/*
     Pattern:
	   
		e e e e e e e e e	  
		  d d d d d d d
		    c c c c c
		      b b b
		        a

*/
class PyramidReversedPattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star = row*2 -1;
		int space = 0;
		char ch = (char) ( 'a' + row - 1);
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(ch+" ");
			}
			star = star - 2;
			space++;
			ch--;
			System.out.println();
		}
	}
}
