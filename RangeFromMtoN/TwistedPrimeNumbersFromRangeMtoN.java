import java.util.Scanner;
/*
  A number is said to be twisted prime if it is a prime number 
  and reverse of the number is also a prime number. 
  Examples: Input : 97 
           Reverse: 79
           Output : Twisted Prime Number 
  Explanation: 97 is a prime number and its reverse 79 is also a prime number.
*/
class TwistedPrimeNumbersFromRangeMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M");
		int m=sc.nextInt();
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int num = i;
			int temp = num;
			int cnt1 = 0;
			int cnt2 = 0;
			int rev=0;
			
			for(int j=1; j<=num ;j++)
			{
				if(num % j == 0)
					cnt1++;
			}
			if(cnt1 == 2)
			{
				while(num>0)
			{
				int ld = num % 10;
				rev = (rev * 10) + ld;
				num = num / 10;
			}
			for(int j=1;j<=rev;j++)
				{
					if(rev % j == 0)
						cnt2++;
				}
				if(cnt2 == 2)
				{
					System.out.println(i);
				}
			}
		}
	}
}
