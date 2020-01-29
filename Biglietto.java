public class Biglietto {
	private int codice;
	private TipologiaBiglietto tip;
	
	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}
	public TipologiaBiglietto getTip() {
		return tip;
	}
	public void setTip(TipologiaBiglietto tip) {
		this.tip = tip;
	}
	
	public Biglietto(int codice, TipologiaBiglietto tip) {
		this.codice = codice;
		this.tip = tip;
	}
	
	public Biglietto (){
		codice=0;
		tip=null;
	}
	
	public Biglietto(int codice) {
		this.codice = codice;
	}
	

	//to String
	public String toString()
	{
		return"Codice biglietto: "+codice+", tipologia: "+tip;
	}
}

