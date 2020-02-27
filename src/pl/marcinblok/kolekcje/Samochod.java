package pl.marcinblok.kolekcje;

public class Samochod {
	private String marka;
	private String model;
	private String kolor;

	public Samochod(String marka, String model, String kolor) {
		super();
		this.marka = marka;
		this.model = model;
		this.kolor = kolor;
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

	@Override
	public String toString() {
		return "Samochod [marka=" + marka + ", model=" + model + ", kolor=" + kolor + "]\n";
	}

}
