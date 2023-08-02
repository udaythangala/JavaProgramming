import java.util.Scanner;

public class StringJoiner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(StringJoin.joinStrings( str1, str2));
		sc.close();
	}
	
}
