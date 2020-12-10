package oppgave2;

import java.lang.Object;

public class Bilde extends Innlegg {

	private String url;

	public Bilde(String bruker, String dato, String url) {
		super(bruker, dato);
		this.url = url;
	}

	@Override
	public void skrivUt() {
		super.skrivUt();
		System.out.println(url);
	}

}
