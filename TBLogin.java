import java.io.File;
import java.util.*;
public class Login {
	
	 public static void main(String[] args) {
		 Autenticazione a = new Autenticazione();
		    Scanner input = new Scanner(System.in);
		    
		    String username;
		    String password;
		    String file = "credenziali.txt";

		    System.out.println("LOGIN");
		    System.out.println("Inserisci username: ");
		    username = input.nextLine();

		    System.out.println("Inserisci password: ");
		    password = input.nextLine();

		    
		    a.verificaLogin(username, password,file);
		    
	 		}
}











