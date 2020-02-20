package pl.marcinblok.obiektowosc;

public class IntefaceTest {
	public static void main(String[] args) {
		Samochod s1 = new SamochodOsobowy();
		Prysznic p1 = new Prysznic();
		
		System.out.println("Jestem");
		s1.nazwa();
		
		RadioUtils.wlacz(p1);
		RadioUtils.wlacz(s1);
		
		s1.zmien();
		Rower rower = new Rower();
		rower.zmien();
		
		ManualnaSkrzyniaBiegow.metodaStatyczna();
		
		
	}
}
