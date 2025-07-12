import java.util.Scanner;
/*
	Pattern:
		
	            A
	          1 A 1
	        A 1 A 1 A
	      1 A 1 A 1 A 1
	        A 1 A 1 A
	          1 A 1
	            A

*/
class  DiamondPattern12
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of Rows");
		int row=sc.nextInt();
		int star = 1;
		int space = row - 1;
		int count=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(count % 2 == 0)
					System.out.print("A" +" ");
				else
					System.out.print("1" +" ");
				count++;
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
