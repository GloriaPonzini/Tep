import java.io.IOException;
import java.util.Scanner;
public class Main2 {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		
		//MENU'
		
		System.out.println("Cosa vuoi fare?");
		
		
		System.out.println("0-Uscire");
		System.out.println("1-Creare zona e fermata");
		
		
		//acquisisco il valore per la scelta
		
		Scanner tastiera= new Scanner (System.in);
		int scelta=tastiera.nextInt();
		
		//Effettuo la verifica per l'evento selezionato
		
		if( scelta==0) {
			System.out.println("Fine");
		}
		
				
	
	if(scelta==1) {
		
		System.out.println("Inserisci il numero della zona");
		int zona=tastiera.nextInt();
		tastiera.nextLine();
		System.out.println("Inserisci il nome della fermata");
		String fermata=tastiera.nextLine();
		Fermata f = new Fermata(zona, fermata);
		f.addFermata();
	}
	


	
	if(scelta !=0 && scelta!=1 ){
		System.out.println("Il valore inserito non è corretto, riprova");
	}
}
}