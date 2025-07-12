
import java.util.Scanner;

class  WhileLoop1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name........");
		String name=sc.next();
		System.out.println("How many times you want to Enter....");
		int n=sc.nextInt();
		int i=1;
		
		
		while(i<=n)
		{
			System.out.println("MY NAME IS " +name);
			i++;
		}
	}
}
