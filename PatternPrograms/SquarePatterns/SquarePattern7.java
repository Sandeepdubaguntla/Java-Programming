import java.util.Scanner;

/*
 Pattern :

     1 1 1 1
	 a a a a 
	 2 2 2 2
	 b b b b
	 
*/
class SquarePattern7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of rows");
		int row = sc.nextInt();
		System.out.println("Enter the value of Cols");
		int col = sc.nextInt();
		char ch = 'a';
		int n=1;
         
		for(int i=1;i <= row ; i++)
		{
			
			for(int j=1; j <= col ; j++)
			{
				if(i % 2 == 0)
					System.out.print(ch + " ");
				else
					System.out.print(n + " ");
			}
			if(i % 2 == 0)
				ch++;
			else
				n++;
			System.out.println();
		}
	}
}
