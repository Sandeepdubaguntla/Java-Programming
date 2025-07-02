import java.util.Scanner;
class  FactorialSumOfEachDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int num=sc.nextInt();
		int sum=0;
		int temp = num;
		while(num>0){
			int ld=num%10;
			int fact =1;
			for(int i=1;i<=ld;i++){
				fact=fact*i;
			}
						
			sum=sum+fact;
			
	        num=num/10;
		}
				System.out.println("The sum of factorial of each digit of "+temp+" is :- "+sum);

	
	}
}
