import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is prime are not :");
		int n = sc.nextInt();
		sc.close();
		if(n<2)
		{
			System.out.println("Number "+n+"  is not prime ");
		}
		else
		{
			for(int i = 2; i <= n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("Number "+n+"  is not prime  ");
					return;
				}
			}
			System.out.println("Number "+n+"  is prime ");
		}
	}
}
