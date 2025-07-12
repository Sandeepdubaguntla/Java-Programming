import java.util.Scanner;
class SumExponentialofEachDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ...");
		int num=sc.nextInt();
		int temp=num;
		int temp1=temp;
		int count=0;
		int sum=0;
		while(num>0){
			num=num/10;
			count++;
		}
		while(temp>0){
			int ld=temp%10;
			int expo=1;
			
			for(int i=1;i<=count;i++){
				expo=expo*ld;
			}
			sum=sum+expo;
			
			temp=temp/10;
		}
		System.out.println("The Sum of the Exponentials of each digit in "+temp1+ " is " +sum);
	
	}
}
