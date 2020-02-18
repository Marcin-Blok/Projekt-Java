package pl.szymonleyk.wyliczenia;

public class WyliczeniaTest {

	public static void main(String[] args) {
		Ogloszenie o1 = new Ogloszenie("Lokal biurowy w �cis�ym centrum �or",
				"Budynek naprzeciwko Ko�cio�a Ewangelickiego - �cis�e centrum �or!\r\n" + "\r\n"
						+ "Op�ata obejmuje media (c.o., pr�d, wod-kan., internet) oraz parking.\r\n" + "\r\n"
						+ "Podana cena to cena brutto (fa vat 23%).",
				TypNieruchomosci.BIURO);

		System.out.println(o1);

		/*******    values()     ***/
		for (TypNieruchomosci typ : TypNieruchomosci.values()) {
			System.out.println(typ);
		}
		
		

		/********    valueOf() **/
		String typ = "MIESZKANIE";
		Ogloszenie o2 = new Ogloszenie("1 bdrm Amazing apartment for rent Z�ota 44",
				"Apartament z widokiem na panoram� stolicy przypadnie do gustu osobom wybieraj�cym dobra z najwy�szej p�ki. Luksus w czystej postaci. Z�ota 44 to najbardziej presti�owa warszawska inwestycja, oferuj�ca swoim mieszka�com pe�en wachlarz udogodnie�.",
				TypNieruchomosci.valueOf(typ));

		System.out.println(o2);
		
		
		Miesiac.MARZEC.getNumerMiesiaca();
		
		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) < 0);
		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) == 0);
		System.out.println(Miesiac.MARZEC.compareTo(Miesiac.LUTY) > 0);
		
		System.out.println(TypNieruchomosci.MIESZKANIE.ordinal());
		System.out.println(TypNieruchomosci.DOM.ordinal());
		
		
		
	}
}
