import java.util.Scanner;

/*
     Pattern:
	 
     1
	 1 a
	 1 a 2
	 1 a 2 b
	 1 a 2 b 3
*/
class  TriangularPattern7

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number ... ");
		int row = sc.nextInt();
		char ch='a';
		int n=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2 == 0)
				{
					System.out.print(ch + " ");
					n++;
					ch++;
				}
				    
				else
				{
					System.out.print(n + " ");
					
				}
			}
			System.out.println();
			n=1;
			ch='a';
		}

	}
}
