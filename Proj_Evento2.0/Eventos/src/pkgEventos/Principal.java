package pkgEventos;

public class Principal {

	public static void main(String[] args) {
String opcao;
		
		
		
		
		do {
		      System.out.printf("**** Menu Principal *****\n");
		      System.out.printf("[ 1 ] Importar Arquivos\n");
		      System.out.printf("[ 2 ] Cria Evento\n");
		      System.out.printf("[ 3 ] Escolhe Sala\n");
		      System.out.printf("[ 4 ] Adiciona Participante na sala\n");
		      System.out.printf("[ 0 ] Encerrar o Programa\n");
		      System.out.printf("\nOp��o Desejada: ");

		      opcao = Console.readString();

		      switch (opcao) {
		        case "1": criaEvento.Arquivos(); break;
		        case "2": criaEvento.Evento(); break;
		        case "3": criaEvento.AddSala(); break;
		        case "4": criaEvento.addParticipante(); break;
		        case "5": ; break;
	
		       
		      }

		      System.out.printf("\n\n");

		    } while (opcao != "0");

		    
	}
		





}

	

