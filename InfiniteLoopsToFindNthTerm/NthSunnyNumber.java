import java.util.Scanner;
/*   
   Nth Sunny Number
*/

class NthSunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the N value...");
		int n= sc.nextInt();
		System.out.println((n*n) - 1);
	}
}

