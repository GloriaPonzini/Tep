
public class Amministratore {
		private String username;
		private String password;
		private String nome;
		private String cognome;
		private String email;
		
		public Amministratore(String username,String password,String nome,String cognome,String email) {
			this.username = username;
			this.password = password;
			this.cognome = cognome;
			this.nome = nome;
			this.email = email;
		}
		
		public Amministratore() {
			password = "";
			nome = "";
			username = "";
			email = "";
			cognome = "";
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
}
