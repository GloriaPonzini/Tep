import java.util.Random;
import java.util.Scanner;
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
	TipologieBiglietti t=new TipologieBiglietti();
	
	System.out.println("Tipologie di biglietti disponibili");
	t.addTipologia(1, 30, 1.50);
	t.addTipologia(2, 90, 2.65);
	t.addTipologia(3, 120, 3.65);
	t.addTipologia(4, 160, 4.5);
	t.addTipologia(5, 180, 5.0);
	
	t.stampaTipologia();
	
	
	System.out.println("Inserire la zona della tipologia da eliminare: ");
	int zona = input.nextInt();
	
	int posizione=t.rimuoviTipologia(zona);
	System.out.println("tipologia rimossa della zona...."+zona);
	System.out.println("Elemento dell'array in posizione ...."+posizione);
	
	t.stampaTipologia(); 
	
	
	
	System.out.println("Da quante zone vuoi acquistare il biglietto?");
	int num = input.nextInt();
	System.out.println("Info biglietto");
	t.compraBiglietto(num);
	
	
	//generazione codice random 
	
	//int casuale= (int)(Math.random()*999);		//numero generato da 1 a  5
	
	//GestioneBiglietti b=new GestioneBiglietti();
	//b.addBiglietto(cod);
	
	//int zonaTipologia=(int)casuale;
	//System.out.println (zonaTipologia);
		
	}


	}


