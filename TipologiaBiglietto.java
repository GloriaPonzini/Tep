public class TipologiaBiglietto {
		private int zona;
		private int durata;
		private double prezzo;
		
		public int getZona() {
			return zona;
		}

		public void setZona(int zona) {
			this.zona = zona;
		}
		public int getDurata() {
			return durata;
		}
		public void setDurata(int durata) {
			this.durata = durata;
		}
		public double getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

		public TipologiaBiglietto(int zona, int durata, double prezzo) {
			super();
			this.zona = zona;
			this.durata = durata;
			this.prezzo = prezzo;
		}
		
		public TipologiaBiglietto (){
			zona=0;
			durata=0;
			prezzo=0;
		}

		//to String
		public String toString()
		{
			return"Numero zone: "+zona+", durata: "+durata+"min"+", prezzo: "+prezzo;
		}
	}
