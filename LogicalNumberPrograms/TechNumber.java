import java.util.Scanner;
/*

	A "tech number" is a number with an even number of digits that, 
	when split into two equal halves, results in the original number 
	when the sum of the halves is squared. In other words, 
	if you divide the number into two equal parts and then 
	square the sum of those parts, the result should be the original number. 
	Example:
		The number 3025 is a tech number because when you split it 
		into 30 and 25, the sum is 55. Squaring 55 gives you 3025. 

*/
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int div=1;
		int count=0;
		int sum=0;
		while(num>0){
			num=num/10;
			count++;
		}
		if(count % 2 == 0){
			for(int i=1;i<=count/2;i++){
				div=div*10;
			}
			int last=temp%div;
			int first=temp/div;
			sum=last+first;
			int square=sum*sum;
			if(square==temp){
				System.out.println("The number "+temp+" is a Tech Number");
			}
			else{
				System.out.println("The number "+temp+" is not a Tech Number");
			}
		}
		else{
			System.out.println("The number "+temp+" is not a Tech Number");
		}

	}
}
