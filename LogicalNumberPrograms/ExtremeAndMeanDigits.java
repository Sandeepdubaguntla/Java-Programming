import java.util.Scanner;
/*
   In a proportion, the extremes are the first and last terms, 
   while the means are the middle terms. 
   For example, in the proportion a : b :: c : d, a and d are the extremes, and b and c are the means. 
   Example:
   In the proportion 3 : 5 :: 6 : 10, 
   the extremes are 3 and 10, and the means are 5 and 6. 
*/

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
