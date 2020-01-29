import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		Scanner tastiera= new Scanner (System.in);
		System.out.println("Inserisci il nome:");
	    String nome=tastiera.nextLine();
		
	    System.out.println("Inserisci il cognome:");
	    String cognome=tastiera.nextLine();
		
		
	    
	
	    	
	    	 
	    	
	    	    // Costruisco la struttura del menù
	    	
	    	    System.out.println("Cosa vuoi fare?");
	    	
	    	  
	    	
	    	    System.out.println(" 0-Uscire");
	    	
	    	    System.out.println(" 1-Comprare biglietto o abbonamento ");
	    	
	    	    System.out.println(" 2-Rinnovare abbonamento");
	    	
	    	    Scanner in = new Scanner(System.in);
	    	
	    	 
	    	
	    	    // Acquisisco il valore per la scelta
	    	
	    	    int scelta = in.nextInt();
	    	
	    	 
	    	
	    	    // Effettuo la verifica per l'evento selezionato
	    	
	    	    if ( scelta == 0 ){
	    	
	    	        System.out.println("Fine");
	    	
	    	    }
	    	
	    	 
	    	
	    	    if ( scelta == 1 ){
	    	
	    	        System.out.println("Comprare biglietto o abbonamento");
	    	
	    	    }
	    	
	    	 
	    	
	    	    if (scelta == 2 ){
	    	
	    	        System.out.println("Rinnovare abbonamento" );
	    	
	    	    }
	    	
	    	 
	    	
	    	    // Valore inserito sbagliato
	    	
	    	    if ( scelta != 0 && scelta != 1 && scelta != 2){
	    	
	    	        System.out.println("Valore inserito non corretto, riprova");
	    	
	    	    }
	    	
	    	  }
	    	
	    	

	}


