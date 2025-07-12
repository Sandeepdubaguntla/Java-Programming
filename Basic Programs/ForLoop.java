import java.util.Scanner;
class ForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n value...");
		int n=sc.nextInt();
		System.out.println("Enter  N natural numbers");
		for( int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
