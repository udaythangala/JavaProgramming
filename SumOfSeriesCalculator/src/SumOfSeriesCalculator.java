import java.util.Scanner;

public class SumOfSeriesCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range, such that the sum in the given sequence is calculated :");
		int n = sc.nextInt();
		calculateSumOfSeries(n);
		sc.close();

	}
	public static void calculateSumOfSeries(int n)
	{
		double sum = 0;
		for(int i = 1; i <= n; i++)
		{
			sum = sum + 1.0 / i;

		}
		System.out.println("The sum of the series upto "+n+" is : " +sum);
	}
}
