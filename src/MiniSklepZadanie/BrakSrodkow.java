package MiniSklepZadanie;

public class BrakSrodkow extends Exception{
	
	public BrakSrodkow() {
		super("Transakcja odrzucona. Za ma³o œrodków na koncie.");
	}

}
