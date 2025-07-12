import java.util.Scanner;
/*
    Pattern:
  
                a
	      b a b
	    c b a b c
	  d c b a b c d
	e d c b a b c d e

*/

class  PyramidPatternWithMirroredAlphabet
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows...");
		int row=sc.nextInt();
		int star =1;
		int space=row-1;
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			char m = ch;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<=star/2)
					System.out.print(m-- +" ");
				else 
					System.out.print(m++ +" ");
			}
			star=star+2;
			space--;
			ch++;
			System.out.println();
		}

		/*
		
		  int star =1;
		int space=row-1;
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				if(k<=star/2)
					System.out.print(ch-- +" ");
				else 
					System.out.print(ch++ +" ");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		
		
		*/
		
	}
}
