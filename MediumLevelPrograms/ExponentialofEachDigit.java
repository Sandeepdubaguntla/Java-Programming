import java.util.Scanner;
class ExponentialofEachDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ...");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		
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
		System.out.println("The Exponential of the digit "+ld+" is " +expo);
		temp=temp/10;
		}
	
	}
}
