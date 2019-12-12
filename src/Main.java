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
			System.out.println("Informajca dla osoby pe³noletniej");
		} else {
			System.out.println("Nie spe³niony warunek");
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
			System.out.println("Trochê du¿o wa¿ysz.");
		} else if (waga > 50 && wiek >= 10) {
			System.out.println("Jest OK.");
		}

		if (waga > 50) {
			if (wiek < 10) {
				System.out.println("Trochê du¿o wa¿ysz");
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
			System.out.println("Styczeñ");
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
			System.out.println("Nie znam takiego miesi¹ca.");
			break;
		}

		System.out.println("---------- miesi¹ce bez break");
		// switch bez break;
		miesiac = 5;
		switch (miesiac) {
		case 1:
		case 2:
		case 3:
			System.out.println("Pierwszy kwarta³.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Drugi kwarta³");
			break;

		default:
			System.out.println("Nie znam takiego miesi¹ca.");
		}
		

		System.out.println("Koñczê program.");
		
		
		// instrukcje iteracyjne
		// while, do while, for
		wiek = 1;
		while(wiek <= 100) {
			System.out.print("Twój wiek to: "+wiek);
			if(wiek >= 18) {
				System.out.println(". Jesteœ pe³noletni.");
			} else {
				System.out.println(". Jesteœ niepe³noletni.");
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
		System.out.println("Uda³o siê znalezc po "+ileRazyLosowalem+" próbach.");
		
		
		
		// pêtla do while
		
		int liczbaLosowa2;
		do {
			liczbaLosowa2 = random.nextInt((100 - 0) + 1) + 0;
			System.out.println("Wylosowana liczba: "+liczbaLosowa2);
		} while (liczbaLosowa2 > 5);
		
		
		
//		// while
//		while (warunek) {
//			cia³o;
//		}
//		
//		// do while
//		do {
//			cia³o;
//		} while (warunek);
		
		
		// suma liczb z tablicy
		int[] tablicaLiczb = {22,55,12,52,15,6,8,9,3,1,2,3,4,5,100,200,300,400,500};
		int[] tablicaLiczb2 = {1,2,3,4,5,6,7,8};
		
		System.out.println("D³ugoœæ tablicy: "+tablicaLiczb.length);
		// wyœwietl wszystkie elementy tablicy
		
		int suma = 0;
		for(int i = 0; i < tablicaLiczb.length; i++) {	
			//System.out.println(tablicaLiczb[i]);
			suma += tablicaLiczb[i];
		}
		System.out.println("Suma elementów tablicy jest równa "+suma);
		
		
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
		
		// Oblicz rabat od kwoty zakupów i wyœwietl wartoœæ
        
        double amount = 550;
		String discount = "";
		double amountToBePaid = 0;

		
		if(amount >= 20 & amount <= 500) {
			discount = "2%";
			amountToBePaid = amount - (amount * 0.020);
		}else if (amount > 500 & amount <= 2000) {
			discount = "10%";
			amountToBePaid = amount - (amount * 0.10);
		}else if (amount > 2000) { 
			discount = "50%";
			amountToBePaid = amount - (amount * 0.50);
		}else {
			System.out.println("Wartoœæ twoich zakupów jest zbyt ma³a aby uzyskaæ rabat, wybierz coœ jeszcze aby uzyskaæ zni¿kê.");
		}
	
		System.out.println("Przys³uguje ci rabat w wysokoœci " + discount);
		System.out.println("Kwota do zap³aty po rabacie wynosi: " + amountToBePaid + "z³");
		
		
		
		
		// Pêtla for 

        int i, j;
        for(i = 0; i <= 3; i++) {
           for(j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println();
        }
        
        System.out.println();
		
		
		
		
        // 3. Zdefiniuj tablicê dwuwymiarow¹ i przypisz do niej wartoœci
        
        
        int array1 [][] = {
        		
        		{2,1,5,6,7,1},
        		{4,2,1,5,6},
        		{2,4,5},
        		{1,1,1,1,9,8,8,8}
        };
        
		int n, m;
        
        for(n = 0; n < array1.length; n++)
        	for(m = 0; m < array1[n].length; m++)
        		System.out.print(array1[n][m] + " ");
				System.out.println();
        
     
		
	}
}