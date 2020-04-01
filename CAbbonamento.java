package jgvf;

public class Abbonamento {
	//attributi
		private String id_abbonamento;
		private String tipologia;
		private int durata; //aggiunto

		//default
		public Abbonamento() {
			id_abbonamento = null;
			tipologia = null;
			durata = 0;
		}

		public int getDurata() {
			return durata;
		}

		public void setDurata(int durata) {
			this.durata = durata;
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
		
		//Inizio aggiunta
		 public void rinnovaAbbonamento(Abbonamento id_abbonamento, int durata){
			 this.durata = this.durata + durata;
			  toString(); 
			return ;
		}
		 
		 //Fine aggiunta
		public String toString() {
			return "ID =" + id_abbonamento + ", Tipologia abbonamento =" + tipologia + ", Durata abbonamento =" + durata;
		}
}
