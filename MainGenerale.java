import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Menu\n 0) Acquistare un biglietto\n 1) Acquistare abbonamento\n 2) Rinnovare abbonamento\n 3) Convalidare biglietto\n 4) Convalidare abbonamento\n 5) Login\n");
		int scelta = -1;
		do {
			try {
				System.out.print("Scelta: ");
				scelta = in.nextInt();
			} catch (InputMismatchException exception) {
				System.out.println("Errore: Inserisci un opzione valida");
				in.next();
			}
		} while(scelta < 0 || scelta > 5);
	
		if (scelta==0) {
			System.out.print("ACQUISTARE BIGLIETTO");
		}
		
		else if (scelta==1){
			System.out.print("ACQUISTARE ABBONAMENTO");
		}
		
		else if (scelta==2){
			System.out.print("RINNOVARE ABBONAMENTO");
		}
		
		else if (scelta==3){
			System.out.print("CONVALIDARE BIGLIETTO");
		}
		
		else if (scelta==4){
			System.out.print("CONVALIDARE ABBONAMENTO");
		}
		
		else if (scelta==5){
			System.out.print("LOGIN");
		}
		
}
	
}
