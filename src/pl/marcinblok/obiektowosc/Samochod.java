package pl.marcinblok.obiektowosc;

public abstract class Samochod implements SamochodOperacje, Radio, SkrzyniaBiegow {
	String kolor;
	String marka;
	int przebieg;
	double cena;
	int czyAktywny;
	static int liczbaSamochod = 0;

	Samochod() {
		liczbaSamochod++;
	}

	Samochod(String kolor, String marka, int przebieg, double cena) {
		this.kolor = kolor;
		this.marka = marka;
		this.przebieg = przebieg;
		this.cena = cena;
		liczbaSamochod++;
	}

	// metoda która: nic nie zwraca
	// metoda która: nie przyjmuje parametrów
	public void info() {
		System.out.println("Kolor: " + kolor);
		System.out.println("Marka: " + marka);
		System.out.println("Przebieg: " + przebieg);
		System.out.println("Cena: " + cena);
	}

	// metoda która: nie nie przyjmuje
	// metoda która: zwraca wartoœæ
	double cenaPoRabacie10procent() {
		return cena * 0.9;
	}

	void obnizCeneSamochodu(double wartosc) {
		cena -= wartosc;
	}

	double cenaPoRabacie(double rabat) {
		return cena - (cena * rabat);
	}

	double cenaPoRabacie(int rabat) {
		return cena - (cena * rabat / 100);
	}

	@Override
	public void zmienBieg() {
		
	}

	@Override
	public void wlacz() {
		System.out.println("W³¹czam radio w samochodzie.");
		
	}

	public abstract void zmien();

	
}
