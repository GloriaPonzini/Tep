import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MainTest {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

	TipologieBiglietti Tb=new TipologieBiglietti();
	TipologieAbbonamenti Ta=new TipologieAbbonamenti();

	
	TextFile outBigl=new TextFile("fileBiglietti.txt",'W');
	TextFile outAbb=new TextFile("fileAbbonamenti.txt",'W');
	TextFile inBigl=new TextFile("fileBiglietti.txt",'R');
	TextFile inAbb=new TextFile("fileAbbonamenti.txt",'R');
	
	
	
	TipologiaBiglietto Tb1=new TipologiaBiglietto(1, 30, 1.50);
	TipologiaBiglietto Tb2=new TipologiaBiglietto(2, 90, 2.65);
	TipologiaBiglietto Tb3=new TipologiaBiglietto(3, 120, 3.65);
	Tb.addTipologia(1, 30, 1.50);	
	Tb.addTipologia(2, 90, 2.65);
	Tb.addTipologia(3, 120, 3.65);
	
	TipologiaAbbonamento Ta1=new TipologiaAbbonamento("mensile", 1, 60);
	TipologiaAbbonamento Ta2=new TipologiaAbbonamento("annuale", 6, 500);
	TipologiaAbbonamento Ta3=new TipologiaAbbonamento("settimanale", 3, 15);
	Ta.addTipologia("mensile", 1, 60);
	Ta.addTipologia("annuale", 6, 500);
	Ta.addTipologia("settimanale", 3, 15);
	
	
	
	Scanner in = new Scanner(System.in);
	
	int scelta = -1;
	while (scelta!=0) {
	
	System.out.println("\n-----MENU-----\n "
			+ "0) Uscire\n "
			+ "1) Visualizzare lista tipologie\n "
			+ "2) Aggiungere una tipologia di biglietto\n "
			+ "3) Aggiungere una tipologia di abbonamento\n "
			+ "4) Rimuovere una tipologia di biglietto\n "
			+ "5) Rimuovere una tipologia di abbonamento\n "
			+ "6) Modificare una tipologia di biglietto\n "
			+ "7) Modificare una tipologia di abbonamento\n");
	do {
		try {
			System.out.print("Scelta: ");
			scelta = in.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Errore: Inserisci un opzione valida");
			in.next();
		}
	} while(scelta < 0 || scelta > 7);

	
	if (scelta==0) {
		System.out.println("-----Fine-----");
		return;
	}
	
	
	else if (scelta==1){
		System.out.println("\n-----TIPOLOGIE BIGLIETTI: ");
		Tb.stampaTipologia();
		//Tb.caricaTipBiglietti();
		
		System.out.println("\n-----TIPOLOGIE ABBONAMENTI: ");
		Ta.stampaTipologia();
		//Ta.caricaTipAbbonamenti();
		
	}
	
	
	else if (scelta==2){
		System.out.println ("\n-----AGGIUNGERE UNA NUOVA TIPOLOGIA DI BIGLIETTO-----\n");
		int zonaAggB;
		int durataAggB;
		double prezzoAggB;
		
		System.out.println ("Inserire il numero di zone: ");
		zonaAggB= in.nextInt();
		System.out.println ("Inserire la durata della corsa: ");
		durataAggB= in.nextInt();
		System.out.println ("Inserire il prezzo del biglietto: ");
		prezzoAggB= in.nextDouble();
		
		Tb.addTipologia(zonaAggB, durataAggB, prezzoAggB);
		System.out.println("\nE' stata aggiunta con successo una nuova tipologia!");
		
		System.out.println("\nDi seguito l'elenco 'TIPOLOGIE BIGLIETTI' aggiornato");
		Tb.stampaTipologia();

		
	}
	
	
	
	
	else if (scelta==3){
		in.nextLine();
		System.out.print("\n-----AGGIUNGERE UNA NUOVA TIPOLOGIA DI ABBONAMENTO-----\n");
		int zonaAggA;
		String durataAggA;
		double prezzoAggA;
		
		System.out.println ("Inserire validità abbonamento (mensile, annuale ecc..): ");
		durataAggA= in.nextLine();
		System.out.println ("Inserire il numero di zone: ");
		zonaAggA= in.nextInt();
		System.out.println ("Inserire il prezzo dell'abbonamento: ");
		prezzoAggA= in.nextDouble(); 
		
		Ta.addTipologia(durataAggA, zonaAggA, prezzoAggA);
		System.out.println("\nE' stata aggiunta con successo una nuova tipologia!");
		
		System.out.println("\nDi seguito l'elenco 'TIPOLOGIE ABBONAMENTI' aggiornato");
		Ta.stampaTipologia();
		
		
		
		
	}
	
	
	
	
	else if (scelta==4){
		in.nextLine();
		System.out.print("-----RIMUOVI UNA NUOVA TIPOLOGIA DI BIGLIETTO-----\n");
		int eliminazione;
		
		System.out.println("Inserire la zona della tipologia da eliminare: ");
		int zonaRimB = in.nextInt();
		eliminazione=Tb.rimuoviTipologia(zonaRimB);
;		System.out.println("\nE' stata rimossa con successo la Tipologia di Biglietto con "+zonaRimB+" zone");
		//System.out.println("Elemento dell'array in posizione ...."+eliminazione);
		System.out.println("\nDi seguito l'elenco 'TIPOLOGIE BIGLIETTI' aggiornato");
		Tb.stampaTipologia(); 
		
		
	}
	
	
	
	else if (scelta==5){
		in.nextLine();
		System.out.print("-----RIMUOVI UNA NUOVA TIPOLOGIA DI ABBONAMENTO-----\n");
		int zonaRimA;
		String durataRimA;
		int eliminazione;
	
		System.out.println("Inserire la zona della tipologia da eliminare: ");
		zonaRimA = in.nextInt();
		in.nextLine();
		System.out.println("Inserire la durata (mensile, annuale ecc..) della tipologia da eliminare: ");
		durataRimA = in.nextLine();
		eliminazione=Ta.rimuoviTipologia(zonaRimA, durataRimA);
		System.out.println("\nE' stata rimossa con successo la Tipologia di Abbonamento con "+zonaRimA+" di validità "+durataRimA);
		System.out.println("\nDi seguito l'elenco 'TIPOLOGIE ABBONAMENTI' aggiornato");
		Ta.stampaTipologia(); 
	}
	
	
	
	
	else if (scelta==6){
		in.nextLine();
		System.out.print("-----MODIFICA TIPOLOGIA BIGLIETTO-----\n");
		int zonaModB;
		int letturaModB=-1;
		double nuovoPrezzoB;
		int nuovaDurataB;
		
		System.out.println ("Inserire il numero di zone della tipologia che vuoi modificare: ");
		zonaModB= in.nextInt();
		System.out.println (" 1. Se vuoi modificare solo il prezzo \n 2. Se vuoi modificare solo la durata di validità \n 3. Se vuoi modificare entrambi\n");
		do {
			try {
				System.out.print("Scelta: ");
				letturaModB= in.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println("Errore: Inserisci un opzione valida");
				in.next();
			}
		} while(letturaModB < 1 || letturaModB > 3);

		if (letturaModB ==1)
		{
			System.out.println ("\nInserire il nuovo prezzo: ");
			nuovoPrezzoB= in.nextDouble();
			Tb.modificaTipologiaPrezzo(zonaModB, nuovoPrezzoB);
			System.out.println("\nModifica effettuata!");
		}
		else if (letturaModB ==2)
		{
			System.out.println ("\nInserire la nuova durata: ");
			nuovaDurataB= in.nextInt();
			Tb.modificaTipologiaDurata(zonaModB, nuovaDurataB);
			System.out.println("\nModifica effettuata!");
		}
		else if (letturaModB ==3)
		{
			System.out.println ("\nInserire il nuovo prezzo: ");
			nuovoPrezzoB= in.nextDouble();
			System.out.println ("Inserire la nuova durata: ");
			nuovaDurataB= in.nextInt();
			Tb.modificaTipologiaDurataePrezzo(zonaModB,nuovaDurataB, nuovoPrezzoB);
			System.out.println("\nModifica effettuata!");
		}
	
		System.out.println("\nDi seguito l'elenco 'TIPOLOGIE BIGLIETTI' aggiornato");
		Tb.stampaTipologia();
	}
	
	
	
	
	else if (scelta==7){
		System.out.print("-----MODIFICA TIPOLOGIA ABBONAMENTO-----\n");
		int zonaModA;
		String durataModA;
		int nuovoPrezzoA;
		
		System.out.println (" Modifica del prezzo \n");
		System.out.println ("Inserire il numero di zone della tipologia: ");
		zonaModA= in.nextInt();
		in.nextLine();
		System.out.println ("Inserire la validità della tipologia :");
		durataModA= in.nextLine();
		
			System.out.println (" \n Inserire il nuovo prezzo: ");
			nuovoPrezzoA= in.nextInt();
			Ta.modificaTipologiaPrezzo(zonaModA, durataModA, nuovoPrezzoA);
			System.out.println("\nModifica effettuata!");
		
	
		System.out.println("Di seguito l'elenco 'TIPOLOGIE ABBONAMENTI' aggiornato");
		Ta.stampaTipologia();
	}	
}
		
		
		//outBigl.closeFile();
		//outAbb.closeFile();
	}
	
}


