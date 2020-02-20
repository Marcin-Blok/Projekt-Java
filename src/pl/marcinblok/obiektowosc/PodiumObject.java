package pl.marcinblok.obiektowosc;

public class PodiumObject {
	private Object pierwsze;
	private Object drugie;
	private Object trzecie;

	public Object getPierwsze() {
		return pierwsze;
	}

	public void setPierwsze(Object pierwsze) {
		this.pierwsze = pierwsze;
	}

	public Object getDrugie() {
		return drugie;
	}

	public void setDrugie(Object drugie) {
		this.drugie = drugie;
	}

	public Object getTrzecie() {
		return trzecie;
	}

	public void setTrzecie(Object trzecie) {
		this.trzecie = trzecie;
	}

	@Override
	public String toString() {
		Zawody z1 = null, z2 = null, z3 = null;
		if (pierwsze instanceof Zawody) {
			z1 = (Zawody) pierwsze;
		}
		if (drugie instanceof Zawody) {
			z2 = (Zawody) drugie;
		}
		if (trzecie instanceof Zawody) {
			z3 = (Zawody) trzecie;
		}

		return z1 + " " + z1.cieszynka() + "\n" + z2 + " " + z2.cieszynka() + "\n" + z3 + " " + z3.cieszynka() + "\n";
	}

}
