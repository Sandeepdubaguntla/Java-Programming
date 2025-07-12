
import java.util.Scanner;
/*

	A Harshad number, also known as a Niven number, 
	is a number that is divisible by the sum of its digits. 
	The nth Harshad number is the nth number that satisfies this property. 
	For example, the first few Harshad numbers are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24... 
	The Harshad NUmbers of Nth number.


*/
class NthHarshadNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value...");
		int n=sc.nextInt();
		int count=0;
		
		for(int i=1; ; i++)
		{
			int num = i;
			int temp = num;
			int sum=0;
			

			while(num>0)
			{
				int ld=num % 10;
				sum = sum + ld;
				num = num/10;
			}
			if(i % sum == 0)
				count++;
			if(count == n)
			{
				System.out.println(i);
				break;
			}

		}
	}
}

