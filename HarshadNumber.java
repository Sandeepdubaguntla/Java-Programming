import java.util.Scanner;

/*

   A Harshad number (also known as a Niven number) 
   in a given number base is an integer that is divisible by 
   the sum of its digits when written in that base. 
    EX: NUM = 12
	   SUM = 1+2 = 3
	   12 % 3 == 0
	   12 IS DIVISIBLE BY 3 
	   SO 12 IS A HARSHAD NUMBER.

*/
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			num=num/10;
			sum=sum+num;
		}
		if(temp%sum==0){
			System.out.println(temp+ " is a Harshad Number");
		}
		else{
			System.out.println(temp+ " is Not a Harshad Number");
		}
	}
}
