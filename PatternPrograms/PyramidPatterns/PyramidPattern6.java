import java.util.Scanner;
/*
    Pattern:

	Floyds alphabetical Pattern:	

	          a
	        b c d
	      e f g h i
	    j k l m n o p
	  q r s t u v w x y       

*/
class  PyramidPattern6
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
				System.out.print(ch++ + " ");
			}

			star=star+2;
			space --;
			
			System.out.println();
		}
	}
}
