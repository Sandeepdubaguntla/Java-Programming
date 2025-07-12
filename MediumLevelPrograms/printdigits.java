import java.util.Scanner;
/*
   To print the digits of a number in Java, one common approach 
   involves using a loop with the modulo and division operators. 
   This method extracts digits one by one, typically from the least 
   significant digit (rightmost) to the most significant digit (leftmost).
   Example : num 123
            output: 1 2 3
*/
public class  printdigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number....");
		int num=sc.nextInt();
		while(num>0)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
	}
}
