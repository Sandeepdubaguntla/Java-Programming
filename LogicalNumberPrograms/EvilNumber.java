package Static;
import java.util.Scanner;
/*
 *  EvilNumber :
 *  Binary Representation:
		Every integer can be expressed in binary (base-2) using only the digits 0 and 1.
	Counting 1s:
		To determine if a number is evil, you convert it to its binary form and count how many times the digit 1 appears.
	Evil Number Condition:
		If the count of 1s in the binary representation is even, the number is classified as an evil number.
	Example:
		The number 6 in binary is 110. It has two 1s, so it's an evil number.
		The number 5 in binary is 101. It has two 1s, so it's an evil number.
		The number 7 in binary is 111. It has three 1s, so it's not an evil number.
 * */

public class EvilNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int binary=0;
		int place=1;
		while(num>0)
		{
			int rem=num%2;
			binary=binary + (rem * place);
			place = place * 10;
			num = num / 2;
		}
		int temp = binary;
		int count=0;
		while(binary>0)
		{
			int ld=binary%10;
			if(ld == 1)
				count++;
			binary=binary/10;
		}
		if(count % 2 == 0)
			System.out.println("This is an Evil Number...");
		else
			System.out.println("This is Not an Evil Number...");
		
	}

}
