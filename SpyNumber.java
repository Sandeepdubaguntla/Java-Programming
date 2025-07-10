import java.util.Scanner;

/* 

   A spy number is a positive integer where the sum of its digits 
   equals the product of its digits. 
   For example, 
   1124 is a spy number 
   because Sum is  1 + 1 + 2 + 4 = 8 and 
   Product is 1 * 1 * 2 * 4 = 8. 

*/
class  SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int product=1;
		while(num>0){
			int ld=num%10;
			sum=sum+ld;
			product=product*ld;
			num=num/10;
		}
		if(sum==product)
		{
			System.out.println("The number "+temp+" is a Spy Number");
		}
		else{
			System.out.println("The number "+temp+" is not a Spy Number");
		}
	
	}
}
