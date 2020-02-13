package wyjatki;

public class WyjatkiTest {
	public static void main(String[] args) {
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
		}

		System.out.println("Zakoñczenie dzia³ania programu.");
	}

	public static boolean getRandomBoolean() {
		return Math.random() < 0.5;
	}

}
