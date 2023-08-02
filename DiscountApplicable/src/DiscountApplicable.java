import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount spent :");
		double purchaseAmount = sc.nextDouble();
		checkDiscount(purchaseAmount);
		sc.close();
	}
	public static void checkDiscount(double purchaseAmount)
	{ 
		if(purchaseAmount > 100)
		{
			System.out.println("Discount applicable");
		}
		else
		{
			System.out.println("Discount not applicable");
		}
	}

}
