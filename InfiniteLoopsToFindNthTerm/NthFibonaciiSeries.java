import java.util.Scanner;
/*
	The Fibonanci Series from Nth Number.

*/
class NthFibonaciiSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number upto which you want Fibonacii Series...");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<num;i++){
			
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.print(a+" ");
		System.out.println();
	}
}
