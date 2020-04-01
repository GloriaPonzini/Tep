import java.io.IOException;

public class Fermata {

	private int zona;
	private String nome;
	
	public Fermata(int zona, String nome) {
		this.zona = zona;
		this.nome = nome;
	}
	
	public Fermata() {
		nome="";
		zona = 0;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getZona() {
		return zona;
	}


	public void setZona(int zona) {
		this.zona = zona;
	}


	public void addFermata() throws IOException {
		File out = new File("zone.txt", 'W');
		try {
			out.toFile(zona + ";" + nome);
		} catch ( FileException exception ) {
			System.out.println(exception.getMatter());
		}
		out.closeFile();
	}
	
	
	public void rimuovi(int zona, String nome) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
