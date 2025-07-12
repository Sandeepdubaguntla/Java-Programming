import java.util.Scanner;
/*

	A strong number is a positive integer where the 
	sum of the factorials of its individual digits equals the original number itself. 
	Consider the number 145:
	The digits are 1, 4, and 5.
	Calculate the factorial of each digit:
	1! = 1
	4! = 4 * 3 * 2 * 1 = 24
	5! = 5 * 4 * 3 * 2 * 1 = 120
	Sum the factorials: 1 + 24 + 120 = 145.
	Since the sum of the factorials of its digits (145) is equal to the original number (145), 145 is a strong number.

*/
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			int ld=num%10;
			int fact=1;
			for(int i=1;i<=ld;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		//System.out.println(sum);
		if(sum==temp){
			System.out.println(temp+" is a Strong Number");
		}
		else{
			System.out.println(temp+" is not a Strong Number");
		}
			
	}
}
