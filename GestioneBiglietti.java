public class GestioneBiglietti {

	private static final int MAX_NUM_BIGLIETTI=5;
	 private Biglietto biglietti[];
	 private int i=0;
	 
	 public GestioneBiglietti()
	 {
		 biglietti=new Biglietto[MAX_NUM_BIGLIETTI];
				for(int i=0;i<MAX_NUM_BIGLIETTI;i++)
				{
					biglietti[i]=new Biglietto();
				}
	 }
	 
	 public int addBiglietto(int codice, TipologiaBiglietto tip)
		{
		 biglietti [i]=new Biglietto(codice, tip);
			i++;
			return i;		
		}
	 
	 
	 
}

