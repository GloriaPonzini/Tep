import java.io.IOException;

public class TipologieAbbonamenti {
	 public static final int MAX_NUM_ABBONAMENTI=5;
	 public TipologiaAbbonamento tipAbbonamenti[];
	 private int i=0;
	 
	 public TipologieAbbonamenti()
	 {
		 tipAbbonamenti=new TipologiaAbbonamento[MAX_NUM_ABBONAMENTI];
				for(int i=0;i<MAX_NUM_ABBONAMENTI;i++)
				{
					tipAbbonamenti[i]=new TipologiaAbbonamento();
				}
	 }
	 
	 public int addTipologia(String zona, int durata, double prezzo)throws IOException 
		{	
		 TextFile out=new TextFile("fileAbbonamenti.txt",'W');
		 try {
			 out.toFile(zona+";"+durata+";"+prezzo);
		 }catch(FileException exception) {
			 System.out.println(exception.getMatter());
		 }
		 out.closeFile();
		 tipAbbonamenti [i]=new TipologiaAbbonamento(zona, durata, prezzo);
			i++;
			return i;		
		}
	 
	 public int rimuoviTipologia(int zona, String durata) 
	 {
	  for(int i=0;i<TipologieAbbonamenti.MAX_NUM_ABBONAMENTI;i++)
		{
				if((tipAbbonamenti[i].getZona()==zona) && (tipAbbonamenti[i].getDurata().equals(durata)))
				
				   //   try {
				{	      tipAbbonamenti[i].setZona(0); //rimozione tipologia (si setta la zona a 0)
				         return i; //restituisce la posizione libera tipologia cancellata logicamente
				}
		}		
	  return -1; //zona NON presente
	 }
	 
	 public void stampaTipologia()
		{
			for(int i=0;i<TipologieAbbonamenti.MAX_NUM_ABBONAMENTI;i++)
			{
				if (tipAbbonamenti[i].getZona()!=0)
				{
				System.out.println("-> Numero zone: "+tipAbbonamenti[i].getZona()+", durata biglietto: "+tipAbbonamenti[i].getDurata()+", prezzo biglietto: "+tipAbbonamenti[i].getPrezzo());
			}	
			}
		}
	 
	 
	 public int modificaTipologiaPrezzo(int zona, String durata, int nuovoValorePrezzo) 
	 {//
	  for(int i=0;i<TipologieAbbonamenti.MAX_NUM_ABBONAMENTI;i++)
		{
				if((tipAbbonamenti[i].getZona()==zona) && (tipAbbonamenti[i].getDurata().equals(durata)))
				{	      tipAbbonamenti[i].setPrezzo(nuovoValorePrezzo); //rimozione tipologia (si setta la zona a 0)
				         return i; //restituisce la posizione libera tipologia cancellata logicamente
				 }
		}		
	  return -1; //zona NON presente
	 }
	 
	 
		 
		 private int codice=-1;
		 public int setTipAbbonamenti(TipologiaAbbonamento tipA) {
			  try { codice++;
			// inserimento copia di libro in posizione
			   if (tipAbbonamenti[codice]!=null)
			   tipAbbonamenti[codice]=new TipologiaAbbonamento(tipA);
			   return codice; // restituisce la posizione di inserimento
			  }
			  catch (ArrayIndexOutOfBoundsException exception) {
			   return -1; // posizione non valida
			  }
			 }
		 
		 
		 public TipologiaAbbonamento getTipAbbonamenti(int posizione) {
			  try {
			  // restituisce una copia del libro in posizione
			   return new TipologiaAbbonamento(tipAbbonamenti[posizione]);
			  }
			 catch (ArrayIndexOutOfBoundsException exception) {
			  return null; // posizione non valida: nessun libro restituito
			 }
			  catch (NullPointerException exception) {
			   return null; // posizione vuota: nessun libro restituito
			  }
			 }
	 
	 
	 
	 public void salvaTipAbbonamenti() throws java.io.IOException {
		  TextFile out = new TextFile("fileAbbonamenti.txt", 'W');
		  try {
		    for (int posizione=0; posizione<MAX_NUM_ABBONAMENTI; posizione++)
		     if (tipAbbonamenti[posizione]!=null) {
		      String line = Integer.toString(posizione);
		      line += ";"+tipAbbonamenti[posizione].getDurata();
		      line += ";"+tipAbbonamenti[posizione].getZona();
		      line += ";"+tipAbbonamenti[posizione].getPrezzo();
		      out.toFile(line);
		    }
		  }
		  catch (FileException exception) {
		  }
		  out.closeFile();
		 }
	 
		 public void caricaTipAbbonamenti() throws java.io.IOException {
		   TextFile in = new TextFile("fileAbbonamenti.txt", 'R');
		   int posizione;
		   String durata;
		   int zona;
		   double prezzo;
		   String linea;
		   String[] elementi;
		   TipologiaAbbonamento tipA;
		   try {
		     while(true) {
		    	 linea = in.fromFile();
		       elementi = linea.split(";");
		       if (elementi.length == 4) {
		         posizione = Integer.parseInt(elementi[0]);
		         durata = elementi[1];
		         zona = Integer.parseInt(elementi[2]);
		         prezzo = Integer.parseInt(elementi[3]);
		         tipA = new TipologiaAbbonamento(durata, zona, prezzo);
		         setTipAbbonamenti(tipA);
		       }
		    }
		  }
		  catch (FileException exception) {
		  }
		   }
}

	 
