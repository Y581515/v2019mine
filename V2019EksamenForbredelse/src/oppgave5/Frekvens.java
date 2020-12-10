package oppgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frekvens {
	public static void main(String[] args) {
		ArrayList<String> listeAvOrd = new ArrayList<String>();
		HashMap<String, Integer> fo = new HashMap<String, Integer>();
		
		
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("alle");
		listeAvOrd.add("er");
		listeAvOrd.add("det");
		listeAvOrd.add("det");
		

		for(String s : listeAvOrd) {
			
			Integer f=fo.get(s);
			
			if(f == null) {
				fo.put(s,1);
			}else {
				fo.put(s, f+1);
			}
		}
		
		
		System.out.println("ord du vite frekvens for? ");
		Scanner tast=new Scanner (System.in);
		String ord= tast.nextLine();
		tast.close();
		
		//fo.clear();
		Integer f= fo.get(ord);
		if(f != null) {
			System.out.println(ord+" har frekvens "+f);
		}
		else {
			System.out.println(ord + " finst ikkje i oversikten");
		}
		
		
		System.out.println(fo.containsKey("d e t"));
		System.out.println(fo);
		}

}
