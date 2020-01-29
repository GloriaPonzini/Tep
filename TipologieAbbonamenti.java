package tep;

public class TipologieAbbonamenti {
		 private TipologiaAbbonamento info;
		 private TipologieAbbonamenti link;
		private TipologieAbbonamenti pn;
		private int elementi;
		private TipologieAbbonamenti head;
 
		public TipologieAbbonamenti() {
			 info=new TipologiaAbbonamento(info);
		     link=null;		}

		public void setInfo(TipologiaAbbonamento tipologie){
		     info=new TipologiaAbbonamento(tipologie);
		 }

		 public TipologiaAbbonamento getInfo(){
		     return new TipologiaAbbonamento(info);
		 }

		 protected void setLink(TipologieAbbonamenti link){
		     this.link=link;
		 }

		 public TipologieAbbonamenti getLink(){
		     return link;
		 }
		 
		 public void  vediTipologieAbbonamenti() {
			TipologieAbbonamenti p = head;
			 
			 while (p != null) {
			 esamina (p.getInfo());
			 p = p.getLink();
			 }
			 
			
			 
			 if (p==null)
				 inserisciInTesta();
			 
			 else while (p.getLink() != null)
				 p=p.getLink();
			 
			 pn.setLink(null);
			 p.setLink(pn);
			 elementi++;
			}

		 public void inserisciInCoda() {
			 TipologieAbbonamenti p = head;
			 TipologieAbbonamenti pn = new TipologieAbbonamenti();
		 }

		 public void inserisciInTesta() {
			 TipologieAbbonamenti pn= new TipologieAbbonamenti();
			
			 pn.setLink(head);
			 
			 head= pn;
			 int elementi = 0;
			elementi++;
		 }

		private void esamina(TipologiaAbbonamento info2) {
			
		}
		public void inserisciInPosizione (int posizione) {
			 TipologieAbbonamenti p= head;
			 TipologieAbbonamenti pn= new TipologieAbbonamenti();
			 int i = 1;
			 
			 if ((posizione<=1)|| (head==null))
				 inserisciInTesta();
			 else
				 if(posizione>elementi)
					 inserisciInCoda();
				 else {
					 while (i<posizione-1)
					 {p=p.getLink();i++;};
					 pn.setLink(p.getLink());
					 
					 p.setLink(pn);
					 elementi++;
				 }
		}
	}