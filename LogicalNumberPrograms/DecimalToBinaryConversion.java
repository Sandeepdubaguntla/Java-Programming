import java.util.Scanner;
/*
   To convert a decimal (base-10) number to binary (base-2), you repeatedly divide the decimal number by 2, 
   noting the remainders at each step. 
   The binary representation is formed by writing these remainders in reverse order. 
   Reading the remainders in reverse order (from bottom to top): 1101. 
   Therefore, the binary representation of 13 is 1101. 
*/

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
