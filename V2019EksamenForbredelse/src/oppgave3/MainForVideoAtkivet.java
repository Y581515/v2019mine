package oppgave3;

public class MainForVideoAtkivet {

	public static void main(String[] a) {
		
		Videoarkiv arkiv = new Videoarkiv(100);
		
		arkiv.leggTil(new Video("Video1", "Ole Olsen", 200));
		arkiv.leggTil(new Video("L�kker i Java", "Ole Olsen", 300));
		arkiv.leggTil(new Video("Video3", "Per Persen", 400));
		
		arkiv.listAlle("Ole Olsen");
		
		arkiv.bestePar(600);
		
		arkiv.slett("L�kker i Java");
		
		
		// Ikke en del av oppgaven, med for � sjekke
		arkiv.listAlle("Ole Olsen");
		arkiv.listAlle("Per Persen");
	}

}
