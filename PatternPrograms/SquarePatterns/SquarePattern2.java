import java.util.Scanner;

/*
 Pattern :

     * @ * @
	 * @ * @
	 * @ * @
	 * @ * @
	 

*/
class SquarePattern2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();

		for(int i=1;i <= row ; i++)
		{
			for(int j=1; j <= col ; j++)
			{
				if(j % 2 == 0)
					System.out.print("@"+" ");
				else
					System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
}
