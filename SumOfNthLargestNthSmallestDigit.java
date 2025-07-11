import java.util.Scanner;
/*

	The sum of the nth largest and nth smallest digits of a number depends on the specific number.
	To find the sum, you need to first determine the nth largest and nth smallest digits within the given number, 
	and then add them together.      
	Let's say the number is 12345, and we want to find the sum of the 2nd largest and 2nd smallest digits.      
	Sort the digits: Sort the digits in ascending order: 1, 2, 3, 4, 5. 
	Identify the nth largest and nth smallest: For n=2, the 2nd smallest digit is 2, 
	and the 2nd largest digit is 4. Calculate the sum: 2 + 4 = 6.
	Therefore, the sum of the 2nd largest and 2nd smallest digits of 12345 is 6.

*/

class SumOfNthLargestNthSmallestDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		System.out.println("Enter the Nth largest value...");
		int n1=sc.nextInt();
		System.out.println("Enter the Nth smallest value...");
		int n2=sc.nextInt();
		int sum=0;
		int count1=0;
		int count2=0;
		for(int i=9;i>=0;i--){
			int temp1=num;
			while(temp1>0){
				int ld1=temp1%10;
				if(ld1==i){
					count1++;
					break;
				}
				temp1=temp1/10;
			}
			if(count1==n1){
			  System.out.println("The "+n1+"th Largest digit is "+i);
				sum=sum+i;
			  break;
			}
		}
		for(int i=0;i<=9;i++){
			int temp2=num;
			while(temp2>0){

				int ld2=temp2%10;
				if(ld2==i){
					count2++;
					break;
				}
				temp2=temp2/10;
			}
			if(count2==n2){
			  System.out.println("The "+n2+"th smallest digit is "+i);
			  sum=sum+i;
			  break;
			}
		}
		
		System.out.println("The Sum of the Nth Largest and Nth Smallest is : "+sum);
		if(sum==0){
			System.out.println("The Sum is Zero...");
		}
		else if(sum%2==0){
			System.out.println("The Sum is Even...");
		}
		else{
			System.out.println("The Sum is Odd...");
		}

	}
}
