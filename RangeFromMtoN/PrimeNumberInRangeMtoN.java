import java.util.Scanner;
class PrimeNumberInRangeMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter  the value of M");
		int m=sc.nextInt();
		System.out.println("Enter  the value of N");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int count=0;
			int num=i;
			for(int j=1;j<=num;j++)
			{
				if(num % j == 0)
					count++;
			}
			if(count == 2)
				System.out.println(i);
		}

	}
}
