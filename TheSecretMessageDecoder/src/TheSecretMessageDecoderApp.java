import java.util.Scanner;

public class TheSecretMessageDecoderApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	TheSecretMessageDecoder sm = new TheSecretMessageDecoder();
	System.out.println(sm.decodeCharacter(ch));
	sc.close();
}
}
