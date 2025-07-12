import java.util.Scanner;
/*
   Pattern:
   
         a
       b b
     c c c
   d d d d

*/

class  MirroredRightAngledPattern1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j >= row+1)
					System.out.print(ch+" " );
				else
					System.out.print(" "+" ");
			}
			System.out.println();
			ch++;
		}
	}
}
