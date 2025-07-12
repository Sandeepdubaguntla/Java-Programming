import java.util.Scanner;
/*
   Pattern:
      
	  * * * * * 
	  	  *
		  *
          *	  
 	  * * * * *

   Note: This will only satisfy only for odd no.of rows. 
*/
class SquarePatternWithStar3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		if(row % 2 == 0){
			row++;
		}
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=row ; j++)
			{
				if(i == 1 || i == row || j == row/2 + 1)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
