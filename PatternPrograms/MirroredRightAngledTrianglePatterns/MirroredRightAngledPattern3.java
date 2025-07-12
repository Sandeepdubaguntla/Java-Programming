import java.util.Scanner;
/*
    Pattern:
	 
	           a     
	         a b
	       a b c
	     a b c d
	   a b c d e


*/
class MirroredRightAngledPattern3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j >= row+1)
				{
					System.out.print(ch++ +" ");
				}
				else
					System.out.print(" "+" ");

			}
			ch='a';
			System.out.println();
		}
	}
}
