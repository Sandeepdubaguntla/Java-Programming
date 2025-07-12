import java.util.Scanner;

/*
		The Nth Prime number
		Example n=2
		2nd prime numebr is 3.

*/
class NthPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int countPrime=0;
		for(int i=1; ;i++)
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
				countPrime++;
			}
			if(countPrime == n)
			{
				System.out.println(i);
				break;
			}

		}

	}
}
