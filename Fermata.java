public class Fermata {
	private String nome;
	private int zona;
	//metodo cotruttore
	public Fermata(String nome,int zona)
	{
		this.nome=nome;
		this.zona=zona;
	}
	//metodo di default
	public Fermata()
	{
		this.nome=null;
		this.zona=0;
	}
	//metodo di copia
	public Fermata(Fermata caratteristiche_fermata)
	{
		this.nome=caratteristiche_fermata.getNome();
		this.zona=caratteristiche_fermata.getZona();
	}
	//metodo get 
	public String getNome()
	{
		return nome;
	}
	public int getZona()
	{
		return zona;
	}
	//metodo set
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	public void setZona(int zona)
	{
		this.zona=zona;
	}
	//metodo toString
	public String toString()
	{
		return "Nome fermata: "+nome+" Numero zona: "+zona; 
	}
}