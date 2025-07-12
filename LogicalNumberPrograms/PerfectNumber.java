import java.util.Scanner;
/*

    A perfect number in Java, and in mathematics, is a positive integer that is 
	equal to the sum of its proper positive divisors (divisors excluding the number itself). 
	Example:
		The number 6 is a perfect number because its proper divisors are 1, 2, and 3.
		The sum of these divisors is 1 + 2 + 3 = 6. 

*/
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			sum=sum+i;
		}
		if(num==sum)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is Not a Perfect Number");
		}
	}
}
