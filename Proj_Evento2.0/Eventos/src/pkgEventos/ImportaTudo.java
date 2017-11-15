package pkgEventos;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ImportaTudo {
	
	public static void impPalestrante(String Arq){
			
			Palestrante [] palestrante = new Palestrante[3];
	
			int cont=0;
			try
			{
				FileReader arquivo = new FileReader(Arq);
				String linha = new String();
				Scanner leitura = new Scanner(arquivo);	
				
				while(leitura.hasNext()){
					linha = leitura.nextLine();
					String [] campo = linha.split(","); 
						if(palestrante[cont]!=null){ 
						
							palestrante[cont] = new Palestrante(campo[0],campo[1],campo[2]);
						}
					arquivo.close();
					}
					cont++;
				
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			cont = 0;
			
		}

	public static void impParticipante(String Arq){
		
		Participante[] participante= new Participante[10];
		int cont=0;
		try
		{
			FileReader arquivo = new FileReader(Arq);
			String linha = new String();
			Scanner leitura = new Scanner(arquivo);	
			
			while(leitura.hasNext()){
				linha = leitura.nextLine();
				String [] campo = linha.split(","); 
					if(participante[cont]!=null){ 
					
						participante[cont] = new Participante(campo[0],campo[1]);
					}
				arquivo.close();
				}
				cont++;
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		cont = 0;
		
	}
	
	public static void impPalestra(String Arq){
		
		Palestra [] palestra = new Palestra[4];
		int cont=0;
		try
		{
			FileReader arquivo = new FileReader(Arq);
			String linha = new String();
			Scanner leitura = new Scanner(arquivo);	
			
			while(leitura.hasNext()){
				linha = leitura.nextLine();
				String [] campo = linha.split(","); 
					if(palestra[cont]!=null){ 
					
						palestra[cont] = new Palestra(campo[0],campo[1]);
					}
				Console.println("Importação OK!!");	
				arquivo.close();
				}
				cont++;
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		cont = 0;
		
	}
	
	
}
