package pkgEventos;

import java.util.Scanner;

public class criaEvento {
	static Console a = new Console();
	static Participante[] participante = new Participante[10];
	static Sala[] sala = new Sala[2];
	
	public static void Arquivos(){
		
		 ImportaTudo dado = new ImportaTudo();
		   
		 	dado.impParticipante("participante.csv");
		 		
		 	dado.impPalestrante("palestrante.csv"); 
		 		
		 	dado.impPalestra("palestra.Csv");
		 			 	
		 
	}
	
	
	
	
 public static void Evento(){
		String data;
		System.out.println("Adicioner a datado evento: ");
		
		data = Console.readString();
		if(data!=null){
		Evento evento = new Evento(data);
		}else{
			System.out.println("Evento com data nula, tente novamente");
			Evento();
		}
	}
	
 public static int AddSala(){
		
		System.out.println("Selecione a Palestra : ");
		
		for (int i = 0; i < participante.length; i++) {
			System.out.println("Palestra: "+sala[i].getPalestra() + "Horario: "+sala[i].getHorario());
		}
		int adicionaSala = new Scanner(System.in).nextInt();
		
		return adicionaSala;
 	}

 public static void addParticipante(){
		int escolhaParticipante =0;
		try {
			System.out.println("Selecione o participante que deseja adicionar na sala");
			for (int i = 0; i < participante.length; i++) {
				
				System.out.println(i+ " - Participante: "+participante[i].getNome()+"");
			}
			escolhaParticipante = new Scanner(System.in).nextInt();
			return;
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
				
		
	}
 
 
 public static void addPartPalest(){
		if(sala[AddSala()].getPalestra()!= null && participante[addParticipante()].getNome()!=null){
		sala[AddSala()].setParticipante(participante[addParticipante()]);
		addParticipante();
		}else{
			System.out.println("Erro, tente novamente");
			addPartPalest();
			
		}
		
	}


}
