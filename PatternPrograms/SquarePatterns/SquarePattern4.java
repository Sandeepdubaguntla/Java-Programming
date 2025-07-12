import java.util.Scanner;

/*
 Pattern :

     1 2 3 4
	 1 2 3 4
	 1 2 3 4
	 1 2 3 4 
	 
*/
class SquarePattern4
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
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
