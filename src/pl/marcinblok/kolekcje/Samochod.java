package pl.marcinblok.kolekcje;

public class Samochod implements Comparable<Samochod> {
	private String marka;
	private String model;
	private String kolor;
	private int rocznik;

	public Samochod(String marka, String model, String kolor) {
		super();
		this.marka = marka;
		this.model = model;
		this.kolor = kolor;
	}

	public Samochod(String marka, String model, String kolor, int rocznik) {
		super();
		this.marka = marka;
		this.model = model;
		this.kolor = kolor;
		this.rocznik = rocznik;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	@Override
	public String toString() {
		return "Samochod [marka=" + marka + ", model=" + model + ", kolor=" + kolor + ", rocznik =" + rocznik + "]\n";
	}

	@Override
	public int compareTo(Samochod o) {
		if (rocznik < o.getRocznik()) {
			return -1;
		} else if (rocznik  == o.getRocznik()) {
			return kolor.compareTo(o.getKolor());
		} else {
			return 1;
		}
	}

}
