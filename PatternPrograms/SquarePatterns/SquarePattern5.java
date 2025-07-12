import java.util.Scanner;

/*
 Pattern :

     a a a a 
	 b b b b 
	 c c c c 
	 d d d d 
	 
*/
class SquarePattern5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		char ch = 'a';

		for(int i=1;i <= row ; i++)
		{
			for(int j=1; j <= col ; j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}

	}
}
