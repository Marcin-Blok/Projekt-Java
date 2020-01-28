package pl.marcinblok.obiektowosc;

public class Prysznic implements Radio {

	@Override
	public void wlacz() {
		System.out.println("W³¹czam radio w prysznicu.");
		
	}

	@Override
	public void zmien() {
		System.out.println("Zmieniam radio w prysznicu.");
	}

	@Override
	public void wylacz() {
		
	}
}
