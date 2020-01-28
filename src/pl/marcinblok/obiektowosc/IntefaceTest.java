package pl.marcinblok.obiektowosc;

public class IntefaceTest {
	public static void main(String[] args) {
		Samochod s1 = new Samochod();
		Prysznic p1 = new Prysznic();
		
		RadioUtils.wlacz(p1);
		RadioUtils.wlacz(s1);
	}
}
