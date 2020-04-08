import java.io.IOException;

public class TipologieBiglietti {

		 static final int MAX_NUM_BIGLIETTI=5;
		 public TipologiaBiglietto tipBiglietti[];
		 private int i=0;
		 
		 public TipologieBiglietti()
		 {
			 tipBiglietti=new TipologiaBiglietto[MAX_NUM_BIGLIETTI];
					for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
					{
						tipBiglietti[i]=new TipologiaBiglietto();
					}
		 }
		 
		 public int addTipologia(int zona, int durata, double prezzo)throws IOException 
			{	
			//for (int posizione=0; posizione<MAX_NUM_BIGLIETTI; posizione++){
			 TextFile out=new TextFile("fileBiglietti.txt",'W');
			 try {
				 out.toFile(zona+";"+durata+";"+prezzo);
			 }catch(FileException exception) {
				 System.out.println(exception.getMatter());
			 }
			 out.closeFile();
			//}
			 
			 tipBiglietti [i]=new TipologiaBiglietto(zona, durata, prezzo);
				i++;
				return i;		
			}
		 
		 public int rimuoviTipologia(int zona) 
		 {//
		  for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
			{
					if (tipBiglietti[i].getZona()==zona)
					 {	     
							tipBiglietti[i].setZona(0); //rimozione tipologia (si setta la zona a 0)
					        return i; //restituisce la posizione libera tipologia cancellata logicamente
					 }
			}		
		  return -1; //zona NON presente
		 }
			 
		 
		 public void stampaTipologia()
			{
				for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
				{
					if (tipBiglietti[i].getZona()!=0)
					{
						
					System.out.println("-> Numero zone: "+tipBiglietti[i].getZona()+", durata biglietto: "+tipBiglietti[i].getDurata()+", prezzo biglietto: "+tipBiglietti[i].getPrezzo());
				}	
				}
			}
		 
		 
		 
		 
		 public int modificaTipologiaPrezzo(int zona, double nuovoPrezzoB) 
		 {//
		  for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
			{
					if (tipBiglietti[i].getZona()==zona)
					{	      tipBiglietti[i].setPrezzo(nuovoPrezzoB); //rimozione tipologia (si setta la zona a 0)
					         return i; //restituisce la posizione libera tipologia cancellata logicamente
					 }
			}		
		  return -1; //zona NON presente
		 }
		 
		 public int modificaTipologiaDurata(int zona, int nuovoValoreDurata) 
		 {//
		  for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
			{
					if (tipBiglietti[i].getZona()==zona)
					{	      tipBiglietti[i].setDurata(nuovoValoreDurata); //rimozione tipologia (si setta la zona a 0)
					         return i; //restituisce la posizione libera tipologia cancellata logicamente
					 }
			}		
		  return -1; //zona NON presente
		 }
		 
		 public int modificaTipologiaDurataePrezzo(int zona, int nuovoValoreDurata, double nuovoPrezzoB) 
		 {//
		  for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
			{
					if (tipBiglietti[i].getZona()==zona)
					{	      tipBiglietti[i].setDurata(nuovoValoreDurata);
							  tipBiglietti[i].setPrezzo(nuovoPrezzoB);//rimozione tipologia (si setta la zona a 0)
					         return i; //restituisce la posizione libera tipologia cancellata logicamente
					 }
			}		
		  return -1; //zona NON presente
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
/*
		 private int codice=-1;
		 public int setTipBiglietti(TipologiaBiglietto tipB) {
			  try { codice++;
			// inserimento copia di libro in posizione
			   if (tipBiglietti[codice]!=null)
			   tipBiglietti[codice]=new TipologiaBiglietto(tipB);
			   return codice; // restituisce la posizione di inserimento
			  }
			  catch (ArrayIndexOutOfBoundsException exception) {
			   return -1; // posizione non valida
			  }
			 }
		 
		 
			 public TipologiaBiglietto getTipBiglietti(int posizione) {
			  try {
			  // restituisce una copia del libro in posizione
			   return new TipologiaBiglietto(tipBiglietti[posizione]);
			  }
			 catch (ArrayIndexOutOfBoundsException exception) {
			  return null; // posizione non valida: nessun libro restituito
			 }
			  catch (NullPointerException exception) {
			   return null; // posizione vuota: nessun libro restituito
			  }
			 }
			
			 
		
		 
		 
		 
		 public void salvaTipBiglietti() throws java.io.IOException {
			  TextFile out = new TextFile("fileBiglietti.txt", 'W');
			  try {
			    for (int posizione=0; posizione<MAX_NUM_BIGLIETTI; posizione++)
			     if (tipBiglietti[posizione]!=null) {
			      String line = Integer.toString(posizione);
			      line += ";"+tipBiglietti[posizione].getZona();
			      line += ";"+tipBiglietti[posizione].getDurata();
			      line += ";"+tipBiglietti[posizione].getPrezzo();
			      out.toFile(line);
			    }
			  }
			  catch (FileException exception) {
			  }
			  out.closeFile();
			 }
		 
		 
			 public void caricaTipBiglietti() throws java.io.IOException {
			   TextFile in = new TextFile("fileBiglietti.txt", 'R');
			   int posizione;
			   int zona;
			   int durata;
			   double prezzo;
			   String linea;
			   String[] elementi;
			   TipologiaBiglietto tipB;
			   try {
			     while(true) {
			    	 linea = in.fromFile();
			       elementi = linea.split(";");
			       if (elementi.length == 4) {
			         posizione = Integer.parseInt(elementi[0]);
			         zona = Integer.parseInt(elementi[1]);
			         durata = Integer.parseInt(elementi[2]);
			         prezzo = Integer.parseInt(elementi[3]);
			         tipB = new TipologiaBiglietto(zona, durata, prezzo);
			         setTipBiglietti(tipB);
			       }
			    }
			  }
			  catch (FileException exception) {
			  }
			   }*/

			
}
			   
		 
		 
		 
		 
		 

