package pl.marcinblok.obiektowosc;

public interface SkrzyniaBiegow {
	void zmienBieg();
	
	default void nazwa() {
		System.out.println("Tekst");	
	}
	
	default void zmien() {
		System.out.println("Zmienam bieg.");
	}
}
