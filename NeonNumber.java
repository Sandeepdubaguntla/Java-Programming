import java.util.Scanner;

/*
    A Neon Number is a positive integer where the 
	sum of the digits of its square is equal to the number itself. 
	For example, 9 is a Neon Number because its square is 81, and 
	the sum of the digits of 81 (8 + 1) is 9, which is the original number. 


*/
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int sum=0;
		int square=num*num;
		while(square>0){
			int ld=square%10;
			sum=sum+ld;
			square=square/10;
		}
		if(sum==num){
			System.out.println(num+" is a Neon Number");
		}
		else{
			System.out.println(num+" is not a Neon Number");
		}


	}
}
