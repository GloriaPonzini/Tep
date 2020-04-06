public class Corsa {
		//private Fermata nome_fermate[];
		private static final int MAX_NUM_FERMATE=3;
		private double orari_giornalieri;
		private String nome_corsa;
		private int codice=-1;
		//metodo costruttore
		public Corsa(double orari_giornalieri,String nome_corsa)
		{
			this.orari_giornalieri=orari_giornalieri;
			this.nome_corsa=nome_corsa;
			//this.nome_fermate=nome_fermate;
		}
		//metodo di default
		public Corsa()
		{
			/*nome_fermate=new Fermata[MAX_NUM_FERMATE];
			for(int fermate=0;fermate<MAX_NUM_FERMATE;fermate++)
			{
				nome_fermate[fermate]=new Fermata();
			}*/
			this.orari_giornalieri=0;
			this.nome_corsa=null;
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
		public Fermata getFermata(int codice)
		{
			return new Fermata ();
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
		/*public void setFermata(Fermata nome_fermate[])
		{
			this.nome_fermate=nome_fermate;
		}*/
		//metodo toString
		public String toString()
		{
			return "Orari gionalieri: "+orari_giornalieri+" Nome corsa: "+nome_corsa;
		}
}