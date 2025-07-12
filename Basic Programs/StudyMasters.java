import java.util.Scanner;
class StudyMasters
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Year Of Passed Out");
		int yop=sc.nextInt();
		if(yop==2022 || yop ==2023 || yop ==2024 ||yop ==2025){
		System.out.println("Eligible for Masters");
		}
		else
		{
			System.out.println("Not Eligible for Masters");
		}

	}
}
