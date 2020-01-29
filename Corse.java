public class Corse {
	public Corsa lista_corse[];
	private static final int MAX_NUM_CORSE=5;
	private int codice=-1;
	//metodo costruttore
	public Corse()
	{
		lista_corse=new Corsa[MAX_NUM_CORSE];
		for(int corse=0;corse<MAX_NUM_CORSE;corse++)
		{
			lista_corse[corse]=new Corsa();
		}
	}
	//aggiungi corsa(metodo set corsa)
	public int aggiungicorsa(Corsa caratteristiche_corsa)
	{
		codice++;
		lista_corse[codice]=new Corsa(caratteristiche_corsa);
		return codice;
	}
	//metodo get corsa
	public Corsa getCorsa(int codice)
	{
		return new Corsa(lista_corse[codice]);	
	}
	//elimina corsa
	public int rimuoviCorsa(int codice)
	{
		lista_corse[codice]=null;
		return codice;
	}
	//stampare corsa
	public void stampa_corse()
	{
		for(int i=0;i<MAX_NUM_CORSE;i++)
		{
			System.out.println(lista_corse[i]);
		}
	}
	//numero corse
	public void nCorse() 
	{
		for(int i=0;i<MAX_NUM_CORSE;i++)
		{
			System.out.println("Sono presenti "+i+" corse");
		}
	}
}