import java.util.Scanner;
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
