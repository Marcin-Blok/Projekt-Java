package pl.marcinblok.kolekcje.zadania.zadanie2;

public class Ksiazka {
	private String autor;
	private String tytul;
	private int numerBiblioteczny;
	private String wersja;  // Twarda ok³adka lub audiobook
	
	
	
	
	public Ksiazka(String tytul) {
		super();
		this.tytul = tytul;
	}


	public Ksiazka(String autor, String tytul, int numerBiblioteczny, String wersja) {
		super();
		this.autor = autor;
		this.tytul = tytul;
		this.numerBiblioteczny = numerBiblioteczny;
		this.wersja = wersja;
	}


	public String getAutor(){
		return autor;
	}
	
	public String getTytul() {
		return tytul;
	}


	public int getNumerBiblioteczny() {
		return numerBiblioteczny;
	}


	public String getWersja() {
		return wersja;
	}


	@Override
	public String toString() {
		return "Autor: " + autor + ", tytu³ ksi¹¿ki: " + tytul + ", numer biblioteczny: " + numerBiblioteczny + ", wersja: " + wersja + "\n";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
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
		Ksiazka other = (Ksiazka) obj;
		if (tytul == null) {
			if (other.tytul != null)
				return false;
		} else if (!tytul.equals(other.tytul))
			return false;
		return true;
	}
	
	
	
	
	
	

}
