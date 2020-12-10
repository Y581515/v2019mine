package oppgave3;

public class Video {
	
	private String tittel;
	private String produsent;
	private int sekund;
	
	public Video(String tittel, String produsent, int sekund) {
		this.tittel = tittel;
		this.produsent = produsent;
		this.sekund = sekund;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public int getSekund() {
		return sekund;
	}

	public void setSekund(int sekund) {
		this.sekund = sekund;
	}
	
	public String toString() {
		String str="";
		int m=sekund/60;
		int sec=sekund%60;
		
		str="Tittel: "+tittel+" Produsent: "+produsent+" Tid: "+String.format("%d.%02d", m,sec);
		
		return str;
	}
	
	
	
	
	

}
