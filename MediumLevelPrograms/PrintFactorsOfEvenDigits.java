import java.util.*;
class  PrintFactorsOfEvenDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		while(num>0){
			int ld=num%10;
			System.out.println("The factors are "+ld);
			
			for(int i=1;i<num;i++){
				if(ld%2==0){
				if(ld%i==0){
					System.out.println(i);
				}
				}
			}
			num=num/10;
		}
	
	}
}
