import java.util.Scanner;
/*

	A "Sunny Number" is a number where the number immediately succeeding it is a perfect square. 
	A positive integer N is considered a Sunny Number if N+1 is a perfect square. 
	This means that if you take the number, add one to it, 
	and then calculate the square root of the result, 
	the square root will be an integer. 
	Examples:      
	15: 15+1=16. 
	The square root of 16 is 4, which is an integer. 
	Therefore, 15 is a Sunny Number.


*/
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num+1;
		boolean condition=false;
		for(int i=1;i<=num;i++){
			if(i*i>temp){
				break;
			}
			if(i*i == temp ){
				condition=true;
				break;
			}
		}
		if(condition){
			System.out.println(num+" is a Sunny Number");
		}
		else{
			System.out.println(num+" is not a Sunny Number");
		}
	}
}
