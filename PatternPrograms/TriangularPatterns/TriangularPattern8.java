import java.util.Scanner;

/*
     Pattern:
	 
 
    1
	a b
	1 2 3
	a b c d


*/
class  TriangularPattern8

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number ... ");
		int row = sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2 == 0)
				{
					System.out.print(ch + " ");
					ch++;
				}
				    
				else
					System.out.print(j + " ");
				
				
			}
			ch='a';
			System.out.println();
		}

	}
}
