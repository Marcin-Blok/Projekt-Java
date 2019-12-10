import java.util.Random;

import javax.xml.transform.Source;

class Main {
	public static void main(String args[]) {
		System.out.println("Hello World !");

		// instrukcje wyboru

		// if, switch
		System.out.println("Rozpoczynam program.");
		int wiek = 15;

		if (wiek >= 18) {
			System.out.println("Informajca dla osoby pe�noletniej");
		} else {
			System.out.println("Nie spe�niony warunek");
		}

		// sumowanie liczb parzystych
		int[] liczby = { 2, 4, 1, 5, 6, 7, 2, 6, 11, 3, 2 };
		int sum = 0;
		if (liczby[3] % 2 == 0) {
			System.out.println("Liczba jest parzysta");
			sum += liczby[3];
		} else {
			System.out.println("Liczba jest nieparzysta");
		}
		System.out.println("Suma = " + sum);

		int waga = 51;
		if (waga < 5) {
			System.out.println("Waga < 5");
		} else if (waga <= 20) {
			System.out.println("Waga 5-20");
		} else if (waga < 50) {
			System.out.println("Waga 21-49");
		} else {
			System.out.println("Waga >= 50");
		}

		wiek = 8;
		if (waga > 50 && wiek < 10) {
			System.out.println("Troch� du�o wa�ysz.");
		} else if (waga > 50 && wiek >= 10) {
			System.out.println("Jest OK.");
		}

		if (waga > 50) {
			if (wiek < 10) {
				System.out.println("Troch� du�o wa�ysz");
			} else {
				System.out.println("Jest OK.");
			}
		}

		// instrukcja switch
		char litera = 'z';
		switch (litera) {
		case 'a':
			System.out.println("Litera A");
			break;
		case 'b':
			System.out.println("Litera B");
			break;
		default:
			System.out.println("Nie wiem jaka to litera");
			break;
		}

		int miesiac = 3;
		switch (miesiac) {
		case 1:
			System.out.println("Stycze�");
			break;
		case 2:
			System.out.println("Luty");
			break;
		case 3:
			System.out.println("---------------");
			System.out.println("Marzec");
			System.out.println("---------------");

			break;

		default:
			System.out.println("Nie znam takiego miesi�ca.");
			break;
		}

		System.out.println("---------- miesi�ce bez break");
		// switch bez break;
		miesiac = 5;
		switch (miesiac) {
		case 1:
		case 2:
		case 3:
			System.out.println("Pierwszy kwarta�.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Drugi kwarta�");
			break;

		default:
			System.out.println("Nie znam takiego miesi�ca.");
		}
		

		System.out.println("Ko�cz� program.");
		
		
		// instrukcje iteracyjne
		// while, do while, for
		wiek = 1;
		while(wiek <= 100) {
			System.out.print("Tw�j wiek to: "+wiek);
			if(wiek >= 18) {
				System.out.println(". Jeste� pe�noletni.");
			} else {
				System.out.println(". Jeste� niepe�noletni.");
			}
		
			wiek++;
		}
		
		int liczbaLosowa = 6;
		Random random = new Random();
		
		int ileRazyLosowalem = 0;
		while (liczbaLosowa > 5) {
			liczbaLosowa = random.nextInt((100 - 0) + 1) + 0;
			System.out.println("Wylosowana liczba: "+liczbaLosowa);
			ileRazyLosowalem++;
		}
		System.out.println("Uda�o si� znalezc po "+ileRazyLosowalem+" pr�bach.");
		
		
		
		// p�tla do while
		
		int liczbaLosowa2;
		do {
			liczbaLosowa2 = random.nextInt((100 - 0) + 1) + 0;
			System.out.println("Wylosowana liczba: "+liczbaLosowa2);
		} while (liczbaLosowa2 > 5);
		
		
		
//		// while
//		while (warunek) {
//			cia�o;
//		}
//		
//		// do while
//		do {
//			cia�o;
//		} while (warunek);
		
		
		// suma liczb z tablicy
		int[] tablicaLiczb = {22,55,12,52,15,6,8,9,3,1,2,3,4,5,100,200,300,400,500};
		int[] tablicaLiczb2 = {1,2,3,4,5,6,7,8};
		
		System.out.println("D�ugo�� tablicy: "+tablicaLiczb.length);
		// wy�wietl wszystkie elementy tablicy
		
		int suma = 0;
		for(int i = 0; i < tablicaLiczb.length; i++) {	
			//System.out.println(tablicaLiczb[i]);
			suma += tablicaLiczb[i];
		}
		System.out.println("Suma element�w tablicy jest r�wna "+suma);
		
		
		for(int i = 0; i < tablicaLiczb.length; i++) {
			if(tablicaLiczb[i] % 5 == 0) {
				System.out.println(tablicaLiczb[i]);	
			}
		}
		
		
		for(int i = 0; i < tablicaLiczb.length; i++) {
			tablicaLiczb[i] *= 2;
		}
		
		for(int i = 0; i < tablicaLiczb.length; i++) {
			System.out.println(tablicaLiczb[i]);
		}
		
		
		int[][] tabliczkaMnozenia = new int [10][10];
		
		for(int row = 0; row < tabliczkaMnozenia.length; row++) {
			for(int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				System.out.print(tabliczkaMnozenia[row][column]+"\t");
			}
			System.out.println();
		}
		
		
		for(int row = 0; row < tabliczkaMnozenia.length; row++) {
			for(int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				tabliczkaMnozenia[row][column] = (row+1) * (column+1);
			}
		}
		
		System.out.println();
		
		for(int row = 0; row < tabliczkaMnozenia.length; row++) {
			for(int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				System.out.print(tabliczkaMnozenia[row][column]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}