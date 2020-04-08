import java.io.File;
import java.io.IOException;

public class ArrayFermate {
	public static final int MAX_NUM_FERMATE=5;
	public Fermata lista_fermate[];
	private int codice=-1;
	private int i=0;
	//metodo costruttore
	public ArrayFermate()
	{
		lista_fermate=new Fermata[MAX_NUM_FERMATE];
		for(int fermate=0;fermate<MAX_NUM_FERMATE;fermate++)
		{
			lista_fermate[fermate]=new Fermata();
		}
	}
	//metodo set
	public int setfermata(String nome,int zona)
	{
		codice++;
		lista_fermate[codice]=new Fermata(nome,zona);
		return codice;
	}
	//metodo aggiungi 
	public void aggiungifermata(String nome,int zona) throws IOException {
		TextFile out = new TextFile("fermate.txt", 'W');
		try {
			out.toFile(zona + ";" + nome);
		} catch ( FileException exception ) {
			System.out.println(exception.getMatter());
		}
		out.closeFile();

		lista_fermate[i]=new Fermata(nome,zona);
		i++;
	}
	//metodo rimuovi fermata
	public int rimuoviFermata(String nome,int zona) 
	{
		for(int i=0;i<ArrayFermate.MAX_NUM_FERMATE;i++)
		{
			if((lista_fermate[i].getNome().equals(nome)) && (lista_fermate[i].getZona()==zona))
				{	      lista_fermate[i]=null; //rimozione fermata (si setta la fermata a 0)
				         return i; //restituisce la posizione libera fermata cancellata logicamente
				}
		}		
	  return -1; //fermata NON presente
	}
	//metodo stampa fermate
	public void stampa_fermate()
	{
		for(int i=0;i<MAX_NUM_FERMATE;i++)
		{
			System.out.println(lista_fermate[i]);
		}
	}
	//metodo modifica Fermata
	public int modificaZona(String nome,int NuovoValoreZona) 
	{
		for(int i=0;i<ArrayFermate.MAX_NUM_FERMATE;i++)
		{
			if(lista_fermate[i].getNome().equals(nome))
			{	    
				lista_fermate[i].setZona(NuovoValoreZona);
				return i; //restituisce la posizione libera zona cancellata logicamente
			}
		}		
	  return -1; //Zona NON è presente
	}	
	/*public int modificaFermata(String nome,int zona,String nuovafermata) 
	{
		for(int i=0;i<ArrayFermate.MAX_NUM_FERMATE;i++)
		{
			if (lista_fermate[i].getZona()==zona)
			{	      
				lista_fermate[i].setNome(nuovafermata); //rimozione fermata (si setta il nome a 0)
			    return i; //restituisce la posizione libera fermata cancellata
			}
		}		
	  return -1;
	}*/
	//metodo numero corse
	public void numerocorse() 
	{
		for(int i=0;i<MAX_NUM_FERMATE;i++)
			System.out.println("Sono presenti"+i+"fermate");
	}
	//metodo salva fermate nel file di testo
	public void salvaFermate()throws java.io.IOException
	{
		TextFile out=new TextFile("fermate.txt",'W');
		try {
			for(int i=0;i<MAX_NUM_FERMATE;i++)
			{
				if(lista_fermate[i]!=null)
				{
					String line=Integer.toString(i);
					line+=";"+lista_fermate[i].getNome();
					line+=";"+lista_fermate[i].getZona();
					out.toFile(line);
				}
			}
		}
		catch(FileException exception)
		{
			out.closeFile();
		}
	}
	//metodo carica fermate nel file di testo
	public void caricaFermate()throws java.io.IOException
	{
		TextFile in=new TextFile("fermate.txt",'R');
		int zona;
		String nome;
		String []lista_fermate;
		Fermata fermata;
		try {
			while(true)
			{
				nome=in.fromFile();
				lista_fermate=nome.split(";");
				if(lista_fermate.length==10)
				{
					zona=Integer.parseInt(lista_fermate[0]);//casting
					nome=lista_fermate[1];
					fermata=new Fermata(nome,zona);
					setfermata(nome,zona);
				}
			}
		}
		catch(FileException exception)
		{
			
		}
	}
}