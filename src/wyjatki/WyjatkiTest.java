package wyjatki;

import java.lang.Math;

public class WyjatkiTest {
	public static void main(String[] args) {

		// obs�u�enie wyj�tku bezpo�rednio po bloku obserwowanym
		System.out.println("Rozpoczynam dzia�anie programu.");

		try {
			if (getRandomBoolean()) {
				System.out.println("Dziel� przez 0 : " + (5 / 0));
			} else {
				int[] tab = new int[2];
				tab[5] = 4;
			}
		} catch (ArithmeticException e) {
			System.out.println("Nie mo�na dzieli� przez zero. Nie wykona�em operacji.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Brak elementu tablicy. Wyszed�e� poza zakres");
		} finally {
			System.out.println("Zawsze wykonam ten kawa�ek kodu.");
		}

		System.out.println("Zako�czenie dzia�ania programu.");

		
		
		/**********************************************************/
		// wyowo�anie metody rzucaj�cej wyj�tek
		System.out.println("Wynik dzielenia 5/2 = " + wyjatki.Utils.div(5, 2));

		try {
			System.out.println("Wynik dzielenia 55/0 = " + wyjatki.Utils.div(55, 0));
			// zapis do pliku....
		} catch (ArithmeticException e) {
			System.out.println("Nie mog� podzieli� prez 0.");
			// ... brak pami�ci
		} catch (Exception e) { // od szczeg�u do og�u

		} finally {
			// zamkni�cie pliku
		}
		
		
		
		
		
		/**********************************************************/
		// tworzenie w�asnych wyj�tk�w
		
		// przygotwanie produkt�w
		Produkt p1 = new Produkt("Kompendium Programisty", 100);
		Produkt p2 = new Produkt("Kubek", 22);
		Produkt p3 = new Produkt("Woda mineralna", 1);
		Produkt p4 = new Produkt("Szafka biurowa", 1000);
		
		Produkt[] magazyn = new Produkt[4];
		magazyn[0] = p1;
		magazyn[1] = p2;
		magazyn[2] = p3;
		magazyn[3] = p4;
		
		// zakup - wyb�r produkt�w do kupienia
		Produkt[] chceKupic = new Produkt[2];
		chceKupic[0] = new Produkt("Woda mineralna", 1);
		chceKupic[1] = new Produkt("Kubek", 22222);
		
		Koszyk koszyk = new Koszyk(chceKupic);
		
		
		// zakup - p�atno��
		try {
			Utils.sprawdzDostepnosc(magazyn, koszyk);
		} catch (BrakProduktu e) {
			System.out.println(e.getMessage());
		}
		
		// typy opakowuj�ce
		Integer i = new Integer(12);
		Integer i1 = Integer.valueOf(22);
		
		int a = 1;
		Integer i2 = Integer.valueOf(a);
		
		String s = "12";
		Integer j = Integer.parseInt(s);
		
		System.out.println(j);
		
		boolean wartosc = true;
		Boolean wartoscB = Boolean.valueOf(wartosc);
		boolean wartosc2 = wartoscB.booleanValue();
		
	}

	public static boolean getRandomBoolean() {
		return Math.random() < 0.5;
	}

}
