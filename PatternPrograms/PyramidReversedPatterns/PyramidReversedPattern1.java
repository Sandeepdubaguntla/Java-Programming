import java.util.Scanner;
/*
     Pattern:
	   
	  5 5 5 5 5 5 5 5 5
	    4 4 4 4 4 4 4
	      3 3 3 3 3
	        2 2 2
	          1


*/
class PyramidReversedPattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star = row*2 -1;
		int space = 0;
		int n=row;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(n+" ");
			}
			star = star - 2;
			space++;
			n--;
			System.out.println();
		}
	}
}
