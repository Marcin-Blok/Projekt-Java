package obiektowosc;

public class Adres {
	private String ulica;
	private int numerDomu;
	private int numerMieszkania;
	private String kodPocztowy;

	Adres(String ulica, int numerDomu, int numerMieszkania, String kodPocztowy) {
		this.ulica = ulica;
		this.numerDomu = numerDomu;
		this.numerMieszkania = numerMieszkania;
		this.kodPocztowy = kodPocztowy;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public int getNumerDomu() {
		return numerDomu;
	}

	public void setNumerDomu(int numerDomu) {
		this.numerDomu = numerDomu;
	}

	public int getNumerMieszkania() {
		return numerMieszkania;
	}

	public void setNumerMieszkania(int numerMieszkania) {
		this.numerMieszkania = numerMieszkania;
	}

	public String getKodPocztowy() {
		return kodPocztowy;
	}

	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
}
