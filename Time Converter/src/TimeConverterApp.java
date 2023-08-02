import java.util.Scanner;

public class TimeConverterApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee log in minutes :");
		System.out.println(TimeConverter.convertToHours(sc.nextInt()));
		sc.close();
	}
}
