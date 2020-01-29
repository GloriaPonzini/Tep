public class Utente {
	private String nome;
	private String cognome;
	
	public Utente() {
		nome = null;
		cognome = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String toString() {
		return "Nome utente =" + nome + ", Cognome utente =" + cognome;
	}
	

}
