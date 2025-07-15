import java.util.Scanner;
/*
     Pattern:
		
		4 3 2 1 2 3 4
		  3 2 1 2 3
		    2 1 2
		      1
		    2 1 2
		  3 2 1 2 3
		4 3 2 1 2 3 4            

*/
class MirrorSandGlassPatternWithPalindromeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		int star=row;
		int space=0;
		int num=row/2+1;
		for (int i=1;i<=row ;i++ )
		{
			
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			int n=num;
			for (int k=1;k<=star ;k++ )
			{
				if (k<=star/2)
				{
					System.out.print(n+" ");
					n--;
				}
				else
				{
					System.out.print(n+" ");
					n++;
				}
			}
			if (i<=row/2)
			{
				space++;
				star=star-2;
				num--;
			}
			else
			{
				space--;
				star=star+2;
				num++;
			}
			
			System.out.println();
		}
	}
}
