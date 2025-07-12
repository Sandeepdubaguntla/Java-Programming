import java.util.Scanner;
/*
   Pattern:
      
     *
	 *
	 *
	 *
	 * * * * * 

   Note: This will only satisfy if rows and cols are equal. 
*/
class AlphabeticalPatternforL
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=1 ; j<=col ; j++)
			{
				if((j == 1) || (i == row))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
