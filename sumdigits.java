import java.util.Scanner;
public class sumdigits
 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number....");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;

		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println("total sum of all digits of the "+temp+" is " +sum);
	}
}
