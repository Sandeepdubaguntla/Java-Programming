//write a program check weather the given character is a 
//-lower alphabet
//-uppercase alphabet
//-digit
//-special character

import java.util.Scanner;

class  CharacterCheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character.....");
		char ch=sc.next().charAt(0);

		if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is Lower Alphabet....");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is a Upper Alphabet.....");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a Digit...");
		}
		else
		{
			System.out.println(ch+" is Special Character......");
		}
	}
}
