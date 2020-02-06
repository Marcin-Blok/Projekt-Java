package pl.marcinblok.obiektowosc;

public class Podium<T extends Zawody> {
	private T pierwsze;
	private T drugie;
	private T trzecie;

	public T getPierwsze() {
		return pierwsze;
	}

	public void setPierwsze(T pierwsze) {
		this.pierwsze = pierwsze;
	}

	public T getDrugie() {
		return drugie;
	}

	public void setDrugie(T drugie) {
		this.drugie = drugie;
	}

	public T getTrzecie() {
		return trzecie;
	}

	public void setTrzecie(T trzecie) {
		this.trzecie = trzecie;
	}

}
