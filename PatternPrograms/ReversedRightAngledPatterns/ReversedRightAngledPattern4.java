import java.util.Scanner;
/*
   Pattern:
   
	1 0 1 0 1
	1 0 1 0
	1 0 1
	1 0
	1

*/

class  ReversedRightAngledPattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j <= row+1)
				{
					if(j % 2 == 0)
						System.out.print("0"+" " );
					else
						System.out.print("1"+" ");
				}
				else
					System.out.print(" "+" ");
			}
			
			System.out.println();
		}
	}
}
