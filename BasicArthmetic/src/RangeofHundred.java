import java.util.Scanner;

public class RangeofHundred {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range :");
		int n = sc.nextInt();
		sc.close();
		RangeOfHundredApp.divTwo(n);
		RangeOfHundredApp.divThree(n);
		RangeOfHundredApp.divFive(n);
		RangeOfHundredApp.divTwoFive(n);
		RangeOfHundredApp.divThreeFive(n);
		RangeOfHundredApp.prime(n);
		RangeOfHundredApp.evenDivThree(n);
		RangeOfHundredApp.oddDivFive(n);
		
		
	}
}
