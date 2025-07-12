import java.util.Scanner;
/*
   If a number is multiplied by itself then the number is 
   called as Perfect Square Number
   Example : num = 6
             PerfectSquare = 6 * 6 =36
*/
class PerfectSquareNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		boolean condition=false;
		//int count=0;
		for(int i=1;i<=num;i++)
		{
			if(i*i > num)
			{
				break;
			}
			if(i*i == num)
			{
				//count++;
				condition=true;
				break;
			}
			
		}
		//if(count>0)
		if(condition)
		{
			System.out.println(num+ " is a Perfect Square Number");
		}
		else
		{
			System.out.println(num+ " is a not a Perfect Square Number");
		}

	}
}
