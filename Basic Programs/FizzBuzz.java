
import java.util.Scanner;

class  FizzBuzz
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number.....");
		int n=sc.nextInt();

		if(n%3==0 && n%5==0)
		{
			System.out.println(n+" This is FizzBuzz Number....");
		}
		else if(n%3==0)
		{
			System.out.println(n+" This is Fizz Number.....");
		}
		else if(n%5==0)
		{
			System.out.println(n+" This is Buzz Number...");
		}
		else
		{
			System.out.println(n+" This is Not FizzBuzz Number......");
		}
	}
}
