import java.io.IOException;
public class ArrayCorse {
	public Corsa lista_corse[];
	public static final int MAX_NUM_CORSE=5;
	public static final Fermata[] Fermata = null;
	private int codice=0;
	private int i=0;
	//metodo costruttore
	public ArrayCorse()
	{
		lista_corse=new Corsa[MAX_NUM_CORSE];
		for(int corse=0;corse<MAX_NUM_CORSE;corse++)
		{
			lista_corse[corse]=new Corsa();
		}
	}
	//metodo set corsa
	public int setcorsa(double orari_giornalieri,String nome_corsa)
	{			
		lista_corse[codice]=new Corsa(orari_giornalieri,nome_corsa);
		codice++;
		return codice;		
	}
	//metodo aggiungi 
	public void aggiungiCorsa(double orari_giornalieri,String nome_corsa)throws IOException {
		TextFile out = new TextFile("corse.txt", 'W');
		try {
			out.toFile(orari_giornalieri + ";" + nome_corsa);
		} catch ( FileException exception ) {
			System.out.println(exception.getMatter());
		}
		out.closeFile();
		
		lista_corse[i]=new Corsa(orari_giornalieri,nome_corsa);
		i++;
	}
	//metodo elimina corsa
	public int rimuoviCorsa(double orari_giornalieri,String nome_corsa) 
	{
		for(int i=0;i<ArrayCorse.MAX_NUM_CORSE;i++)
		{
			if((lista_corse[i].getOrari_giornalieri()==orari_giornalieri) && (lista_corse[i].getNome_corsa().equals(nome_corsa)))
			{	      
				lista_corse[i]=null; //rimozione corsa (si setta la zona a 0)
				return i; //restituisce la posizione libera corsa cancellata logicamente
			}
		}		
		return -1; //zona NON presente
	}
	//metodo stampare corsa
	public void stampa_corsa()
	{
		for(int i=0;i<MAX_NUM_CORSE;i++)
		{
			System.out.println(lista_corse[i]);
		}
	}
	//metodo modifica corsa
	public int modificaCorsa(String nome_corsa,double orari_giornalieri) 
	{
		for(int i=0;i<ArrayCorse.MAX_NUM_CORSE;i++)
		{
			if (lista_corse[i].getNome_corsa()==nome_corsa)
			{	      
				lista_corse[i].setNome_corsa(nome_corsa); 
				lista_corse[i].setOrari_giornalieri(orari_giornalieri);
			    return i; 
			}
		}		
		 return -1;
	}
	//metodo numero corse
	public void numerocorse() 
	{
		for(int i=0;i<MAX_NUM_CORSE;i++)
		{
			System.out.println("Sono presenti"+i+"corse");
		}
	}
	//metodo salva corse nel file di testo
	public void salvaCorse()throws java.io.IOException
	{
		TextFile out=new TextFile("corse.txt",'W');
		try {
			for(int i=0;i<MAX_NUM_CORSE;i++)
			{
				if(lista_corse[i]!=null)
				{
					String line=Integer.toString(i);
					line+=";"+lista_corse[i].getNome_corsa();
					line+=";"+lista_corse[i].getOrari_giornalieri();
					out.toFile(line);
				}
			}
		}
		catch(FileException exception)
		{
			out.closeFile();
		}
	}
	//metodo carica corse nel file di testo
	public void caricaCorse()throws java.io.IOException
	{
		TextFile in=new TextFile("corse.txt",'R');
		double orari_giornalieri;
		String nome_corsa;
		String [] lista_corse;
		Corsa corsa;
		
		try {
			while(true)
			{
				nome_corsa=in.fromFile();
				lista_corse=nome_corsa.split(";");
				if(lista_corse.length==10)
				{
					orari_giornalieri=Integer.parseInt(lista_corse[0]);//casting
					nome_corsa=lista_corse[1];
					corsa=new Corsa(orari_giornalieri,nome_corsa);
				}
			}
		}
		catch(FileException exception)
		{
			
		}
	}
}