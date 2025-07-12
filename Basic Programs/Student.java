import java.util.Scanner;
class  Student
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the yop...");
		int yop=sc.nextInt();
		System.out.println("Enter the cgpa..........");
		Double cgpa=sc.nextDouble();

		if(yop==2025&&cgpa>=6.0)
		{
			System.out.println("The student is Eligible for placement");
		}
		else
		{
			System.out.println("The student is Not Eligible for placement");
		}

	}
}
