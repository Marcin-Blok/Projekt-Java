package obiektowosc;

public class Laboratoria {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;
	private String tablica;
	
	
	Laboratoria(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia, String tablica){
		this.nazwa = nazwa;
		this.godzinaRozpoczecia  = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
		this.tablica = tablica;
	}
	
	
	/* Opcja KOnstruktor bez u¿ycia s³owa this:
	
	Laboratoria(String n, int start, int stop, String tab){}
	*/

}
