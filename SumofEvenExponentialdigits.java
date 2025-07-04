import java.util.Scanner;
class SumofEvenExponentialdigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int temp1=temp;
		int sum=0;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(temp>0){
			int ld=temp%10;
			int expo=1;
			if(ld%2==0){
				for(int i=1;i<=count;i++)
				{
					expo=expo*ld;
				}
				sum=sum+expo;
			}
			temp=temp/10;
		}
			System.out.println("The sum of the even Exponential digits of "+ temp1+" is "+sum);
}
}