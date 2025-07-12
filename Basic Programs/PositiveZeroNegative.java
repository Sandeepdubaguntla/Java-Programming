import java.util.Scanner;

class PositiveZeroNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number........");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is Positive");
		}
		else if(n<0)
		{
			System.out.println(n+" is Negative");
		}
		else
		{
			System.out.println(n+" is Zero");
		}
	}
}
