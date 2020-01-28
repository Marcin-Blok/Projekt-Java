package SzkolkaSportowa;

public class Klub {
	private String nazwa;
	private int dataZalozenia;

	public Klub(String nazwa, int dataZalozenia) {
		super();
		this.nazwa = nazwa;
		this.dataZalozenia = dataZalozenia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getDataZalozenia() {
		return dataZalozenia;
	}

	public void setDataZalozenia(int dataZalozenia) {
		this.dataZalozenia = dataZalozenia;
	}

}
