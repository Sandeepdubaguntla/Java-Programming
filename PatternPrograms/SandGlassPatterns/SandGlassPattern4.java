import java.util.Scanner;

/*
	Pattern:

		1 0 1 0 1 0 1
		  1 0 1 0 1
		    1 0 1
		      1
		    1 0 1
		  1 0 1 0 1
		1 0 1 0 1 0 1
*/
class SandGlassPattern4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=sc.nextInt();
		int star=row;
		int space=0;
		
		for (int i=1;i<=row ;i++ )
		{
			int count=0;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				if (count%2==0)
				{
					System.out.print("1"+" ");
				    

				}
				else
				{
					System.out.print("0"+" ");
				    
				}
				count++;
				
			}
			
			if (i<=row/2)
			{
				space++;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
			System.out.println();
		}
	}
}
