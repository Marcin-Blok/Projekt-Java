package pl.marcinblok.obiektowosc;

public interface Radio {
	public static final String DEFAUL_STAITON = "";
	
	void wlacz();
	
	default void zmien() {
		System.out.println("Zmieniam radio");
	}
	
	default void wylacz() {
		System.out.println("Wy³aczam.");
	}
}
