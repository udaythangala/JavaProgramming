import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factors :");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i+ " is facotr of "+n);
			}
		}
		sc.close();
	}

}
