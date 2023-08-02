import java.util.Scanner;

public class AgeCategorizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age to categorize :");
		int age = sc.nextInt();
		categorizeAge(age);
		sc.close();
	}
	public static void categorizeAge(int age)
	{
		if( age >= 0 && age < 13)
			System.out.println("Child");
		else if ( age >= 13 && age < 20)
			System.out.println("Teen");
		else if ( age >= 20 && age < 60)
			System.out.println("Adult");
		else
			System.out.println("Senior");
	}
}
