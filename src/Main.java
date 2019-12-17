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
		while (wiek <= 100) {
			System.out.print("Tw�j wiek to: " + wiek);
			if (wiek >= 18) {
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
			System.out.println("Wylosowana liczba: " + liczbaLosowa);
			ileRazyLosowalem++;
		}
		System.out.println("Uda�o si� znalezc po " + ileRazyLosowalem + " pr�bach.");

		// p�tla do while

		int liczbaLosowa2;
		do {
			liczbaLosowa2 = random.nextInt((100 - 0) + 1) + 0;
			System.out.println("Wylosowana liczba: " + liczbaLosowa2);
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
		int[] tablicaLiczb = { 22, 55, 12, 52, 15, 6, 8, 9, 3, 1, 2, 3, 4, 5, 100, 200, 300, 400, 500 };
		int[] tablicaLiczb2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("D�ugo�� tablicy: " + tablicaLiczb.length);
		// wy�wietl wszystkie elementy tablicy

		int suma = 0;
		for (int i = 0; i < tablicaLiczb.length; i++) {
			// System.out.println(tablicaLiczb[i]);
			suma += tablicaLiczb[i];
		}
		System.out.println("Suma element�w tablicy jest r�wna " + suma);

		for (int i = 0; i < tablicaLiczb.length; i++) {
			if (tablicaLiczb[i] % 5 == 0) {
				System.out.println(tablicaLiczb[i]);
			}
		}

		for (int i = 0; i < tablicaLiczb.length; i++) {
			tablicaLiczb[i] *= 2;
		}

		for (int i = 0; i < tablicaLiczb.length; i++) {
			System.out.println(tablicaLiczb[i]);
		}

		int[][] tabliczkaMnozenia = new int[10][10];

		for (int row = 0; row < tabliczkaMnozenia.length; row++) {
			for (int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				System.out.print(tabliczkaMnozenia[row][column] + "\t");
			}
			System.out.println();
		}

		for (int row = 0; row < tabliczkaMnozenia.length; row++) {
			for (int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				tabliczkaMnozenia[row][column] = (row + 1) * (column + 1);
			}
		}

		System.out.println();

		for (int row = 0; row < tabliczkaMnozenia.length; row++) {
			for (int column = 0; column < tabliczkaMnozenia[row].length; column++) {
				System.out.print(tabliczkaMnozenia[row][column] + "\t");
			}
			System.out.println();
		}

		// Oblicz rabat od kwoty zakup�w i wy�wietl warto��

		double amount = 19;
		String discount = "";
		double amountToBePaid = 0;

		if (amount >= 20 & amount <= 500) {
			discount = "2%";
			amountToBePaid = amount - (amount * 0.020);
		} else if (amount > 500 & amount <= 2000) {
			discount = "10%";
			amountToBePaid = amount - (amount * 0.10);
		} else if (amount > 2000) {
			discount = "50%";
			amountToBePaid = amount - (amount * 0.50);
		} else {
			System.out.println(
					"Warto�� twoich zakup�w jest zbyt ma�a aby uzyska� rabat, wybierz co� jeszcze aby uzyska� zni�k�.");
		}
		
		if (amount >= 20) {
		
			System.out.println("Przys�uguje ci rabat w wysoko�ci " + discount);
			System.out.println("Kwota do zap�aty po rabacie wynosi: " + amountToBePaid + "z�");
		}

		// P�tla for

		int i, j;
		for (i = 0; i <= 3; i++) {
			for (j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		// dla while
		i = 0;
		while (i <= 3) {
			j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println();

		// zadanie gwiazdki

		/*
		 * *****
		 *** 
		 *
		 */
		int row = 3;
		int column = 5;

		for (int z = 0; z < row; z++) {
			for (int x = 0; x < column; x++) {
				if (x < z || x >= column - z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		/*
		 * z = 0, x = [0-4], row = 3, column 5 te wszystie wy�wietlam z = 1, x = [0-4]
		 * [1,0] [1,4] ile wstawi�em ? 1 5 - 1 = 4 // column - z // 4 z = 2, x = [0-4]
		 * [2,0][2,1] [2,3][2,4] ile wstawi�em na ko�cu? 2 5-2 = 3 5-1 = 4
		 *
		 * 
		 */

		// 3. Zdefiniuj tablic� dwuwymiarow� i przypisz do niej warto�ci

		int array1[][] = {

				{ 2, 1, 5, 6, 7, 1 }, { 4, 2, 1, 5, 6 }, { 2, 4, 5 }, { 1, 1, 1, 1, 9, 8, 8, 8 } };

		int n, m;

		for (n = 0; n < array1.length; n++) {
			for (m = 0; m < array1[n].length; m++) {
				System.out.print(array1[n][m] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] tmp = array1[0];
		array1[0] = array1[2];
		array1[2] = tmp;
		
		for (n = 0; n < array1.length; n++) {
			for (m = 0; m < array1[n].length; m++) {
				System.out.print(array1[n][m] + " ");
			}
			System.out.println();
		}
		
		
		for (n = 0; n < array1.length; n++) {
			for (m = 0; m < array1[n].length; m++) {
				if(array1[n][m] == 1) {
					array1[n][m] = 10;
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for (n = 0; n < array1.length; n++) {
			for (m = 0; m < array1[n].length; m++) {
				System.out.print(array1[n][m] + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		// foreach
		// kolekcja tablica, lista itp.
		int[] liczbyCalkowite = {4,5,1,5,52,6,3,2};
		for(int jaksldfjalskd : liczbyCalkowite) {
			System.out.println(jaksldfjalskd);
			
		}
		
		System.out.println();
		
		// dwuwymiarowa	
		
		for(int[] tab:array1) {
			for(int liczba:tab) {
				if(liczba == 10) {
					break;	
				}
				System.out.print(liczba);
			}
			System.out.println();
		}
		
		for(int[] tab:array1) {
			for(int liczba:tab) {
				if(liczba == 10) {
					continue;	
				}
				System.out.print(liczba);				
			}
			System.out.println();
		}		
		

		int ileJestJedynek = 0;
		int ocena = 1;
		
		System.out.println();
		 //Zadaniae1
        System.out.println("Zadanie 1");

        double sumaOcen = 0;
        double sredniaWartosc = 0;
        int[] oceny = {4, 5, 6, 4, 3, 6};

        for (int z = 0; z < oceny.length; z++) {
            sumaOcen += oceny[ z ];
            
        }
        sredniaWartosc = sumaOcen / oceny.length;
        System.out.printf("�rednia warto�� element�w tablicy jest r�wna %.2f" , sredniaWartosc);
        System.out.println();

	
        
        //Zadanie2
        System.out.println("Zadanie 2");

        int najwyzszaOcena = 1;
        int[] oceny2 = {4, 5, 6, 4, 3, 4, 5, 6};
        for (int wartoscZTablicy : oceny2) {
            if (wartoscZTablicy > najwyzszaOcena) {
                najwyzszaOcena = wartoscZTablicy;
            }
        }
        System.out.println("Najwy�sza warto�� zdefiniowanej tablicy wynosi: " + najwyzszaOcena);
        System.out.println();
        
        
        
        
      //Zadanie3
        System.out.println("Zadanie 3 z wykorzystaniem p�tli foreach.");

        int najnizszaOcena = 6;
        int[] oceny3 = {4, 5, 6, 4, 3, 4, 5, 6};
        for (int wartoscZTablicy : oceny3) {
            if (wartoscZTablicy < najnizszaOcena) {
                najnizszaOcena = wartoscZTablicy;
            }
        }
        System.out.println("Najni�sza warto�� zdefiniowanej tablicy wynosi: " + najnizszaOcena);

        System.out.println();

        System.out.println("Zadanie 3.1 z wykorzystaniem p�tli for.");

        int k = 0;
        int lowestValue = 6;
        int[] tabValue = {4, 6, 6, 3, 2, 4, 5};
        for (k = 0; k < tabValue.length; k++) {
            if (tabValue[ k ] < lowestValue) {
                lowestValue = tabValue[ k ];
            }
        }
        System.out.println("Najni�sza warto�� zdefiniowanej tablicy wynosi: " + lowestValue);

        System.out.println();
        
        
        
        
	}
	
	

	// 1. Dla podanej tablicy ocen, oblicz ich �redni�
	// 2. Wy�wietl najwy�sz� ocen�
	// 3. Wy�wietl najmniejsz� ocen�
	// 4. Kt�re oceny przewa�aj� ?

}