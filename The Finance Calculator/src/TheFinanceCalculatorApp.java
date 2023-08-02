import java.util.Scanner;

public class TheFinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal, rate and time of loan :");
		TheFinanceCalculator calculator = new TheFinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		sc.close();
	}
}
