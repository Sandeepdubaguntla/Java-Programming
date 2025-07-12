import java.util.Scanner;
/*
    Pattern:

	        1
	      1 0 1
	    1 0 1 0 1
	  1 0 1 0 1 0 1
	1 0 1 0 1 0 1 0 1

*/

class  PyramidPattern8
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
			int count=0;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(count % 2 == 0)
					System.out.print("1"+" ");

				else
					System.out.print("0"+" ");
				count++;
				
			}
			star=star+2;
			space--;
			
			System.out.println();
		}
		
	}
}

// Are tou can use k%2==0 in the if block instead of count.