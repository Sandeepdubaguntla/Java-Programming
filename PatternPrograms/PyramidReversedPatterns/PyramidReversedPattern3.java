import java.util.Scanner;
/*
     Pattern:
	   
		5 e 5 e 5 e 5 e 5
		  d 4 d 4 d 4 d
		    3 c 3 c 3
		      b 2 b
		        1

*/
class PyramidReversedPattern3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star = row*2 -1;
		int space = 0;
		char ch = (char) ( 'a' + row - 1);
		int n=row;
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
					System.out.print(n+" ");
				else
					System.out.print(ch+" ");
				count++;
			}
			star = star - 2;
			space++;
			ch--;
			n--;
			
			System.out.println();
		}
	}
}
