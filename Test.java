import java.util.*;
public class Test {
	public static void main(String[] args) {	

		Scanner in = new Scanner(System.in);	
		Corse c = new Corse();
		
		do {
			System.out.println("Menu\n 1) Visualizza una corsa\n 2) Modifica una corsa\n 3)Cancella una corsa\n 4)Inserisci una corsa");
			int scelta = -1;
			do {
				try {
					System.out.print("Scelta: ");
					scelta = in.nextInt();
				} catch (InputMismatchException exception) {
					System.out.println("Errore: Inserisci un numero valido");
					in.next();
				}
			} while(scelta < 0 || scelta > 4);			
			if(scelta == 0)
				break;			
			String nomecorsa, data;
			switch(scelta) {
			case 1: {
						System.out.println(c.stampa_corse());
						int sel = -1;
						do {
							try {
								System.out.print("Seleziona una corsa: ");
								sel = in.nextInt() -1;
							} catch (InputMismatchException exception) {
								System.out.println("Errore: Inserisci un numero valido");
								in.next();
							}
						} while(sel >= c.lista_corse() || sel < 0);
						
						in.nextLine(); //svuota il buffer
						
						boolean disp = false;
						do {
							System.out.print("Inserisci la data (GG/MM/AAAA): ");
							data = in.nextLine();
							if(data == "0")
								break;
							disp = c.aggiungicorsa(sel,nomecorsa);
							if(disp){
								System.out.println("Data disponibile");
								break;
							}
							System.out.println("Data non disponibile, reinseriscila o premi 0");
						} while(!disp);
						if(data == "0")
							break;
						System.out.print("Inserisci il tuo nome: ");
						nomecorsa = in.nextLine();
						c.aggiungicorsa(sel, nomecorsa);
						System.out.println();
					}
			break;
			case 2: {
						System.out.println(c.lista_corse());
						int se1 = -1;
						do {
							try {
								System.out.print("Seleziona una corsa: ");
								se1 = in.nextInt() -1;
							} catch (InputMismatchException exception) {
								System.out.println("Errore: Inserisci un numero valido");
								in.next();
							}
						} while(se1 >= c.nCorse() || se1 < 0);
						
						in.nextLine(); //svuota il buffer
						
						System.out.print("Inserisci il tuo nome: ");
						nomecorsa= in.nextLine();
						System.out.print("Inserisci la corsa da rimuovere: ");
						data = in.nextLine();
						c.rimuoviCorsa(se1,nomecorsa);
						System.out.println();
					}
			break;
			}
		} while(true);		
		in.close();
	}	
}