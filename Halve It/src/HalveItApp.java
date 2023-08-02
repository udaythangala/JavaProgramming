import java.util.Scanner;

public class HalveItApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount :");
		System.out.printf("%.2f",HalveIt.halveTheNumber(sc.nextDouble()));
		sc.close();
	}
}
