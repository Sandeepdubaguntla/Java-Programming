import java.util.Scanner;
/*
     Pattern:
	   
		1 a 2 b 3
		  c 4 d
		    5

*/
class PyramidReversedPattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star = row*2 -1;
		int space = 0;
		//char ch = (char) ( 'a' + row - 1);
		char ch = 'a';
		int n=1;
		int count=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(count % 2 == 0)
					System.out.print(n++ +" ");
				else
					System.out.print(ch++ +" ");
				count++;
			}
			star = star - 2;
			space++;
			
			System.out.println();
		}
	}
}
