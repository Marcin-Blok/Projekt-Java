package pl.szymonleyk.immutable;

public class ImmutableTest {
	public static void main(String[] args) {

		for(String s : args) {
			System.out.println(s);
		}
		
		int liczba1 = Integer.valueOf(args[1]);
		int liczba2 = Integer.valueOf(args[2]);
		
		if(args[0].equals("dodaj")) {
			System.out.println("Suma liczb "+liczba1+" + "+liczba2+" = "+(liczba1+liczba2));
		} else if(args[0].equals("odejmij")) {
			System.out.println("Ró¿nica liczb "+liczba1+" - "+liczba2+" = "+(liczba1-liczba2));
		}
		
		MyString string = new MyString("tekst");
		System.out.println(string.getValue());
		zmienTekst(string);
		System.out.println(string.getValue());
		

		String string2 = new String("tekst");
		System.out.println(string2);
		zmienTekst(string2);
		System.out.println(string2);
	}
	
	static void zmienTekst(MyString myString){
		myString = new MyString("zmieni³em");
	}
	
	static void zmienTekst(String myString){
		myString = "zmieni³em";
	}
	
}
