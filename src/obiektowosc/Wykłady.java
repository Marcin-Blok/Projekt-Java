package obiektowosc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Wyk³ady {
	private String nazwa;
	private int godzinaRozpoczecia;
	private int godzinaZakonczenia;

	Wyk³ady(String nazwa, int godzinaRozpoczecia, int godzinaZakonczenia) {
		this.nazwa = nazwa;
		this.godzinaRozpoczecia = godzinaRozpoczecia;
		this.godzinaZakonczenia = godzinaZakonczenia;
	}



}
