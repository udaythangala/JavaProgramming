import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
		sc.close();
	}
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println(ch+" is a Digit !");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println(ch+" is a Special Character !");
		}
		else
		{
			switch(Character.toLowerCase(ch)) 
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
					System.out.println(ch+ " is Lower case Vowel !");
				else
					System.out.println(ch+ " is Upper case Vowel !");
				break;
				
			default:
				if(Character.isLowerCase(ch))
					System.out.println(ch+ " is Upper case Consonent !");
				else
					System.out.println(ch+ " is Upper case Consonent !");
			}			
		}
	}
}
