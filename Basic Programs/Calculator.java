
import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("1 Addition");
		System.out.println("2 SUBSTRACTION");
		System.out.println("3 MULTIPLECATION");
		System.out.println("4 DIVISION");
		System.out.println("5 MODULES");
		System.out.println("Enter the  Given Operation..");
		int n=sc.nextInt();
		System.out.println("Enter First Number.....");
		int a=sc.nextInt();
		System.out.println("Enter second Number....");
		int b=sc.nextInt();
		switch(n)
		{
			case 1: int add=a+b;System.out.println("Result:-"+add);break;
			case 2:int sub=a-b;System.out.println("Result:-"+sub);break;
			case 3:int mul=a*b;System.out.println("Result:-"+mul);break;
			case 4:int div=a/b;System.out.println("Result:-"+div);break;
			case 5:int mod=a%b;System.out.println("Result:-"+mod);break;
			default: System.out.println("INVALID OPERATIONS");break;
		}
	}
}
