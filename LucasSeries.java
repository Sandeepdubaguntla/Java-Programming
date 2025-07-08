import java.util.Scanner;
/*
    The Lucas series is a sequence of numbers similar to the Fibonacci sequence, 
	where each number is the sum of the two preceding ones. The key difference lies in the initial values:
    Lucas Series: Starts with L0 = 2 and L1 = 1.
    Fibonacci Series: Starts with F0 = 0 and F1 = 1 (or F0 = 1, F1 = 1 depending on the definition).



*/
class LucasSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which you want the LucasSeries");
		int num=sc.nextInt();
		int a=2;
		int b=1;
		int sum=0;
		for(int i=1;i<=num;i++){
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}
