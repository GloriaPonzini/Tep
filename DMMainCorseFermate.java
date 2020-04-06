import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main  {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayCorse ac=new ArrayCorse();
		ArrayFermate af=new ArrayFermate();
		//salvo su file di testo le fermate 
		TextFile tf=new TextFile("fermate.txt",'R');
		TextFile tf1=new TextFile("fermate.txt",'W');
		//salvo su file di testo le corse
		TextFile t=new TextFile("corse.txt",'R');
		TextFile t1=new TextFile("corse.txt",'W');
		
		Scanner in = new Scanner(System.in);
		int scelta = -1;
		do {
		System.out.println("Menu\n 0) Uscire\n 1) Visualizzare lista corse\n 2) Visualizzare lista fermate\n 3) Aggiungere una corsa\n 4) Aggiungere una fermata\n 5) Rimuovere una corsa\n 6) Rimuovere una fermata\n 7) Modificare una corsa\n 8) Modificare una fermata\n");
		do {
			try {
				System.out.print("Scelta: ");
				scelta = in.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println("Errore: Inserisci un opzione valida");
				in.next();
			}
		} while(scelta < 1 || scelta >8);
				
		if (scelta==1)
		{
			System.out.println("TIPOLOGIE CORSE\n");
			ac.stampa_corsa();
		}
		else if (scelta==2)
		{
			System.out.println("TIPOLOGIE FERMATE\n");
			af.stampa_fermate();
		}
		else if (scelta==3){
			System.out.println ("AGGIUNGERE UNA NUOVA CORSA\n");
			String []nome_fermate;
			double orari_giornalieri;
			String nome_corsa;
			
			System.out.println ("Inserire il nome della corsa: \n");
			nome_corsa= input.nextLine();
			input.nextLine();//svuoto il buffer
			System.out.println ("Inserire gli orari giornalieri: \n");
			orari_giornalieri= input.nextDouble();
			input.nextLine();//svuoto il buffer
			//nome_fermate=input.nextLine(); 
			
			ac.aggiungiCorsa (orari_giornalieri,nome_corsa);
			System.out.println("E' stata aggiunta con successo una nuova corsa!");
			
			System.out.println("Di seguito l'elenco 'Corsa' aggiornato");
			ac.stampa_corsa();			
		}
		
		else if (scelta==4){
			System.out.print("AGGIUNGERE UNA NUOVA FERMATA\n");
			String nome;
			int zona;
			
			System.out.println ("Inserire il nome della fermata: \n");
			nome= input.nextLine();
			input.nextLine();//svuoto il buffer
			System.out.println ("Inserire la zona della fermata \n");
			zona= input.nextInt();
			input.nextLine();//svuoto il buffer
			
			af.aggiungifermata(nome, zona);
			System.out.println("E' stata aggiunta con successo una nuova fermata!");
			
			System.out.println("Di seguito l'elenco 'Fermate' aggiornato");
			af.stampa_fermate();
		}
		
		else if (scelta==5){
			System.out.print("RIMUOVI UNA NUOVA CORSA\n");
			String []nome_fermate;
			double orari_giornalieri;
			String nome_corsa;
			int eliminazione;
		
			System.out.println("Inserire il nome della corsa da eliminare: ");
			nome_corsa = input.nextLine();
			input.nextLine();//svuoto il buffer
			System.out.println("Inserire gli orari giornalieri della corsa da eliminare: ");
			orari_giornalieri = input.nextDouble();
			input.nextLine();//svuoto il buffer
			eliminazione=ac.rimuoviCorsa(orari_giornalieri, nome_corsa);
			System.out.println("E' stata rimossa con successo la corsa con "+nome_corsa+" e orari giornalieri "+orari_giornalieri);
			//System.out.println("Elemento dell'array in posizione ...."+eliminazione);
			System.out.println("Di seguito l'elenco 'Corse' aggiornato");
			ac.stampa_corsa();	
		}	
		//non va 
		else if (scelta==6){
			System.out.print("RIMUOVI UNA NUOVA FERMATA\n");
			String nome1;
			int zona1;
			int eliminazione;
		
			System.out.println("Inserire il nome della fermata da eliminare : ");
			nome1 = input.nextLine();
			input.nextLine();//svuoto il buffer
			System.out.println("Inserire la zona della fermata da eliminare: ");
			zona1 = input.nextInt();
			input.nextLine();//svuoto il buffer 
			
			eliminazione=af.rimuoviFermata(nome1,zona1);
			System.out.println("E' stata rimossa con successo la Fermata con "+nome1+" e con zone "+zona1);
			//System.out.println("Elemento dell'array in posizione ...."+eliminazione);
			System.out.println("Di seguito l'elenco 'Fermate' aggiornato");
			af.stampa_fermate(); 
		}
		
		else if (scelta==7){
			System.out.print("MODIFICA LE CORSE\n");
			String nuovaCorsa;
			Fermata nome_fermate[];
			String nome_corsa;
			double orari_giornalieri;
			
			System.out.println ("Inserire il nome della corsa: \n");
			nome_corsa= input.nextLine();
			input.nextLine();//svuota il buffer
			System.out.println ("Inserire gli orari giornalieri: \n");
			orari_giornalieri=input.nextDouble();
			input.nextLine();//svuota il buffer 
			
			System.out.println ("Inserire la nuova fermata: \n");
			nuovaCorsa= input.nextLine();
			input.nextLine();//svuota il buffer
			ac.modificaCorsa(nome_corsa, orari_giornalieri);
			System.out.println("Modifica effettuata!");
					
			System.out.println("Di seguito l'elenco 'Corse' aggiornato");
			ac.stampa_corsa();
		}
		else if (scelta==8){
			System.out.print("MODIFICA TIPOLOGIA BIGLIETTO\n");
			int zonaFermata;
			String nomeFermata;
			String nuovaZona;
			
			System.out.println ("Modifica del prezzo \n");
			System.out.println ("Inserire il numero di zone della tipologia: \n");
			zonaFermata=input.nextInt();
			System.out.println ("Inserire il numero di la durata della validità della tipologia : \n");
			nomeFermata=input.nextLine();
			
			System.out.println ("Inserire il nuovo prezzo: \n");
			nuovaZona=input.nextLine();
			af.modificaFermata(nomeFermata, zonaFermata, nuovaZona);
			System.out.println("Modifica effettuata!");
			
			System.out.println("Di seguito l'elenco 'Tipolgie Abbonamenti' aggiornato");
			af.stampa_fermate();
		}		
		}while(scelta!=0);
}
}