import java.util.Scanner;

public class ReverseOfANumberApp {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to reverse :");
		int n = sc.nextInt();
		ReverseOfANumber r = new ReverseOfANumber();
		int rev = r.reverse(n);
		System.out.println("The reverse of "+n+" is "+r.reverse(n));
		if (rev == n)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}
