import java.util.Scanner;
/*

	Xylem Number:
	A number where the sum of its "extreme digits" (the first and last digits) 
	is equal to the sum of its "mean digits" (all digits excluding the first and last).
	Phloem Number:
	A number where the sum of its "extreme digits" is not equal to the sum of its "mean digits." 

*/
class XylomOrPhloemNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int temp=num;
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
		sumofextreme=first+last;
		if(sumofmean==sumofextreme){
			System.out.println(temp+" is a Xylom Number");
		}
		else{
			System.out.println(temp+" is a Phloem Number");
		}
	}
}
