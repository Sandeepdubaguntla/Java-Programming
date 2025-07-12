import java.util.Scanner;
/*

    To find the Nth Smallest number within a set of digits,
	Example num = 12345
	2nd smallest digit is 2.
   
*/
class NthSmallestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		System.out.println("Enter the N value...");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<=9;i++){
			int temp=num;
			while(temp>0){
				int ld=temp%10;
				if(ld==i){
					count++;
					break;
				}
				temp=temp/10;
			}
			if(count==n){
				System.out.println("The "+n+"th Smallest Number is "+i);
				break;
			}
		}

	}
}
