package oppgave2;

import java.util.Scanner;

public class Innleggmain {
	public static void main(String[] args) {
		
		Innlegg innlegg = null;
		Scanner tast = new Scanner(System.in);
		
		System.out.println("Enkel forklaring");
		System.out.print("Bruker? ");
		String bruker = tast.nextLine();
		
		System.out.print("Dato? ");
		String dato = tast.nextLine();
		
		System.out.println("1: Bilde \n 2: Tekst \n Valg? ");
		int valg = tast.nextInt();
		
		switch (valg) {
		case 1:
			System.out.println("Url? ");
			String url = tast.nextLine();
			innlegg = new Bilde(bruker, dato, url);
			tast.close();
			
			break;
		case 2:
			System.out.print("Tekst? ");
			String tekst = tast.nextLine();
			innlegg = new Tekst(bruker, dato, tekst);
			break;
		default:
			System.out.println("Feilmelding");
		}
		
		if (innlegg != null) {
			
			innlegg.skrivUt();
		}
		
	}

}
