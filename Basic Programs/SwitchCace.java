import java.util.Scanner;
class SwitchCace 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value.....");
		int value=sc.nextInt();
		switch(value)
		{
			case 1:{
				System.out.println("case first block.....");
		}break;
		case 2:{
				System.out.println("case second block.....");
		}
		case 3:{
				System.out.println("case Third block.....");
		}
		case 4:{
				System.out.println("case fourth block.....");
		}
		default:{
				System.out.println("Defalut block.....");
		}
	}
	}
}
