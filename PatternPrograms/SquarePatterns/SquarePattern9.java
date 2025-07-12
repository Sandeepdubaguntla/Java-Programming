import java.util.Scanner;

/*
 Pattern :

     1 a 2 b
	 3 c 4 d
	 5 e 6 f
	 7 g 8 h
	 
*/
class SquarePattern9
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
				if(j % 2 == 0)
					System.out.print(ch++ + " ");
				else
					System.out.print(n++ + " ");
			}
			
			System.out.println();
		}
	}
}
