import java.util.Scanner;

/*
 Pattern :

     1 1 1 1
	 2 2 2 2
	 3 3 3 3
	 4 4 4 4 
	 
*/
class SquarePattern3
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
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}
