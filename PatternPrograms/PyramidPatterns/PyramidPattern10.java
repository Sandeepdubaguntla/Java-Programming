import java.util.Scanner;
/*
    Pattern:

	        A
	      1 1 1
	    A A A A A
	  1 1 1 1 1 1 1
	A A A A A A A A A

*/

class  PyramidPattern10
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
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i%2==0)
					System.out.print("1"+" ");
				else
					System.out.print("A"+" ");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		
	}
}
