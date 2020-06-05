package pl.marcinblok.wyrazenia.stream;

public class Student implements Comparable<Student> {
	private String imie;
	private String nazwisko;
	private int index;
	private boolean czyAktywny;
	private double average;

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

	public Student(String imie, String nazwisko, int index, double average) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
		this.average = average;
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

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Student [imie=" + imie + ", nazwisko=" + nazwisko + ", index=" + index + ", czyAktywny=" + czyAktywny
				+ ", average=" + average + "]";
	}

	@Override
	public int compareTo(Student o) {
		return nazwisko.compareTo(o.getNazwisko());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(average);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Student other = (Student) obj;
		if (Double.doubleToLongBits(average) != Double.doubleToLongBits(other.average))
			return false;
		return true;
	}
	
	

}
