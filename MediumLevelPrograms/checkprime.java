//prime or not
import java.util.Scanner;
/*
 A prime number is a whole number greater than 1 that has only two divisors:
 1 and the number itself. 
 For example, 2, 3, 5, 7, 11, and 13 are prime numbers.
*/
public class checkprime
 
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number....");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0){
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is the prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
}
}