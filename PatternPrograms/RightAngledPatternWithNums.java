import java.util.Scanner;

/*
     Pattern:
	 
       2
	   3 4
	   4 5 6
   	   5 6 7 8
	   6 7 8 9 10



*/
class  RightAngledPatternWithNums

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row Number ... ");
		int row = sc.nextInt();
		int n=2;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j) + " ");
				
				
			}
			System.out.println();
		}

	}
}
