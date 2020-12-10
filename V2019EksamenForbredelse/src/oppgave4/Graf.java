package oppgave4;

public class Graf {
	private boolean[][] nabomatrise = { { false, true, false, true, false, false },
			{ true, false, true, false, true, true }, { false, true, false, false, false, true },
			{ true, false, false, false, false, false }, { false, true, false, false, false, true },
			{ false, true, true, false, true, false } };

	public boolean erNaboer(int u, int w) {

		return nabomatrise[u][w];
	}

	public int grad(int v) {
		int antal = 0;
		for (int i = 0; i < nabomatrise.length; i++) {
			if (nabomatrise[v][i]) {
				antal++;
			}
		}
		return antal;
	}

	public int antallLokker() {
		int antal = 0;
		for (int i = 0; i < nabomatrise.length; i++) {
			if (nabomatrise[i][i]) {
				antal++;
			}
		}
		return antal;
	}
	
	public boolean uavhengigMengde(int[] s) {
		for (int i = 0; i < s.length - 1; i++) {

			for (int j = i + 1; j < s.length; j++) {
				if (nabomatrise[s[i]][s[j]]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
