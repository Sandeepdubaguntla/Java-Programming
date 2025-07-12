import java.util.Scanner;
/*
    Pattern :

   *       *
	 *   * 
	   *
	   *
	   *
    
*/
class AlphabeticalPatternforY
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
			for(int j=1 ; j<=row ; j++)
			{
				if((i==j && i<row/2+1) || ((i+j)==row+1 && i<row/2+1) || (j == col/2+1 && i>=row/2+1))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}
