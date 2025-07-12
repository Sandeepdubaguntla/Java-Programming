import java.util.Scanner;
/*
  Factors of a number are the whole numbers that divide the given number exactly, 
  leaving no remainder or remainder is zero. 
  For example, the factors of 12 are 1, 2, 3, 4, 6, and 12. 
*/
class FactorsofaNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Factors : ");
		int num=sc.nextInt();
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
