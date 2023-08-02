import java.util.Scanner;

public class DoubleTrouble {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(doubleTheNumber(sc.nextInt()));
		sc.close();
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}
}
