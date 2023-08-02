import java.util.Scanner;

public class JourneyCalculato {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double speed = sc.nextDouble();
	double time = sc.nextDouble();
	JourneyCalculato cd = new JourneyCalculato();
	System.out.printf("%.2f\n",cd.calculateDistance(speed, time));
	sc.close();
}
public double calculateDistance(double speed, double time)
{
	return speed/time;
}
}
