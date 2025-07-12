import java.util.Scanner;

/*
    Pattern:
		
		
		5 4 3 2 1 2 3 4 5
		  5 4 3 2 3 4 5
		    5 4 3 4 5
		      5 4 5
		        5
*/


class  PyramidReversedPatternWithMirroredNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Rows...");
		int row=sc.nextInt();
		int star=row*2 - 1;
		int space = 0;
		int n=row;
		for(int i=1;i<=row;i++)
		{
			int m = n;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k <= star/2 )
					System.out.print(m-- + " ");
				else
					System.out.print(m++ +" ");
			}
			star = star - 2;
			space ++ ;
			m++;
			System.out.println();
		}
	}
}
