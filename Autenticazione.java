public class Autenticazione {
	public String username;
	public String password;
	
	public Autenticazione(String password, String username)
	{
		this.password = password;
		this.username = username;
	}
	public Autenticazione()
	{
		username = "";
		password = "";
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
	

}
