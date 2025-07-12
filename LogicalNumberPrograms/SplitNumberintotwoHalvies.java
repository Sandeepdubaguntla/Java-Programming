import java.util.Scanner;

/*
 Splitting a Number in to Halvies
 NUM = 2025
 will be Splitted as 20 and 25


*/
class SplitNumberintotwoHalvies 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num= sc.nextInt();
		int temp=num;
		int temp1=num;
		int div=1;
		int count=0;
		while(num>0){
			num=num/10;
			count++;
		}
		if(count%2==0){
		for(int i=1;i<=count/2;i++){
			div=div*10;
		}
		int last=temp%div;
		int first=temp/div;
		System.out.println("The two Halvies of the number "+temp1+" are "+first+" and "+last );
		}
		else{
			System.out.println("We can not Split the number due to its Odd number of Digits");
		}
		
	}
}
