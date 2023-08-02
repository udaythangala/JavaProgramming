import java.util.Scanner;
public class FibonacciSeriesAapp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to print series :");
		FibonacciSeries fb = new FibonacciSeries();
		fb.fibonacciSeries(sc.nextInt());
		sc.close();

	}

}
