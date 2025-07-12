import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for Factorial ...");
		int num = sc.nextInt();
		System.out.println("The factorial of the number "+num+" is ");
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
