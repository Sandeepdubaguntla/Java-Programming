import java.util.Scanner;
class SpyNumbersFromRangeMtoN 
{
	/*
	Spy Number is a number whose Sum od the Digits of the given number 
	is equal to the Product of the Digits of the given number.
	SumofDigits = ProductofDigits 
	*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M");
		int m=sc.nextInt();
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++){
			int num=i;
			int sum=0;
			int product=1;
			while(num >0){
				int ld=num%10;
				sum=sum+ld;
				product=product*ld;
				num=num/10;
			}
			if(sum==product)
				System.out.println(i);
	}
}
}n  0