public class Corsa {
	private Fermata nome_fermate[];
	private static final int MAX_NUM_FERMATE=3;
	private double orari_giornalieri;
	private String nome_corsa;
	//metodo costruttore
	public Corsa(double orari_giornalieri,String nome_corsa)
	{
		this.orari_giornalieri=orari_giornalieri;
		this.nome_corsa=nome_corsa;
	}
	public Corsa()
	{
		nome_fermate=new Fermata[MAX_NUM_FERMATE];
		for(int fermate=0;fermate<MAX_NUM_FERMATE;fermate++)
		{
			nome_fermate[fermate]=new Fermata();
		}
		this.orari_giornalieri=0;
		this.nome_corsa="";
	}
	//metodo di copia
	public Corsa(Corsa caratteristiche_corsa)
	{
		this.orari_giornalieri=caratteristiche_corsa.getOrari_giornalieri();
		this.nome_corsa=caratteristiche_corsa.getNome_corsa();
	}
	//metodo get
	public double getOrari_giornalieri()
	{
		return orari_giornalieri;
	}
	public String getNome_corsa()
	{
		return nome_corsa;
	}
	//metodo set 
	public void setOrari_giornalieri(double orari_giornalieri)
	{
		this.orari_giornalieri=orari_giornalieri;
	}
	public void setNome_corsa(String nome_corsa)
	{
		this.nome_corsa=nome_corsa;
	}
	//metodo toString
	public String toString()
	{
		return "Orari gionalieri: "+orari_giornalieri+" Nome corsa: "+nome_corsa;
	}
}