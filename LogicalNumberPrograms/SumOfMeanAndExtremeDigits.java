import java.util.Scanner;
/*

	Consider a Number 2025
	Now the extreme terms are 2,5
		sum of extremes = 2+5 = 7
	now the mean terms are 0,2
		sum of mean terms =0+2 = 2


*/
class SumOfMeanAndExtremeDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int sumofmean=0;
		int sumofextreme=0;
		int last=num%10;
		num=num/10;
		while(num>=10){
			int ld=num%10;
			sumofmean=sumofmean+ld;
			num=num/10;
		}
		int first=num;
		sumofextreme=last+first;
		System.out.println("The sum of Extremes of the Given number is: "+sumofextreme);
		System.out.println("The sum of the Mean digits of the number is: "+sumofmean);
	}
}
