package wyjatki;

public class WyjatkiTest {
	public static void main(String[] args) {
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
		}

		System.out.println("Zako�czenie dzia�ania programu.");
	}

	public static boolean getRandomBoolean() {
		return Math.random() < 0.5;
	}

}
