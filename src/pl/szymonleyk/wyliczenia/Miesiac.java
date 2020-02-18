package pl.szymonleyk.wyliczenia;

public enum Miesiac {
	STYCZEN(1), LUTY(2), MARZEC(3);
	
	private int numerMiesiaca;
	
	Miesiac(int numerMiesiaca){
		this.numerMiesiaca = numerMiesiaca;
	}

	public int getNumerMiesiaca() {
		return numerMiesiaca;
	}

	public void setNumerMiesiaca(int numerMiesiaca) {
		this.numerMiesiaca = numerMiesiaca;
	}
	
	
}
