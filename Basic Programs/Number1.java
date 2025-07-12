import java.util.Scanner;
class Number1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character......");
        char ch=sc.next().charAt(0);
        if(ch=='x')
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
	}
}
