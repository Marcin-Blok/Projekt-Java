package pl.marcinblok.wyrazenia.lambda;

public class LambdaExpressionExamples {
	public static void main(String[] args) {
		// czy liczba parzysta - wyrażenie
		NumericCondition isEven;
		isEven = (int s) -> (s%2==0);
		
		System.out.println("Czy liczba 3 jest parzysta? "+isEven.check(3));
		System.out.println("Czy liczba 44 jest parzysta? "+isEven.check(44));
		System.out.println("Czy liczba -11 jest parzysta? "+isEven.check(-11));
		
		
		// czy z przedziału - wyrażenie
		NumericCondition fromRange;
		fromRange = (number) -> (number >= 5 && number <= 55);
		System.out.println("Czy liczba 3 należy do zakresu od 5 do 55? "+fromRange.check(3));
		System.out.println("Czy liczba 44 należy do zakresu od 5 do 55? "+fromRange.check(44));
		System.out.println("Czy liczba -11 należy do zakresu od 5 do 55? "+fromRange.check(-11));
		
		// policz sumę - wyrażenie blokowe
		TableOperation sum;
		sum = (tab) -> {
			int result = 0;
			for (int number : tab) {
				result+=number;
			}
			return result;
		};
		System.out.println("Suma liczb: 1+4+5+6="+sum.calc(new int[] {1,4,5,6}));
		System.out.println("Suma liczb: 11+44+55+66="+sum.calc(new int[] {11,44,55,66}));
		System.out.println("Suma liczb: -1231+5="+sum.calc(new int[] {-1231,5}));
		
		// policz ile parzystych
		TableOperation countEven;
		countEven = (tab) -> {
			int result = 0;
			for (int number : tab) {
				if(number % 2 == 0) {
					result++;
				}
			}
			return result;
		};
		
		System.out.println("Ile jest parzystych? (1,4,5,6) "+countEven.calc(new int[] {1,4,5,6}));
		System.out.println("Ile jest parzystych? (11,44,55,66)="+countEven.calc(new int[] {11,44,55,66}));
		System.out.println("Ile jest parzystych? (-1231,5,0)="+countEven.calc(new int[] {-1231,5,0}));
		
		
		// sparametryzowany interfejs funkcyjny
		GenericFunctionalInterface<String> prepareMessage;
		prepareMessage = (message) -> {
			String head = "----------------\nWitaj,\n";
			String footer = "\nPozdrawiam,\nSzymon";
		
			return head+message+footer;
		};
		
		System.out.println(prepareMessage.some("dzisiaj zajęcia na 10:00."));
		System.out.println(prepareMessage.some("jutrzejsze zajęcia odwołane."));
		
		
		// odwrotność liczby
		GenericFunctionalInterface<Integer> reverse = number -> -number;
		System.out.println("Odwrotność liczby 5, to "+reverse.some(5));
		System.out.println("Odwrotność liczby -123, to "+reverse.some(-123));
		System.out.println("Odwrotność liczby 68, to "+reverse.some(68));
		
		int x = 1;
		int y = 2;
		runNumericTest(x,y);
		runNumericTest(1,2);
		
		int z = 2;
		runNumericTest(sum, z);
		runNumericTest((tab) -> {
			int result = 0;
			for (int number : tab) {
				result+=number;
			}
			return result;
		}, z);
		
		
		// wyjątki w wyrażeniach lambda
		DataGenerator<Integer> integer = (length) -> {
			if(length < 1 || length > 5000) {
				throw new LengthException();
			}
			
			Integer[] tab = new Integer[length];
			for (int i = 0; i < length; i++) {
				tab[i] = i * 13;
			}
			return tab;
		};
		
		try {
			Integer[] numbers = integer.generate(22);
			for(int i : numbers) {
				System.out.print(i);
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try {
			Integer[] numbers = integer.generate(5001);
			for(int i : numbers) {
				System.out.print(i);
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void runNumericTest(int a, int b) {
		System.out.println(a + b);
	}

	private static void runNumericTest(TableOperation a, int b) {
		int[] tab = { 1, 142, 12, 5, 512, 32, 132, 12, 3123 };
		System.out.println(a.calc(tab) + b);
	}
}
