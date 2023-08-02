import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number :");
		int num2 = sc.nextInt();
		checkMultipleOfTen(num1, num2);
		sc.close();
	}
	 public static void checkMultipleOfTen(int num1, int num2)
		{
		 	if(num1 % num2 == 0)
		 	{
		 		System.out.println("The number "+num1+" is Multiple of "+num2);
		 	}
		 	else
		 	{
		 		System.out.println("The number  "+num1+" is not Multiple of 10"+num2);
		 	}
		}
}
