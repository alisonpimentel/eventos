import java.util.Scanner;

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
		      System.out.printf("\nOpção Desejada: ");

		      opcao = Console.readString();

		      switch (opcao) {
		        case "1": importarArquivos.ImportaTudo();  break;
		        case "2": importarArquivos.CriaEvento(); break;
		        case "3": importarArquivos.Sala(); break;
		        case "4": importarArquivos.addParticipantes(); break;
		        case "5": selecionarCertificado(); break;
		        //case "3": Listaparticipante.importar();  break;
		       
		      }

		      System.out.printf("\n\n");

		    } while (opcao != "0");

		    
		  }
	private static int selecionarCertificado(){
		System.out.println("Selecione o tipo de certificado"+"/n"+
				            "1 - Organizador "+"/n"+
				            "2 - Palestrante "+"/n"+
				            "3 - Participante"+"/n");
		int i = new Scanner(System.in).nextInt();
		return i;
	}

private static void MontarCertificado(){
		
		//if(selecionarCertificado()==1){	certificadoOrganizador("CertificadoOrganizador.csv");}
		if(selecionarCertificado()==2){Listaparticipante.imprimeCert("CertPalestrante.csv");}
		//if(selecionarCertificado()==3){certificadoParticipante("CertificadoPalestrante.Csv");}
		else{
			MontarCertificado();
		}
		
	}


}


