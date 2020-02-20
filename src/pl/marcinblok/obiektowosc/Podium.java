package pl.marcinblok.obiektowosc;

public class Podium<T extends Zawody> {
	private T pierwsze;
	private T drugie;
	private T trzecie;
	

	public Podium() {
		super();
	}

	public <V extends Number> Podium(T pierwsze, T drugie, T trzecie, V nagroda) {
		super();
		this.pierwsze = pierwsze;
		this.drugie = drugie;
		this.trzecie = trzecie;
	}

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
	
	@Override
	public String toString() {
		return pierwsze+" "+pierwsze.cieszynka()+"\n"+drugie+" "+drugie.cieszynka()+"\n"+trzecie+" "+trzecie.cieszynka()+"\n";
	}

}
