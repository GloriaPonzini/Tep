import java.util.ArrayList;
import java.util.List;

public class Amministratori {
	private List<Amministratore> amministratori;
	
	public Amministratori()
	{
		amministratori = new ArrayList<>();
	}
	
	public void addAmministratore(String nome, String cognome, String email, String username, String password) {
		amministratori.add(new Amministratore(nome, cognome, email, username, password));

}
	
	
	
	
}