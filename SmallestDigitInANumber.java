import java.util.Scanner;
class SmallestDigitInANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int smallest=9;
		
		if(temp==0)
		{
		System.out.println("The Smallest digit is 0");
		}
		else{
			while(num>0){
			int ld=num%10;
			if(ld<smallest)
				smallest=ld;
			num=num/10;
		}
		System.out.println("The Smallest digit in "+temp+" is "+smallest);
		}
	}
}
