import java.util.Scanner;
class VoteEligibility
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age........");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are Eiligible");
		}
		else
		{
			System.out.println("you are not Eligible");
		}
	}
}
