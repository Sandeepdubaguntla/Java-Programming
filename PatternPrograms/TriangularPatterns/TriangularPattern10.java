import java.util.Scanner;
/*
     Pattern :

	A
	1 1	 
	A A A
	1 1 1 1

*/
class  TriangularPattern10

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number ... ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i % 2 == 0)
					System.out.print("1"+" ");
				else
					System.out.print("A"+" ");
			}
			System.out.println();
		}

	}
}
