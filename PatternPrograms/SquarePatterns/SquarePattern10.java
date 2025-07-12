import java.util.Scanner;

/*
 Pattern :

     1 0 1 0
	 1 0 1 0
	 1 0 1 0
	 1 0 1 0	 

*/
class SquarePattern10
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
					System.out.print("0"+" ");
				else
					System.out.print("1"+" ");
			}
			System.out.println();
		}

	}
}
