import java.util.Scanner;

public class SecretMessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c=scan.next().charAt(0);
		System.out.println(MessageDecoder.decodeCharacter(c));

	}

}
