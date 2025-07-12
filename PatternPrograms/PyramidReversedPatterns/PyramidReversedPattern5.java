import java.util.Scanner;
/*
     Pattern:
	   
	  1 1 1 1 1 1 1 1 1
	    0 0 0 0 0 0 0
	      1 1 1 1 1
	        0 0 0
	          1

*/
class PyramidReversedPattern5
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
			int count=0;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i % 2 == 0)
			    	System.out.print("0"+" ");
				else
					System.out.print("1"+ " " );
			}
			star = star - 2;
			space++;
			
			System.out.println();
		}
	}
}
