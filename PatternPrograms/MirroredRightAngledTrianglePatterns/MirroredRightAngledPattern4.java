import java.util.Scanner;

/*
    Pattern:
	           1
	         0 1
	       0 1 0
	     1 0 1 0
	   1 0 1 0 1

*/
class MirroredRightAngledPattern4 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int count=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j >= row+1)
				{
					if(count % 2 == 0)
						System.out.print("1"+" ");
					else
						System.out.print("0"+" ");
					count++;
				}
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
