import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Listaparticipante {
	
	
	
	 
	 public static void impParticipante(String dest) {
		 Palestracert[] participantes = new Palestracert[10];
		 int size = 0;
		 try {
			FileReader Arquivo = new FileReader(dest);
			String linha = new String();//
			Scanner leitura = new Scanner(Arquivo);	

			while(leitura.hasNext()){
				linha = leitura.nextLine();
				String [] campo = linha.split(","); // separador
				participantes[size] = new Palestracert(campo[0],campo[1]);
				size++;
		           
		        }
	       
	 		      leitura.close();
	 		      
	 		      
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.",
		          e.getMessage());
		    }

		}

public static void imprimeCert(String cert){
			

			Pale stracert[] participantes =new Palestracert[10];
			Sala[] sala=null;
			
			for (int i = 0; i < participantes.length; i++) {
				
				if(sala[i].getParticipantes().equals( participantes[i].getNome())){
					
					try{
					FileWriter CertificadoNovo = new FileWriter(cert);
					
					
					CertificadoNovo.append("Certificado de Participação");
					CertificadoNovo.append("/n");
					CertificadoNovo.append("Participante: " + participantes[i]);
					CertificadoNovo.append("/n");
					CertificadoNovo.append("Palestra: "+ sala[i].getPalestra());
					CertificadoNovo.append("/n");
					CertificadoNovo.append("Horario: "+sala[i].getHorario());
					CertificadoNovo.append("/n");
					CertificadoNovo.flush();
					CertificadoNovo.close();
					
					}catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
				
			}
		
		}
	
	
	
}
	
