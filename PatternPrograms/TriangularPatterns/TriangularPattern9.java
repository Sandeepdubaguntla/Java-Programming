import java.util.Scanner;
/*
      
	  Pattern :


	  A
	  A 1
	  A 1 A
	  A 1 A 1
	  A 1 A 1 A

*/

class  TriangularPattern9

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
				if(j % 2 == 0)
					System.out.print("1"+" ");
				else
					System.out.print("A"+" ");
			}
			System.out.println();
		}

	}
}
