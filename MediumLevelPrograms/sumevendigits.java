import java.util.Scanner;
public class sumevendigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number .....");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int count=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0)
			{
				sum=sum+ld;
		    }
			num=num/10;

	}
	System.out.println("total sum of even digits of the "+temp+" is " +sum);
	}
}
