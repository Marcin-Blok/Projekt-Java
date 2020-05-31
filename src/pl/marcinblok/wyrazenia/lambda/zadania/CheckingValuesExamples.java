package pl.marcinblok.wyrazenia.lambda.zadania;

public class CheckingValuesExamples {
	
public static void main(String[] args) {
	
		
		// Zad 1.a,b
		CheckingValues check = (a, b, c) -> {
		
		     if (a + b <= c || a + c <= b || b + c <= a) 
		         return false; 
		     else
		         return true;
		};
		System.out.println("Zadanie 1");
		System.out.println("Czy z wartości 5,10,15 można stworzyć trójkąt? " + check.checkValues(6, 12, 12));
		System.out.println("Czy z wartości 5,10,15 można stworzyć trójkąt? " + check.checkValues(8, 5, 14));
		System.out.println();
		
		// Zad 1.c
		System.out.println("Zadanie 1.c");
		check = (x, y, z) -> {
			
			if(x % 5 == 0 && y % 5 == 0 && z % 5 == 0)
				return true;
			else
				return false;
			
		};
		System.out.println("Czy podane 3 liczby: (5, 50, 70) są wielokrotnościami liczby 5 ? " + check.checkValues(5, 50, 70));
		System.out.println("Czy podane 3 liczby: (1, 50, 55) są wielokrotnościami liczby 5 ? " + check.checkValues(1, 50, 55));
		System.out.println();
		
		// Zad 2.a,b
		GenericInterface<String, Integer> checking = (t) -> {
			int result = 0;
			
			for(int i = 0; i < t.length(); i++) {
				if(t.charAt(i) == 'k' || t.charAt(i) == 'K') {
					result++;
				}
			}
			return result;
		};
		System.out.println("Zadanie 2");
		System.out.println("Ilość liter 'k' lub 'K' w podanym ciagu wynosi: " + checking.checkGenericValues("Kokos"));
		System.out.println("Ilość liter 'k' lub 'K' w podanym ciagu wynosi: " + checking.checkGenericValues("Siłownia"));
		System.out.println("Ilość liter 'k' lub 'K' w podanym ciagu wynosi: " + checking.checkGenericValues("Kokosanki"));
		System.out.println();
		
		
		
		// Zad 2.c
		System.out.println("Zadanie 2.c");
		GenericInterface<Integer, Integer[]> createTab;
		createTab = (n) -> {
			Integer[] tab1 = new Integer[n+1];
				for(int i = 0; i <= n; i++) {
					tab1[i] = i;
				}return tab1;
		};
		
		Integer [] valuesInTab = createTab.checkGenericValues(12);
		for(int x = 0; x < valuesInTab.length; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println("\n");
		
		
		
		
		// Zad 3.a,b
		
		FunkcionalInterface articleReader1 = (s) -> {
			if(s.length() > 255) {
				throw new TooLongException();
			}
			String text = (String) s.subSequence(0, 30);
			return text;
		};
		
		try {
			System.out.println("Zadanie 3");
			System.out.println("30 pierwszych znaków z przekazanego tekstu to: [" + articleReader1.reader("Można powiedzieć, że wyrażenie lambda jest metodą, którą możesz przypisać do zmiennej. Można ją także wywołać czy przekazać jako argument do innej metody.")+"]");
			System.out.println(articleReader1.reader("Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym."
					+ "Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki."
					+ "Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym."
					+ "Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum,"
					+ "a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker"));
		} catch (TooLongException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		
		// Zad 3.c
		System.out.println("Zadanie 3.c");
		FunkcionalInterface articleReader2 = (text) -> {
			char dot = '.';
			char[] array = text.toCharArray();
			if((array.length-1) != '.') {
			}
			for(int i = 0; i < array.length; i++) {
				array[0] = Character.toUpperCase(array[0]);
			}return new String(array);
			
		};
		
		try {
			System.out.println(articleReader2.reader("powrót misji kosmicznych"));
		} catch (TooLongException e) {
			System.out.println("Too long");
		}
		
	}
}
