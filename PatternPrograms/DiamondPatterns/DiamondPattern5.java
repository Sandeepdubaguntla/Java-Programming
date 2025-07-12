import java.util.Scanner;
/*
	Pattern:
		
	            1
	          a b c
	        1 2 3 4 5
	      a b c d e f g
	        1 2 3 4 5
	          a b c
	            1

*/
class  DiamondPattern5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star = 1;
		int space = row - 1;
		for(int i=1;i<=row;i++)
		{
			int n=1;
			char ch='a';
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(i % 2 == 0)
					System.out.print(ch++ +" ");
				else
					System.out.print(n++ +" ");
			}
		
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
