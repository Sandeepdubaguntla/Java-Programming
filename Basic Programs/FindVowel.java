//write a program to to check weather the given character is a vowel or a consonent
import java.util.Scanner;
class  FindVowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("The give character is vowel");
		}
		else
		{
			System.out.println("The given character is not a vowel");
		}
	}
}
