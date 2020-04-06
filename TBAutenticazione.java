import java.io.File;
import java.util.Scanner;

public class Autenticazione {
	private String username;
	private String password;
	private String file;
	
	private static Scanner x;	

	public Autenticazione(String username, String password){
	    this.username = username;
	    this.password = password;
	}

	public Autenticazione()
	{
		password = "";
		username = "";
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
	
	public static void verificaLogin(String username, String password, String file)
 	{
		boolean cerca = false;
		String tempUsername = "";
		String tempPassword = "";
		
		try
		{
			x = new Scanner(new File(file));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext() && !cerca)
			{
				tempUsername = x.next();
				tempPassword = x.next();
				
				if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
				{
					cerca = true;
				}
			}
			x.close();
			System.out.println(cerca);
		}
		catch(Exception e)
		{
			System.out.println("Errore");
		}
 	}


}