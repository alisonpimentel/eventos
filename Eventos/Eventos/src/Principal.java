import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	String opcao;
		
		
		
		
		do {
		      System.out.printf("**** Menu Principal *****\n");
		      System.out.printf("[ 1 ] Incluir Contato\n");
		      System.out.printf("[ 2 ] Excluir Contato\n");
		      System.out.printf("[ 3 ] Listar Contatos\n");
		      System.out.printf("[ 4 ] Pesquisar Contato\n");
		      System.out.printf("[ 0 ] Encerrar o Programa\n");
		      System.out.printf("\nOpção Desejada: ");

		      opcao = Console.readString();

		      switch (opcao) {
		        case "1": Listaparticipante.incluir();  break;
		        case "2": Listaparticipante.listagem(); break;
		        case "3": Listaparticipante.importar();  break;
		       
		      }

		      System.out.printf("\n\n");

		    } while (opcao != "0");

		    
		  }



}


