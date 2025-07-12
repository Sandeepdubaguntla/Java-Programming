import java.util.Scanner;
/*
	The largest digit in the decimal number system is 9. 
	A number with multiple digits can be formed by combining this largest digit multiple times. 
	For example, the largest 2-digit number is 99, the largest 3-digit number is 999, and so on. 
*/
class GreatestDigitInANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int greatest=0;
		int temp=num;
		while(num>0){
			int ld=num%10;
			if(ld>greatest)
				greatest=ld;
			num=num/10;
		}
		if (temp==0)
			System.out.println("The number is zeroooo");
		
		}
		System.out.println("The greatest digit in "+temp+" is "+greatest );
	}
}
