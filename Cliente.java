
public class Cliente {


	private String Nome;
	private String Cognome;
	
	public Cliente(String nome, String cognome) {
		
		Nome = nome;
		Cognome = cognome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String toString() {
		return "Nome Cliente:" + Nome + ", Cognome Cliente:" + Cognome + "";
	}
	
	
	
	
	
}
