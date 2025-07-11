import java.util.Scanner;
/*
   If the sum of the digits of the given number is completely divisible
   by the actual number . The number is called as Harshad Number. 
   Example num = 12
          sum of digits = 1+2 =3
		   12 is completely divisble by 3
		   12 is a Harshad number.
*/
class HarshadNumbersFromRangeMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M");
		int m=sc.nextInt();
		System.out.println("Enter the value of N");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int num = i;
			int sum=0;
			int temp = num;
			while(num>0)
			{
				int ld=num % 10;
				sum=sum+ld;
				num=num/10;
			}
			if(temp % sum == 0){
				System.out.println(i);
			}
		}

	}
}
