package pl.szymonleyk.wyliczenia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WyliczeniaTest {

	public static void main(String[] args) throws IOException {
		Ogloszenie o1 = new Ogloszenie("Lokal biurowy w œcis³ym centrum ¯or",
				"Budynek naprzeciwko Koœcio³a Ewangelickiego - œcis³e centrum ¯or!\r\n" + "\r\n"
						+ "Op³ata obejmuje media (c.o., pr¹d, wod-kan., internet) oraz parking.\r\n" + "\r\n"
						+ "Podana cena to cena brutto (fa vat 23%).",
				TypNieruchomosci.BIURO);

		System.out.println(o1);

		/******* values() ***/
		for (TypNieruchomosci typ : TypNieruchomosci.values()) {
			System.out.println(typ);
		}

		/******** valueOf() **/
		String typ = "MIESZKANIE";
		Ogloszenie o2 = new Ogloszenie("1 bdrm Amazing apartment for rent Z³ota 44",
				"Apartament z widokiem na panoramê stolicy przypadnie do gustu osobom wybieraj¹cym dobra z najwy¿szej pó³ki. Luksus w czystej postaci. Z³ota 44 to najbardziej presti¿owa warszawska inwestycja, oferuj¹ca swoim mieszkañcom pe³en wachlarz udogodnieñ.",
				TypNieruchomosci.valueOf(typ));

		System.out.println(o2);

		Miesiac.MARZEC.getNumerMiesiaca();

		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) < 0);
		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) == 0);
		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) > 0);

		System.out.println(TypNieruchomosci.MIESZKANIE.ordinal());
		System.out.println(TypNieruchomosci.DOM.ordinal());

		/****** wczytywanie z konsoli ****/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.print("Typ nieruchomoœci: ");
			String typNieruchomosci = br.readLine();

			try {
				TypNieruchomosci typNieruchomosciEnum = TypNieruchomosci.valueOf(typNieruchomosci);
				
				switch (typNieruchomosciEnum) {
				case MIESZKANIE: System.out.println("Wybra³eœ mieszkanie"); break;
				case DOM: System.out.println("Wybra³eœ dom"); break;
				case BIURO: System.out.println("Wybra³eœ biuro"); break;
				case DZIA£KA: System.out.println("Wybra³eœ dzia³kê"); break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + typNieruchomosciEnum);
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Sory. Nie ma takiego enuma.");
			}
		} while (true);

	}
}
