package oppgave3;

public class Videoarkiv {
	private Video[] vTab;
	private int antal;

	public Videoarkiv(int maksAntal) {

		this.vTab = new Video[maksAntal];
		this.antal = 0;
	}

	public void leggTil(Video v) {

		if (antal >= vTab.length) {
			System.out.println("tabellen er full");
		} else {
			vTab[antal] = v;
			antal++;
		}
	}

	public int finnTotalTid() {
		int totalTid = 0;
		for (int i = 0; i < antal; i++) {
			totalTid += vTab[i].getSekund();
		}

		return totalTid;
	}

	public void listAlle(String produsent) {
		int antall = 0;
		for (int i = 0; i < antal; i++) {
			if (vTab[i].getProdusent().equals(produsent)) {
				System.out.println(vTab[i].getTittel());
				antall++;
			}
		}
		System.out.println(antall);
	}

	public void slett(String tittel) {
		boolean funnet = false;
		int pos = 0;

		while (pos < antal && !funnet) {
			if (vTab[pos].getTittel().equals(tittel)) {
				funnet = true;
			} else {
				pos++;
			}
		}

		if (funnet) {
			antal--;
			vTab[pos] = vTab[antal];
			vTab[antal] = null;
			System.out.println(tittel + " Slettet!");
		} else {
			System.out.println(tittel + " er ikke i Arkevet");
		}

	}
	
	public void slett2(String tittel) {
		 int funnetIndeks = -1;
		 int i = 0;
		 
		 while (funnetIndeks == -1 && i < antal) {
			 if (vTab[i].getTittel().equals(tittel)) {
				 funnetIndeks = i;
			 }i++;
		 }
		 
		 if (funnetIndeks == -1) {
			 System.out.println("Arkivet inneholdt ikke video med tittel "
					 + tittel);
		 } else {
			 vTab[funnetIndeks] = vTab[antal-1];
			 vTab[antal-1] = null;
			 antal--;
		 }
	}
	
	public void bestePar(int tidsgrense) {
		 int indeks1 = 0;
		 int indeks2 = 1;
		 int minsteDifferanse = tidsgrense;
		 
		 for (int i = 0; i < antal-1; i++) {
			 for (int j = i+1; j < antal; j++) {
				 
				 int tidsdifferanse = tidsgrense - (vTab[i].getSekund() + vTab[j].getSekund());
				 
				 if (tidsdifferanse >= 0 && tidsdifferanse < minsteDifferanse) {
					 indeks1 = i;
					 indeks2 = j;
					 minsteDifferanse = tidsdifferanse;
				 }
			 }
		 }
		 if (minsteDifferanse == tidsgrense) {
			 System.out.println("Fant ingen videopar med samlet tid "
			 + "mindre enn " + tidsgrense + " sekunder.");
		 } else {
			 System.out.println("Videoparet som best fyller tiden på "
			 + tidsgrense + " sekunder:");
			 System.out.println(vTab[indeks1]);
			 System.out.println(vTab[indeks2]);
			 int samletTid = vTab[indeks1].getSekund()
			 + vTab[indeks2].getSekund();
			 System.out.println("Samlet tid er: " + samletTid + " sekunder:");
		 }
		 }
		 

}
