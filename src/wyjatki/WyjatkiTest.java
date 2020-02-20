package wyjatki;

import java.lang.Math;

public class WyjatkiTest {
	public static void main(String[] args) {

		// obs³u¿enie wyj¹tku bezpoœrednio po bloku obserwowanym
		System.out.println("Rozpoczynam dzia³anie programu.");

		try {
			if (getRandomBoolean()) {
				System.out.println("Dzielê przez 0 : " + (5 / 0));
			} else {
				int[] tab = new int[2];
				tab[5] = 4;
			}
		} catch (ArithmeticException e) {
			System.out.println("Nie mo¿na dzieliæ przez zero. Nie wykona³em operacji.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Brak elementu tablicy. Wyszed³eœ poza zakres");
		} finally {
			System.out.println("Zawsze wykonam ten kawa³ek kodu.");
		}

		System.out.println("Zakoñczenie dzia³ania programu.");

		
		
		/**********************************************************/
		// wyowo³anie metody rzucaj¹cej wyj¹tek
		System.out.println("Wynik dzielenia 5/2 = " + wyjatki.Utils.div(5, 2));

		try {
			System.out.println("Wynik dzielenia 55/0 = " + wyjatki.Utils.div(55, 0));
			// zapis do pliku....
		} catch (ArithmeticException e) {
			System.out.println("Nie mogê podzieliæ prez 0.");
			// ... brak pamiêci
		} catch (Exception e) { // od szczegó³u do ogó³u

		} finally {
			// zamkniêcie pliku
		}
		
		
		
		
		
		/**********************************************************/
		// tworzenie w³asnych wyj¹tków
		
		// przygotwanie produktów
		Produkt p1 = new Produkt("Kompendium Programisty", 100);
		Produkt p2 = new Produkt("Kubek", 22);
		Produkt p3 = new Produkt("Woda mineralna", 1);
		Produkt p4 = new Produkt("Szafka biurowa", 1000);
		
		Produkt[] magazyn = new Produkt[4];
		magazyn[0] = p1;
		magazyn[1] = p2;
		magazyn[2] = p3;
		magazyn[3] = p4;
		
		// zakup - wybór produktów do kupienia
		Produkt[] chceKupic = new Produkt[2];
		chceKupic[0] = new Produkt("Woda mineralna", 1);
		chceKupic[1] = new Produkt("Kubek", 22222);
		
		Koszyk koszyk = new Koszyk(chceKupic);
		
		
		// zakup - p³atnoœæ
		try {
			Utils.sprawdzDostepnosc(magazyn, koszyk);
		} catch (BrakProduktu e) {
			System.out.println(e.getMessage());
		}
		
		// typy opakowuj¹ce
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
