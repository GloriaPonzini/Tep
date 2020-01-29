import java.util.*;
public class Test {


	 public static void main(String[] args) {
		 Amministratori a = new Amministratori();
		 Scanner in = new Scanner(System.in);
		 
		 String nome, cognome, email, username, password;
			
		 do {
			System.out.println("Menu\n 1) Registrati\n 2) Login\n 0) Esci");
			int scelta = -1;
			do {
			try {
					System.out.print("Scelta: ");
					scelta = in.nextInt();
					} catch (InputMismatchException exception) {
						System.out.println("Errore: Inserisci un numero valido");
						in.next();
					}
				} while(scelta < 0 || scelta > 2);
				
				if(scelta == 0)
					break;
				
				switch(scelta) {
				case 1: {
					
						System.out.print("Inserisci il tuo nome: ");
						nome = in.nextLine();
						in.next();
						System.out.print("Inserisci il tuo cognome: ");
						cognome = in.nextLine();
						System.out.print("Inserisci il tuo username: ");
						username = in.nextLine();
						System.out.print("Inserisci la tua email: ");
						email = in.nextLine();
						System.out.print("Inserisci la password: ");
						password = in.nextLine();
						a.addAmministratore(nome, cognome, email, username, password);
						System.out.println();
					
						}
				break;
				case 2: {
							System.out.println("Inserire username: ");
							username = in.nextLine();
							in.next();
							System.out.println("Inserire password: ");
							password = in.nextLine();
							in.next();
							
						}
				break;
				}
			} while(true);
			
			in.close();
		}
}
