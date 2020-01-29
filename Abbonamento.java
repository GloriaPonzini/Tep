public class Abbonamento {
	//attributi
	private String id_abbonamento;
	private String tipologia;

	//default
	public Abbonamento() {
		id_abbonamento = null;
		tipologia = null;
	}

	public String getId_abbonamento() {
		return id_abbonamento;
	}

	public void setId_abbonamento(String id_abbonamento) {
		this.id_abbonamento = id_abbonamento;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String toString() {
		return "ID =" + id_abbonamento + ", Tipologia abbonamento =" + tipologia;
	}
	
}
