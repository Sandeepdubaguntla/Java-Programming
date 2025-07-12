import java.util.Scanner;

/*
 Pattern :

     1 2 3 4
	 a b c d
	 1 2 3 4
	 a b c d
	 
*/
class SquarePattern8
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
		     int n=1;
			
			for(int j=1; j <= col ; j++)
			{
				if(i % 2 == 0)
					System.out.print(ch++ + " ");
				else
					System.out.print(n++ + " ");
			}
			
			System.out.println();
		}
	}
}
