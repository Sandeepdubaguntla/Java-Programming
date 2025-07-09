import java.util.Scanner;
class ExtremeAndMeanDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int Lastdigit=num%10;
		num=num/10;
		System.out.println("The mean Digits are :- ");
		while(num>=10){
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
		int FirstDigit=num;
		System.out.println("The First Digit is: "+FirstDigit);
		System.out.println("The Last Digit is: "+Lastdigit);
		System.out.println("The Extreme Digits are : "+FirstDigit+" and "+Lastdigit);
		
	}
}
