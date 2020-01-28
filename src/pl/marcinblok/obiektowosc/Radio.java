package pl.marcinblok.obiektowosc;

public interface Radio {
	public static final String DEFAUL_STAITON = "";
	
	void wlacz();
	void zmien();
	
	default void wylacz() {
		System.out.println("Wy³aczam.");
	}
}
