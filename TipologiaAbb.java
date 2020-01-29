public class TipologiaAbb {
		//attributi
		private String durata;
		private String zona;
		private int prezzo;
		
		//default
		public TipologiaAbb() {
			durata = null;
			zona = null;
			prezzo = 0;
		}
		public String getDurata() {
			return durata;
		}
		public void setDurata(String durata) {
			this.durata = durata;
		}
		public String getZona() {
			return zona;
		}
		public void setZona(String zona) {
			this.zona = zona;
		}
		public int getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(int prezzo) {
			this.prezzo = prezzo;
		}
		
		public String toString() {
			return "Durata =" + durata + ", Zona =" + zona + ", Prezzo =" + prezzo;
		}
		
		
}
