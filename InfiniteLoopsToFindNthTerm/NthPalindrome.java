import java.util.Scanner;
/*
	The Nth Palindrome Number
	i.e Palendrome number at nth term.
*/
class NthPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value...");
		int n=sc.nextInt();
		int count=0;
		for(int i=1; ;i++)
		{
			int rev=0;
			int num=i;
			int temp = num;
			while(num>0)
			{
				int ld = num % 10;
				rev = (rev * 10) + ld;
				num = num / 10;
			}
			if(temp == rev)
			{
				count++;
			}

			if(count == n)
			{
				System.out.println(i);
				break;
			}

		}
	}
}