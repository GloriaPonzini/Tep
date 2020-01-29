public class TipologieBiglietti {

		 private static final int MAX_NUM_BIGLIETTI=5;
		 private TipologiaBiglietto tipBiglietti[];
		 private GestioneBiglietti biglietti[];
		 private int i=0;
		 
		 public TipologieBiglietti()
		 {
			 tipBiglietti=new TipologiaBiglietto[MAX_NUM_BIGLIETTI];
					for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
					{
						tipBiglietti[i]=new TipologiaBiglietto();
					}
		 }
		 
		 public void GestioneBiglietti()
		 {
			 biglietti=new GestioneBiglietti[MAX_NUM_BIGLIETTI];
					for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
					{
						biglietti[i]=new GestioneBiglietti();
					}
		 }
		 
		 
		 
		 
		 public int addTipologia(int zona, int durata, double prezzo)
			{	
			 tipBiglietti [i]=new TipologiaBiglietto(zona, durata, prezzo);
				i++;
				return i;		
			}
		 
		 public int rimuoviTipologia(int zona) 
		 {//
		  for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
			{
					if (tipBiglietti[i].getZona()==zona)
					
					   //   try {
					{	      tipBiglietti[i].setZona(0); //rimozione tipologia (si setta la zona a 0)
					         return i; //restituisce la posizione libera tipologia cancellata logicamente
					 }
			}		// end for Zona non presente
			 /*catch (ArrayIndexOutOfBoundsException exception) {
			  return -2; //posizione non valida
			 }
			 catch (NullPointerException exception) {
				  return -3; //posizione non valida
				 }
				 */
		  return -1; //zona NON presente
		 }
			 
		 
		 public void stampaTipologia()
			{
				for(int i=0;i<TipologieBiglietti.MAX_NUM_BIGLIETTI;i++)
				{
					if (tipBiglietti[i].getZona()!=0)
					{
						
					System.out.println("Numero zone: "+tipBiglietti[i].getZona()+", durata biglietto: "+tipBiglietti[i].getDurata()+", prezzo biglietto: "+tipBiglietti[i].getPrezzo());
					System.out.println();
				}	
				}
			}
		 
		 
		 public void compraBiglietto(int zona)
			{	
			 int casuale= (int)(Math.random()*999);	
			 int codice=(int)casuale;
			 TipologiaBiglietto t= new TipologiaBiglietto();
			 for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
				{
					if(tipBiglietti[i].getZona()==zona)
					{
						t=tipBiglietti[i];
					}
				}
					for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
					{
						if(tipBiglietti[i].getZona()==zona)
						{
							biglietti[i].addBiglietto(codice, t);
							System.out.println(biglietti[i]);
						}
					}
					if (i==MAX_NUM_BIGLIETTI)
					{
						System.out.println("Operazione annullata");
					}
				}
			}
		 
		 
		 
		 

