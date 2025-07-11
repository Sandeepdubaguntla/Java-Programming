import java.util.Scanner;
class PalindromeNumberFromRangeMtoN 
{
	/*
	  A palindrome number is a number that remains the 
	  same when its digits are reversed.
	  For example, 121, 1331, and 4554 are palindrome numbers. 
	*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M");
		int m=sc.nextInt();
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=m;i<n;i++)
		{
			int num=i;
			int rev=0;
			int temp=num;
			while(num > 0)
			{
				int ld = num % 10;
				rev = (rev * 10) + ld;
				num = num /10;
			}
			if(rev == temp)
				System.out.println(i);
		}
	}
}
