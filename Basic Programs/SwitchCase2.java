//WAP TO CHECK WEATHER THE GIVEN CHARACTERR IS VOWEL OR CONSONENT

import java.util.Scanner;
class  SwitchCase2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE GIVEN STSTEMENT...");
		char c=sc.next().charAt(0);
		switch(c)
		{
			case 'a':System.out.println("VOWEL");break;
			case 'e':System.out.println("VOWEL");break;
			case 'i':System.out.println("VOWEL");break;
			case 'o':System.out.println("VOWEL");break;
			case 'u':System.out.println("VOWEL");break;
			default:System.out.println("CONSONENTS");
		}
	}
}
