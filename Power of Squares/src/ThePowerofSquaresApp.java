import java.util.Scanner;

public class ThePowerofSquaresApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(squareNumber(sc.nextInt()));
	sc.close();

}
public static int squareNumber(int num)
{
	return num*num;
}
}
