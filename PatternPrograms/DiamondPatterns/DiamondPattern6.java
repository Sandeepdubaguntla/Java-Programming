import java.util.Scanner;
/*
	Pattern:
		
	            1
	          a a a
	        2 2 2 2 2
	      b b b b b b b
	        3 3 3 3 3
	          c c c
	            4

*/
class  DiamondPattern6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star = 1;
		int space = row - 1;
		int n=1;
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i % 2 == 0)
					System.out.print(ch +" ");
				else
					System.out.print(n +" ");
			}
			if(i%2==0)
				ch++;
			else
				n++;
			if(i <= row/2)
			{
				star = star + 2;
				space--;
				
			}
			else
			{
				star = star - 2;
				space++;
			}
			System.out.println();
		}
	}
}
