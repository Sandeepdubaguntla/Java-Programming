import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");

		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0){
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
			System.out.println("The Reverse of the given number "+temp+" is " +rev);
	}
}
