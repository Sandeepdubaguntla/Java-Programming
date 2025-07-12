//write a program check weather the given number is grather than 1 and lessthan 11
import java.util.Scanner;
class  Code
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...........");
		int n=sc.nextInt();
		if(n>1&&n<11)
		{
			System.out.println("The condition satisfied");
		}
		else
		{
			System.out.println("The is not satisfied");
		}

	}
}
