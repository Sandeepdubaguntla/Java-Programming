 vimport java.util.Scanner;
class QufientAndReminder 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		int quficent=a/b;
		int reminder=a%b;
		System.out.println("quficent of two numbers:-"+quficent);
		System.out.println("reminder of two numbers:-"+reminder);
	}
}
