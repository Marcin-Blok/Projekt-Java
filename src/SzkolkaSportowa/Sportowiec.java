package SzkolkaSportowa;

import java.time.LocalDate;

public abstract class Sportowiec extends Osoba {
	private String dieta;
	private LocalDate dataRozpoczeciaKariery;
	private String aktualnyKlub;
	private Trener trener;

	public Sportowiec(String imie, String nazwisko, LocalDate dataurodzenia, String dieta,
			LocalDate dataRozpoczeciaKariery, String aktualnyKlub, Trener trener) {
		super(imie, nazwisko, dataurodzenia);
		this.dieta = dieta;
		this.dataRozpoczeciaKariery = dataRozpoczeciaKariery;
		this.aktualnyKlub = aktualnyKlub;
		this.trener = trener;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public LocalDate getDataRozpoczeciaKariery() {
		return dataRozpoczeciaKariery;
	}

	public void setDataRozpoczeciaKariery(LocalDate dataRozpoczeciaKariery) {
		this.dataRozpoczeciaKariery = dataRozpoczeciaKariery;
	}

	public String getAktualnyKlub() {
		return aktualnyKlub;
	}

	public void setAktualnyKlub(String aktualnyKlub) {
		this.aktualnyKlub = aktualnyKlub;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}
	
	
	public abstract void trenuj();

}
