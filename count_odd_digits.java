import java.util.Scanner;
class count_odd_digits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number .....");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2!=0)
			{
				count++;
		    }
			num=num/10;

	}
	System.out.println("Number of Odd digits in the " +temp +" is "+count);
	}
}
