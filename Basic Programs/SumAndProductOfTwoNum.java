import java.util.Scanner;
class SumAndProductOfTwoNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		int sum=a+b;
		int product=a*b;
		System.out.println("sum of two numbers:-"+sum);
		System.out.println("product of two numbers:-"+product);

	}
}
