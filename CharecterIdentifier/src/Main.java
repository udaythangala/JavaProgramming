import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);sc.close();		
	}
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch)) 
			System.out.println(ch+ " is a Digit");
		else if(Character.isLowerCase(ch)) 
		{
			if( ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') 
				System.out.println("lower-case vowel");
			else
			System.out.println(ch+ " is a lower-case consonant");
		 }
		else if(Character.isUpperCase(ch))
		{
			if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				System.out.println(ch+ " is a Upper-case vowel");
			else
			System.out.println(ch+ " is a Upper-case consonant");
		}
		else
			System.out.println(ch+" is an special character");
	}
}
