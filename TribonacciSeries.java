import java.util.Scanner;
/*
    The Tribonacci series is a sequence of numbers in which 
	each term is the sum of the three preceding terms. 
	It is similar to the Fibonacci sequence, but instead of 
	summing the two previous terms, it sums the three previous terms. 
	The most common starting values for the Tribonacci series are 0, 0, and 1. 

*/
class TribonacciSeries  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which Tribonacci Series is needed");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int sum=0;
		for(int i=1;i<=num;i++){
			System.out.print(a+" ");
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
		}

	}
}
