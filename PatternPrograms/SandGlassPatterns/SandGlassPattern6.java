import java.util.Scanner;

/*
	Pattern:
		
		A 1 A 1 A 1 A
		  A 1 A 1 A
		    A 1 A
		      A
		    A 1 A
		  A 1 A 1 A
		A 1 A 1 A 1 A

*/
class SandGlassPattern6
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
					System.out.print("A"+" ");
				    

				}
				else
				{
					System.out.print("1"+" ");
				    
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
