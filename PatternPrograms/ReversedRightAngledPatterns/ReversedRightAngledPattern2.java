import java.util.Scanner;
/*
   Pattern:
   
	e e e e e
	d d d d
	c c c
	b b
	a

*/

class  ReversedRightAngledPattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		char ch= (char)('a' + row-1);
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j <= row+1)
					System.out.print(ch+" " );
				else
					System.out.print(" "+" ");
			}
			ch--;
			System.out.println();
		}
	}
}
