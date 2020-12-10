package oppgave2;

public class Innlegg {
	
	private String bruker;
	private String dato;
	private int likes;
	
	public  Innlegg(String bruker, String dato) {
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;
	}
	
	public void skrivUt() {
		System.out.print(bruker+", "+dato+", "+likes+", ");
	}

}
