import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class Listaparticipante {
	static int size = 0;
	 static Participantes[] participantes = new Participantes[20];
	
	 
	 public static void importar() {
		try {
			BufferedReader leitura = new BufferedReader(new InputStreamReader(new FileInputStream("participantes.csv")));
	        String linha = null;
		        
	      
	        
	        while ((linha = leitura.readLine()) != null) {
		            String[] Dados = linha.split(",");			      
		             participantes [size] = new Participantes(Dados[0], Dados[1]);
		            System.out.println(Arrays.toString(Dados));
		            System.out.println( "Nome: "+ participantes[size].getNome());
		            System.out.println("Email: "+ participantes[size].getEmail());
		            System.out.println("--------------------------");
		            size++;
		           
		        }
	       
	 		      leitura.close();
	 		      
	 		      
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.",
		          e.getMessage());
		    }

		}

	public static void incluir() {
		  
		try {
			PrintStream out = new PrintStream("participantes.csv");
			
			for (int k=0 ; k<size; k++) {
				out.println(participantes[size].getNome()+participantes[size].getEmail());
				
				
			}
		
			
		} catch (Exception e) {
			Console.println("deu erro volta e conserta!");
		}
	}
	
	
	static void listagem() {
		
		for(int k=0 ; k<size ; k++)
			Console.println(participantes[size].getNome()+" - "+participantes[size].getEmail());
	}
	
}
	
