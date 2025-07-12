import java.util.Scanner;
/*
      
	  Pattern :

      A
	  1 A
	  1 A 1
	  A 1 A 1
	  A 1 A 1 A

*/

class  TriangularPattern11

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number ... ");
		int row = sc.nextInt();
		int count=0;
	    char ch = 'A';
		for(int i=1;i<=row;i++)
			{
				for(int j=1;j<=i;j++)
				{
					if(count % 2 == 0)
						System.out.print("A"+" ");
					else
						System.out.print("1"+" ");
					count++;
				}
				System.out.println();
			} 

	//	for(int i=1;i<=row;i++)
	//	{
	//		for(int j=1;j<=i;j++)
	//		{
	//			System.out.print(ch + " " );
	//			ch = (char) (ch-16);
	//			if(ch<49)
	//				ch = 'A';
	//		}
	//		System.out.println();
	//	}

	}
}