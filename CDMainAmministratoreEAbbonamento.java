package jgvf;

public class MainAAA {

	public static void main(String[] args) {
		Amministratore i1 = new Amministratore("username","password","nome","cognome","e-mail");
		Amministratore i2 = new Amministratore("username","password","nome","cognome","e-mail");
		Amministratore i3 = new Amministratore("username","password","nome","cognome","e-mail");
		Amministratore i4 = new Amministratore("username","password","nome","cognome","e-mail");
		Amministratori a = new Amministratori();
		 a.addAmministratoreControllore(i1) ;
		 a.addAmministratoreControllore(i2) ;
		 a.addAmministratoreControllore(i3) ;
		 
		 System.out.println(a.toString());
		 System.out.println("------------------");
	}
}
