import java.util.Scanner;
/*
   If a number is multiplied by itself then the number is 
   called as Perfect Square Number
   Example : num = 6
             PerfectSquare = 6 * 6 =36
*/
class PerfectSquareNumberFromMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M");
		int m = sc.nextInt();
		System.out.println("Enter the value of N");
		int n = sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int num = i;
			int temp = num;
			boolean condn = false;
			for(int j=0;j<=9;j++)
			{
				if(j*j >num)
					break;
				if(j*j == num)
				{
					condn=true;
					break;
				}
			}
			if(condn)
				System.out.println(i);
		}

	}
}
