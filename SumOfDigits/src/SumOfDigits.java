import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number : ");
		calculateSumOfDigits(sc.nextInt());
		sc.close();
	}
	public static void  calculateSumOfDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("The sum of digits of the provided number is :" + sum);
	}
}
