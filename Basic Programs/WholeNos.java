
import java.util.Scanner;
class WholeNos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		int n=sc.nextInt();
		System.out.println("The whole numbers is....");
		int i=n;
		
		
		while(i>=0)
		{
			System.out.println(""+i);
			i--;
		}
	}
}
