package pl.marcinblok.wyrazenia.stream;

public class Student {
	private String imie;
	private String nazwisko;
	private int index;
	private boolean czyAktywny;

	public Student(String imie, String nazwisko, int index) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
	}

	public Student(String imie, String nazwisko, int index, boolean czyAktywny) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
		this.czyAktywny = czyAktywny;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isAktywny() {
		return czyAktywny;
	}

	public void setAktywny(boolean czyAktywny) {
		this.czyAktywny = czyAktywny;
	}

	@Override
	public String toString() {
		return "Student [imie=" + imie + ", nazwisko=" + nazwisko + ", index=" + index + "]";
	}

}
