package obiektowosc;

public class Wyk�ady {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;
	private int tablica;
	
	
	Wyk�ady(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, int tablica){
		this.nazwa = nazwa;
		this.godzinaRozpoczecia  = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
		this.tablica = tablica;
	}
	
	
	/* Opcja KOnstruktor bez u�ycia s�owa this:
	
	Wyk�ady(String n, int start, int stop, int tab){}
	*/

}
