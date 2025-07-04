import java.util.Scanner;
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
