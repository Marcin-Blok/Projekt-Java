package pl.marcinblok.szkolkasportowa;

import java.time.LocalDate;

public class Biegacz extends Sportowiec {
	private int preferowanyDystans;
	private double najlepszyCzasNaDanymDystansie;

	public Biegacz(String imie, String nazwisko, LocalDate dataUrodzenia, String dieta,
			LocalDate dataRozpoczeciaKariery, Klub aktualnyKlub, Trener trener, int preferowanyDystans,
			double najlepszyCzasNaDanymDystansie) {
		super(imie, nazwisko, dataUrodzenia, dieta, dataRozpoczeciaKariery, aktualnyKlub, trener);
		this.preferowanyDystans = preferowanyDystans;
		this.najlepszyCzasNaDanymDystansie = najlepszyCzasNaDanymDystansie;
	}

	public int getPreferowanyDystans() {
		return preferowanyDystans;
	}

	public void setPreferowanyDystans(int preferowanyDystans) {
		this.preferowanyDystans = preferowanyDystans;
	}

	public double getNajlepszyCzasNaDanymDystansie() {
		return najlepszyCzasNaDanymDystansie;
	}

	public void setNajlepszyCzasNaDanymDystansie(double najlepszyCzasNaDanymDystansie) {
		this.najlepszyCzasNaDanymDystansie = najlepszyCzasNaDanymDystansie;
	}
	
	public void trenuj() {
		System.out.println("Rozpoczynam trening,najpierw rozgrzewka, potem bieg na dystansie 10km, koñczê trening stretchingiem");
	};

}
