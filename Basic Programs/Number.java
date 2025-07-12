import java.util.Scanner;
class Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number..........");
        int a=sc.nextInt();
        if(a==8)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
	}
}
