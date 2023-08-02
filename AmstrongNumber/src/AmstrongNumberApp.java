import java.util.Scanner;

public class AmstrongNumberApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is Armstrong or not :");
		int n = sc.nextInt();
		int actual = n;
		int count = 0;
		while(n != 0)
		{
			n = n / 10;
			count++;
		}
		AmstrongNumber an = new AmstrongNumber();
		int res = an.amstrongNumber(actual, count);
		if(actual == res)
			System.out.println(actual+" is a Armstrong Number!");
		else
			System.out.println(actual+" is Not an Armstrong Number!");
		sc.close();
	}

}
