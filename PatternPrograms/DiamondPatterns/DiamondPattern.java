import java.util.Scanner;
/*
	Pattern:
		
		            *
		          * * *
		        * * * * *
		      * * * * * * *
		        * * * * *
		          * * *
		            *

*/
class  DiamondPattern
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star = 1;
		int space = row - 1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*"+" ");
			}
			if(i <= row/2)
			{
				star = star + 2;
				space--;
			}
			else
			{
				star = star - 2;
				space++;
			}
			System.out.println();
		}
	}
}
