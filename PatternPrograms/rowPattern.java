import java.util.Scanner;
/*
  *
  *
  *
  *
  *
*/
class rowPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No.of rows :");
		int row =sc.nextInt();
		for(int i=1 ; i <= row ; i++)
		{
			System.out.println("*");
		}
	}
}
