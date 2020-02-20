package pl.marcinblok.pliki;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author szymon.leyk
 * @version 1.1
 *
 */
public class PlikiTest {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		System.out.println("-------- Program do odczytu i zapisu danych w pliku. -------");
		OpcjeMenu opcja = null;
		do {
			System.out.println("ODCZYTAJ - odczytaj plik");
			System.out.println("ZAPISZ - zapisz plik");
			System.out.println("KONIEC - koniec programu");
			try {
				System.out.print("Opcja: ");
				opcja = OpcjeMenu.valueOf(br.readLine());
	
				switch (opcja) {
				case ODCZYTAJ:
					odczytajPlik();
					break;
				case ZAPISZ:
					zapiszDoPliku();
					break;
				}
			} catch(IllegalArgumentException e) {
				System.out.println("Nie ma takiej opcji.");
			}	catch (IOException e) {
				e.printStackTrace();
			}
		} while(opcja == null || !opcja.equals(OpcjeMenu.KONIEC));
	}

	private static void zapiszDoPliku() {
		// zapis
		FileOutputStream fos = null;
		try {
			System.out.print("Podaj nazwê pliku: ");
			String nazwaPliku = br.readLine();

			fos = new FileOutputStream(nazwaPliku, true);
			String liniaTekstu;
			System.out.println("Treœæ pliku: ");
			System.out.println("----------------");
			do {
				liniaTekstu = br.readLine();
				if (!liniaTekstu.equals("koniec")) {
					fos.write((liniaTekstu + "\n").getBytes());
				} else {
					break;
				}
			} while (true);
			System.out.println("----------------");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void odczytajPlik() {
		/*
		 * Przyk³ad wywo³ania: a) C:\Users\szymon.leyk\Desktop\info.txt b) spotkania.txt
		 */
		// odczyt
		FileInputStream fis = null;
		try {
			System.out.print("Podaj nazwê pliku do wczytania: ");
			String nazwaPliku = br.readLine();

			fis = new FileInputStream(nazwaPliku);
			System.out.println("Plik istnieje.");
			int b = 0;
			do {
				b = fis.read();
				System.out.print((char)b);
			} while (b != -1);

		} catch (FileNotFoundException e) {
			System.out.println("Plik o takiej nazwie nie istnieje.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
					System.out.println("Zamykam plik.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
