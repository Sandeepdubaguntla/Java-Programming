import java.util.Scanner;

/*
 Pattern :

     A A A A
	 1 1 1 1
	 A A A A
	 1 1 1 1

*/
class SquarePattern13
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
				if(i % 2 == 0)
					System.out.print("1"+" ");
				else
					System.out.print("A"+" ");
			}
			System.out.println();
		}

	}
}
