import java.lang.Math;
public class MathMethods {

	public static void main(String[] args) {
		int num = -56;
        System.out.println("Absolute value of " + num + " is : " + Math.abs(num));
        double num1 = 73.0;
        System.out.println("\nSquare root of " + num1 + ": " + Math.sqrt(num1));
        double base = 23.0;
        double exponent = 9.0;
        System.out.println("\n"+base + " raised to the power of " + exponent + ": " +  Math.pow(base, exponent));
        double angle = Math.PI / 4;  
        System.out.println("\nSine of " + angle + " : " + Math.sin(angle));
        System.out.println("\nCosine of " + angle + " : " + Math.cos(angle));
        System.out.println("\nTangent of " + angle + " : " + Math.tan(angle));
	}

}
