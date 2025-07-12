
import java.util.Scanner;
class NaturalNos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number...");
		long n=sc.nextLong();
		int i=1;
		
		
		while(i<=n)
		{
			System.out.println(" " +i);
			i++;
		}
	}
}
