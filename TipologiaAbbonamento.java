package tep;

public class TipologiaAbbonamento {
	private float durata;
    private String zona;
    private float prezzo;
    
    public TipologiaAbbonamento(float durata,String zona,float prezzo){
        this.durata=durata;
        this.zona=zona;
        this.prezzo=prezzo;
    }
    
    public TipologiaAbbonamento(TipologiaAbbonamento ta){
        this.durata=ta.getDurata();
        this.zona=ta.getZona();
        this.prezzo=ta.getPrezzo();
    }

	public float getDurata() {
		return durata;
	}

	public void setDurata(float durata) {
		this.durata = durata;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
}
