import java.util.Scanner;
/*
  A number is said to be twisted prime if it is a prime number 
  and reverse of the number is also a prime number. 
  Examples: Input : 97 
           Reverse: 79
           Output : Twisted Prime Number 
  Explanation: 97 is a prime number and its reverse 79 is also a prime number.
*/
class TwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number...");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		int cnt1=0;
		int cnt2=0;
		int d=0;
		while(num>0){
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		System.out.println("Reverse number : "+rev);
		for(int i=1;i<=temp;i++)
		{
		if(temp % i==0){
			cnt1++;
		}
		
		}
		if(cnt1==2){
			//System.out.println(temp+" is a Prime Number");
			d++;
		}
		for(int i=1;i<=rev;i++){
			if(rev % i==0){
			cnt2++;
		 }
		}
		if(cnt2==2){
			//System.out.println(rev+ " Twisted number is also Prime");
			d++;
		}
		if(d==2){
			System.out.println("The number is Twisted Prime Number");
		}
		else{
			System.out.println("The number is not a Twisted Prime Number");
		}

	}
}
