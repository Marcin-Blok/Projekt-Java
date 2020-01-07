package obiektowosc;

public class Osoba {
	String imie;
	String nazwisko;
	int wiek;
	
	void przywitaj(String tekstPowitania, String znakKoncowy) {
		System.out.println(tekstPowitania+imie+" "+nazwisko+znakKoncowy);
	}
}
