package pkgEventos;
import java.io.FileReader;
import java.util.Scanner;

public class Console {
	
	private static Scanner ler = new Scanner(System.in);

	public Console(FileReader arquivo) {
		this.getClass();
	}

	public Console() {
		// TODO Auto-generated constructor stub
	}

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
	public static int readInt() {
		return getLer().nextInt();
	}

	public String nextLine() {
		return nextLine();
	}

	public boolean hasNext() {
		return this.hasNext();
	}

}
