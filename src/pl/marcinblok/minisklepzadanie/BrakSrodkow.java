package pl.marcinblok.minisklepzadanie;

public class BrakSrodkow extends Exception{
	
	public BrakSrodkow() {
		super("Transakcja odrzucona. Za ma�o �rodk�w na koncie.");
	}

}
