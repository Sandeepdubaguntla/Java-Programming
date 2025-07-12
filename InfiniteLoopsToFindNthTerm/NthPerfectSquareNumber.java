import java.util.Scanner;
/*
	The Nth Perfect Square Number.
*/
class NthPerfectSquareNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the N value...");
		int n= sc.nextInt();
		int count=0;
		for(int i=1; ; i++)
		{
			int num = i;
			
			boolean condn = false;
			
			for(int j=1;j<=num;j++)
			{
				
				if(j*j == num)
				{
					condn = true;
					
					break;
				}
			}
			if(condn)
			{
				count++;
			}
			if(count == n)
			{
				System.out.println(i);
				break;
			}
		}
	}
	//public static void main(String[] args) 
	//{
	//	Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter the N value...");
	//	int n= sc.nextInt();
	//	System.out.println(n*n);
	//}
}

