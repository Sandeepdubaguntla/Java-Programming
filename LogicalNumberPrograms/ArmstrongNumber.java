import java.util.Scanner;
/*
	An Armstrong number is a number that is equal to the 
	sum of its own digits each raised to the power of the number of digits. 
	For example, 153 is an Armstrong number 
	because 1^3 + 5^3 + 3^3 = 153. 

*/
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int  num=sc.nextInt();
		int temp=num;
		int temp1=num;
		int count=0;
		int sum=0;
		while(temp>0){
			temp=temp/10;
			count++;
		}
		while(num>0){
			int ld=num%10;
			int expo=1;
			for(int i=1;i<=count;i++){
				expo=expo*ld;
			}
			sum=sum+expo;
			num=num/10;
		}
		if(sum==temp1)
		System.out.println(temp1+" is an Armstrong Number");
		else
			System.out.println(temp1+"is not an Armstrong Number");
	

	}
}
