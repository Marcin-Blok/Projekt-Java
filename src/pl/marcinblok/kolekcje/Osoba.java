package pl.marcinblok.kolekcje;

public class Osoba implements Comparable<Osoba> {
	private String imie;
	private Status status;

	public Osoba(String imie) {
		super();
		this.imie = imie;
	}

	public Osoba(String imie, Status status) {
		super();
		this.imie = imie;
		this.status = status;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return imie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		return true;
	}

	@Override
	public int compareTo(Osoba o) {
		return imie.compareTo(o.getImie());
	}

}
