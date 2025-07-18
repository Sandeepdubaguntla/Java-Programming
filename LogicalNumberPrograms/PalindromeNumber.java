import java.util.Scanner;
/*
     A palindrome number is a number that remains the same when its digits are reversed.
	 In simpler terms, it reads the same forwards and backward. 
	 For example, 121, 1331, and 4554 are palindrome numbers. 

*/
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0){
			int ld=num%10;
			rev=(rev*10) + ld;
			num=num/10;
		}
		if(temp==rev){
			System.out.println("The given number "+temp+" is a Palindrome Nunber...");
		}
		else{
			System.out.println("The given number "+temp+" is not a Palindrome Number...");
		}
	}
}
