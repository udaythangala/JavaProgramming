import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find GCD :");
		
		System.out.println("The GCD of two numbers is : "+GCD.findGCD(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

}
