import java.util.Scanner;

class  WhileLoop3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character.........");
		char ch=sc.next().charAt(0);
		char i='a';
		while(i<=ch)
		{
			System.out.println(i+""); 
			i++;
		}
	}
}
