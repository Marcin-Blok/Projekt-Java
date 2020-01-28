package SzkolkaSportowa;

import java.time.LocalDate;

public abstract class Sportowiec extends Osoba {
	private String dieta;
	private LocalDate dataRozpoczeciaKariery;
	private Klub aktualnyKlub;
	private Trener trener;

	public Sportowiec(String imie, String nazwisko, LocalDate dataUrodzenia, String dieta,
			LocalDate dataRozpoczeciaKariery, Klub aktualnyKlub, Trener trener) {
		super(imie, nazwisko, dataUrodzenia);
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

	public Klub getAktualnyKlub() {
		return aktualnyKlub;
	}

	public void setAktualnyKlub(Klub aktualnyKlub) {
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
