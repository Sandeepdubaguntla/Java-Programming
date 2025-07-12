import java.util.Scanner;
/*
    Pattern:


	        1
	      1 2 3		
	    1 2 3 4 5
	  1 2 3 4 5 6 7
	1 2 3 4 5 6 7 8 9


*/
class  PyramidPattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star=1;
		int space=row-1;
		int n=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(n++ + " ");
			}

			star=star+2;
			space --;
			n=1;
			System.out.println();
		}
	}
}
