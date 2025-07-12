import java.util.Scanner;

/*
 Pattern :

     a b c d
	 a b c d 
	 a b c d
	 a b c d
	 
*/
class SquarePattern6
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
			char ch = 'a';
			for(int j=1; j <= col ; j++)
			{
				System.out.print(ch+" ");
				ch++; 
			}
			System.out.println();
		}

	}
}
