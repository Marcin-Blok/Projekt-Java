package obiektowosc;

public class Æwiczenia {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;
	private int tablica;
	
	
	Æwiczenia(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, int tablica){
		this.nazwa = nazwa;
		this.godzinaRozpoczecia  = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
		this.tablica = tablica;
	}
	
	
	/* Opcja KOnstruktor bez u¿ycia s³owa this:
	
	Æwiczenia(String n, int start, int stop, int tab){}
	*/
}
