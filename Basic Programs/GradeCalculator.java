 //
import java.util.Scanner;
 
class  GradeCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage.....");
		int n=sc.nextInt();

		if(n>=90)
		{
			System.out.println(n+" it is Grade A....");
		}
		else if(n>=80 && n<90)
		{
			System.out.println(n+" it is Grade B.....");
		}
		else if(n>=70 && n<80)
		{
			System.out.println(n+" it is Grade C...");
		}
		else if(n>=50 && n<70)
		{
			System.out.println(n+" it is Grade D...");
		}
		else
		{
			System.out.println(n+" The student is Fail......");
		}
	}
}
