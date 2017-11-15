import java.util.Scanner;

public class Console {
	
	private static Scanner ler = new Scanner(System.in);

	public static void println(Object mensagem) {
		System.out.println(mensagem.toString());
	}

	public static String readString() {
		return getLer().nextLine();
}

	public static Scanner getLer() {
		return ler;
	}

	public static void setLer(Scanner ler) {
		Console.ler = ler;
	}
	
	private static Scanner scan() {
		return new Scanner(System.in);
	}

	
}
