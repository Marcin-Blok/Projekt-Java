package pl.marcinblok.kolekcje.zadania.zadanie1;

public class Student {
	private String imie;
	private int id;
	
	public Student(String imie, int id) {
		super();
		this.imie = imie;
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student: " + imie + " ID:" + id;
	}
	
	
}
