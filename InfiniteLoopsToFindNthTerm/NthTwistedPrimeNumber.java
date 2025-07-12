import java.util.Scanner;
/*
	Nth Twisted Prime Number
*/
class NthTwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int cnt=0;
		for(int i=1; ;i++)
		{
			int num=i;
			int temp=num;
			int cnt1=0;
			int cnt2=0;
			int rev=0;
			for(int j=1;j<=num;j++)
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
				for(int j=1 ; j <= rev;j++)
				{
					if(rev % j == 0)
						cnt2++;
				}
				if(cnt2 == 2)
				{
					cnt++;
				}

			}
			if(cnt == n)
			{
				System.out.println(i);
				break;
			}
		}

	}
}
