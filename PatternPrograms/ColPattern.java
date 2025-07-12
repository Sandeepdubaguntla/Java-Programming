import java.util.Scanner;
/*
   * * * * * *  
*/

class ColPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No.of cols :");
		int col =sc.nextInt();
		for(int i=1 ; i <= col ; i++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
