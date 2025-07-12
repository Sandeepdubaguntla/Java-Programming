import java.util.Scanner;
/*
	To convert a binary number to decimal, multiply each binary digit by its corresponding power of 2 
    and then sum up the results. 
    Therefore, the decimal equivalent of the binary number 1011 is 11. 

*/
class BinaryToDecimalConversion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Number...");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int power=0;
		while(num>0){
			int ld=num%10;
			if(ld==1){
				int expo=1;
				for(int i=1;i<=power;i++){
					expo=expo*2;
				}
				sum=sum+expo;
			}
			num=num/10;
			power++;
		}
		System.out.println("The Decimal Value of the Binary "+temp+ " is "+sum);

	}
}
