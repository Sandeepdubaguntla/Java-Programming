import java.util.Scanner;
class DecimalToBinaryConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int binary=0;
		int place=1;
		while(num>0){
			int rem=num%2;
			binary=binary + (rem*place);
			place=place*10;
			num=num/2;
		}
		System.out.println("The Binary Conversion of "+temp+" is "+binary);
	}
}
