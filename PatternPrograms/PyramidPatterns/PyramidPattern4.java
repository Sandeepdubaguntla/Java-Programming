import java.util.Scanner;
/*
    Pattern:

		
	           a
	         b b b
	       c c c c c
	     d d d d d d d
	   e e e e e e e e e
	         
*/
class  PyramidPattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star=1;
		int space=row-1;
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" " + " ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(ch + " ");
			}

			star=star+2;
			space --;
			ch++;
			System.out.println();
		}
	}
}
