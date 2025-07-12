import java.util.Scanner;
/*
	The Prime Number after the Nth term.
	Example N= 10
	The Next Prime is 11.

*/

class NthNextPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int n=sc.nextInt();
		for(int i=n+1; ;i++)
		{
			int num = i;
			int count=0;
			for(int j=1;j<=num;j++)
			{
				if(num % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
