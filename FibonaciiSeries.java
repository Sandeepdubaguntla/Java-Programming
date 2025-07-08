import java.util.Scanner;

/*
  The Fibonacci series is a sequence of numbers where each number 
  is the sum of the two preceding ones, typically starting with 0 and 1.
  The sequence begins: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. 

*/
class FibonaciiSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which you want Fibonacii Series...");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=num;i++){
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println();
	}
}
