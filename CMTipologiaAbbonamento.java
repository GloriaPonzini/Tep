public class TipologiaAbbonamento {
		//attributi
		private String durata;
		private int zona;
		private double prezzo;
		
		public TipologiaAbbonamento(String durata, int zona, double prezzo) {
			super();
			this.durata = durata;
			this.zona = zona;
			this.prezzo = prezzo;
		}
		
		//default
				public TipologiaAbbonamento() {
					durata = durata;
					zona = zona;
					prezzo = prezzo;
				}

		public TipologiaAbbonamento(TipologiaAbbonamento tipA) {
			durata = durata;
			zona = zona;
			prezzo = prezzo;
				}

		public String getDurata() {
			return durata;
		}
		public void setDurata(String durata) {
			this.durata = durata;
		}
		public int getZona() {
			return zona;
		}
		public void setZona(int zona) {
			this.zona = zona;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}
		
		public String toString() {
			return "Durata =" + durata + ", Zona =" + zona + ", Prezzo =" + prezzo;
		}
		
		
}
