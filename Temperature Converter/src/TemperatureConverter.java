import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature in Fahrenheit :");
	System.out.printf("%.2f",ConvertTemp.convertFahrenheitToCelsius(sc.nextDouble()));
	sc.close();
}

}
