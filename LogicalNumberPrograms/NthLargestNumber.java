import java.util.Scanner;
/*
 
    To find the Nth largest number within a set of digits, 
	Example num = 12345
	2nd largest digit is 4.

*/
class NthLargestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int n=sc.nextInt();
		int count=0;
		for(int i=9;i>=0;i--){
			int temp=num;
			while(temp>0){
				int ld=temp%10;
				if(ld==i){
					count++;
					break;
				}
				temp=temp/10;
			}
			if(count==n){
				System.out.println("The "+n+"th Largest digit in "+num+" is "+i);
				break;
			}
		}
	}
}