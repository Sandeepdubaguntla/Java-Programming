import java.util.Scanner;

/*
    Pattern:

              A
	        1 1		 
	      A A A
	    1 1 1 1
	  A A A A A

	  
*/
class MirroredRightAngledPattern9
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int count=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i+j >= row+1)
				{
					if(count % 2 == 0)
						System.out.print("A"+" ");
					else
						System.out.print("1"+" ");
					
				}
				else
					System.out.print(" "+" ");
				
			}
			count++;
			System.out.println();
		}
	}
}

