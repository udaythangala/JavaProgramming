import java.util.Scanner;

public class TheHeightConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter players height in inches :");
		TheHeightConverter converter = new TheHeightConverter();
		System.out.printf("%.2f",converter.convertInchesToFeet(sc.nextDouble()));
		sc.close();
	}

}
