import java.util.Scanner;

/*
    Nth Spy number.
*/
class NthSpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value...");
		int n=sc.nextInt();
		int count=0;
		for(int i=1; ; i++)
		{
			int num=i;
			int temp = num;
			int sum=0;
			int product=1;
			while(num > 0)
			{
				int ld = num % 10;
				sum = sum + ld;
				product = product * ld;
				num = num / 10;
			}
			if(sum == product)
				count++;
			if(count == n)
			{
				System.out.println(i);
				break;
			}

		}
	}
}
