import java.util.Scanner;

public class ThePlanetExplorerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of planet :");
		ThePlanetExplorer pe = new ThePlanetExplorer();
		System.out.printf("%.2f",pe.calculateSurfaceArea(sc.nextDouble()));
		sc.close();
	}
}
