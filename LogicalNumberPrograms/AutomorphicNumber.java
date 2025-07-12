import java.util.Scanner;
/*
   An automorphic number is a number whose square ends with the 
   same digits as the number itself. 
   For example, 5 is an automorphic number because 5 * 5 = 25, 
   and the result ends in 5. 
   Similarly, 76 is automorphic because 76 * 76 = 5776. 
*/
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int div=1;
		int square;
		while(num>0){
			num=num/10;
			count++;
		}
		square=temp*temp;
		for(int i=1;i<=count;i++){
			div=div*10;
		}
		
		int last = square%div;
		
		if(temp==last){
			System.out.println("The number "+temp+" is an Automorphic Number");
		}
		else{
			System.out.println("The number "+temp+" is not an Automorphic Number");
		}
	}
}
