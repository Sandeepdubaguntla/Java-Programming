import java.util.Scanner;
/*
    Pattern:
	 
	         1
	       1 2
	     1 2 3
	   1 2 3 4
	 1 2 3 4 5



*/
class MirroredRightAngledPattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int n=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j >= row+1)
				{
					System.out.print(n++ +" ");
				}
				else
					System.out.print(" "+" ");

			}
			n=1;
			System.out.println();
		}
	}
}
