package SzkolkaSportowa;

import java.time.LocalDate;

public class Pilkarz extends Sportowiec {
	private String pozycjaNaBoisku;

	

	public Pilkarz(String imie, String nazwisko, LocalDate dataurodzenia, String dieta,
			LocalDate dataRozpoczeciaKariery, String aktualnyKlub, Trener trener, String pozycjaNaBoisku) {
		super(imie, nazwisko, dataurodzenia, dieta, dataRozpoczeciaKariery, aktualnyKlub, trener);
		this.pozycjaNaBoisku = pozycjaNaBoisku;
	}

	public String getPozycjaNaBoisku() {
		return pozycjaNaBoisku;
	}

	public void setPozycjaNaBoisku(String pozycjaNaBoisku) {
		this.pozycjaNaBoisku = pozycjaNaBoisku;
	}
	public void trenuj() {
		
	};

}
