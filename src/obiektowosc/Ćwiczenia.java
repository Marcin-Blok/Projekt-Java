package obiektowosc;

public class �wiczenia {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;
	private int tablica;
	
	
	�wiczenia(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, int tablica){
		this.nazwa = nazwa;
		this.godzinaRozpoczecia  = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
		this.tablica = tablica;
	}
	
	
	/* Opcja KOnstruktor bez u�ycia s�owa this:
	
	�wiczenia(String n, int start, int stop, int tab){}
	*/
}
