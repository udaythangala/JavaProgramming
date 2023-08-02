import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade to check pass or fail :");
		int grade = sc.nextInt();
		checkGrade(grade);
		sc.close();
	}
	public static void checkGrade(int grade)
	{
		if(grade > 50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

}
