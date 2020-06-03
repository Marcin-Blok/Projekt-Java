package pl.marcinblok.wyrazenia.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaExpressionExamples {
	public static void main(String[] args) {
		// czy liczba parzysta - wyrażenie
		NumericCondition isEven;
		isEven = (int s) -> (s % 2 == 0);

		System.out.println("Czy liczba 3 jest parzysta? " + isEven.check(3));
		System.out.println("Czy liczba 44 jest parzysta? " + isEven.check(44));
		System.out.println("Czy liczba -11 jest parzysta? " + isEven.check(-11));

		// czy z przedziału - wyrażenie
		NumericCondition fromRange;
		fromRange = (number) -> (number >= 5 && number <= 55);
		System.out.println("Czy liczba 3 należy do zakresu od 5 do 55? " + fromRange.check(3));
		System.out.println("Czy liczba 44 należy do zakresu od 5 do 55? " + fromRange.check(44));
		System.out.println("Czy liczba -11 należy do zakresu od 5 do 55? " + fromRange.check(-11));

		// policz sumę - wyrażenie blokowe
		TableOperation sum;
		sum = (tab) -> {
			int result = 0;
			for (int number : tab) {
				result += number;
			}
			return result;
		};
		System.out.println("Suma liczb: 1+4+5+6=" + sum.calc(new int[] { 1, 4, 5, 6 }));
		System.out.println("Suma liczb: 11+44+55+66=" + sum.calc(new int[] { 11, 44, 55, 66 }));
		System.out.println("Suma liczb: -1231+5=" + sum.calc(new int[] { -1231, 5 }));

		// policz ile parzystych
		TableOperation countEven;
		countEven = (tab) -> {
			int result = 0;
			for (int number : tab) {
				if (number % 2 == 0) {
					result++;
				}
			}
			return result;
		};

		System.out.println("Ile jest parzystych? (1,4,5,6) " + countEven.calc(new int[] { 1, 4, 5, 6 }));
		System.out.println("Ile jest parzystych? (11,44,55,66)=" + countEven.calc(new int[] { 11, 44, 55, 66 }));
		System.out.println("Ile jest parzystych? (-1231,5,0)=" + countEven.calc(new int[] { -1231, 5, 0 }));

		// sparametryzowany interfejs funkcyjny
		GenericFunctionalInterface<String> prepareMessage;
		prepareMessage = (message) -> {
			String head = "----------------\nWitaj,\n";
			String footer = "\nPozdrawiam,\nSzymon";

			return head + message + footer;
		};

		System.out.println(prepareMessage.some("dzisiaj zajęcia na 10:00."));
		System.out.println(prepareMessage.some("jutrzejsze zajęcia odwołane."));

		// odwrotność liczby
		GenericFunctionalInterface<Integer> reverse = number -> -number;
		System.out.println("Odwrotność liczby 5, to " + reverse.some(5));
		System.out.println("Odwrotność liczby -123, to " + reverse.some(-123));
		System.out.println("Odwrotność liczby 68, to " + reverse.some(68));

		int x = 1;
		int y = 2;
		runNumericTest(x, y);
		runNumericTest(1, 2);

		int z = 2;
		runNumericTest(sum, z);
		runNumericTest((tab) -> {
			int result = 0;
			for (int number : tab) {
				result += number;
			}
			return result;
		}, z);

		// wyjątki w wyrażeniach lambda
		DataGenerator<Integer> integer = (length) -> {
			if (length < 1 || length > 5000) {
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
			for (int i : numbers) {
				System.out.print(i);
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		try {
			Integer[] numbers = integer.generate(5001);
			for (int i : numbers) {
				System.out.print(i);
			}
		} catch (LengthException e) {
			System.out.println(e.getMessage());
		}

		Osoba osoba = new Osoba("Marek", 52);
		boolean czyUdaloSie = osoba.zwiekszWiek(22);

		if (czyUdaloSie) {
			System.out.println("Zwiększony wiek: " + osoba.getWiek());
		}

		osoba.zwiekszWiek();

//		NumericCondition czyLiczbaJestWiekszaRownaOd18 = (n) -> n>=18;
		NumericCondition czyLiczbaJestWiekszaRownaOd18 = Utils::czyPelnoletni;
		System.out.println("Czy jestem większa równa 18? " + czyLiczbaJestWiekszaRownaOd18.check(18));

		System.out.println("Czy pełnoletnia: " + Utils.czyPelnoletni(18));

		int[] liczby = { 1, 2, 5, 5, 2, 2, 5, 2, 23, 62 };
		Utils utils = new Utils();
		NumericCondition czyPodzielnaPrzez2 = utils::czyParzysta;
		for (int liczba : liczby) {
			System.out.println("Czy liczba " + liczba + " jest podzielna przez 2? " + czyPodzielnaPrzez2.check(liczba));
		}

		double cena = 5.55;
		double cena2 = 2.21;
		System.out.println("Oblicz cenę po obniżce: " + utils.roznica(cena, cena2));

		System.out.println("wiek: " + osoba.getWiek());

		NumberOperation<Integer> no = (a, b) -> (int) a - b;
		osoba.zmniejszWiek(no, 20);
		osoba.zmniejszWiek(utils::<Integer>roznica, 20);
		System.out.println("wiek: " + osoba.getWiek());

		InitializeOsoba<String> osobaZImieniem = Osoba::new;
		InitializeOsoba<Integer> osobaZWiekiem = Osoba::new;

		Osoba karol = osobaZImieniem.create("Karol");
		System.out.println("wiek: " + karol.getWiek());
		System.out.println("imie: " + karol.getImie());

		Osoba ziutek = osobaZWiekiem.create(55);
		System.out.println("wiek: " + ziutek.getWiek());
		System.out.println("imie: " + ziutek.getImie());

		// predefiniowane interfejsy funkcyjne
		UnaryOperator<Double> obliczRabat = (n) -> (n * 0.8);
		System.out.printf("Cena po rabacie: %.2f", obliczRabat.apply(55.50));

		BinaryOperator<String> polaczTekst = (t1, t2) -> t1 + t2;
		System.out.println("Polaczony tekst: " + polaczTekst.apply("Witaj ", "świecie!"));
		
		Osoba wujek = new Osoba("Marian", 52);
		Consumer<Osoba> przywitajOsobe = (n) -> System.out.println("Dzień dobry "+n.getImie()+".");
		przywitajOsobe.accept(wujek);
		
		List<Osoba> osoby = new ArrayList<>();
		osoby.add(new Osoba("Krystian", 22));
		osoby.add(new Osoba("Kasia", 52));
		osoby.add(new Osoba("Wiola", 15));
		
		Supplier<Osoba> poszukajKasie = () -> {
			Osoba szukanaOsoba = null;
			for (Osoba os : osoby) {
				if(os.getImie().equals("Kasia")){
					szukanaOsoba = os;
				}
			}
			return szukanaOsoba;
		};
		
		System.out.println("Ile lat ma Kasia ? "+poszukajKasie.get().getWiek());
		
		
		Function<String, Integer> policzIleSlow = (t) -> {
			int ileSlow = 0;
			for(Character c : t.toCharArray()) {
				if(c == ' ') {
					ileSlow++;
				}
			}
			return ileSlow+1;
		};
		
		System.out.println("Ile jest słow w tym zadniu? "+policzIleSlow.apply("Ile jest spacji w tym zadniu?"));
		System.out.println("Ile słow: "+policzIleSlow.apply("So it will print two digits after decimal point here it will print 12.79"));
		System.out.println("Ile słow: "+policzIleSlow.apply("Here's the code. The two caveats I mentioned above can be addressed pretty easily, however, speed mattered more to me than accuracy, so i left it here. String manipulations like System.out.printf(\"%.2f\",123.234); are computationally costly compared to mathematical operations. In my tests, the below code (without the sysout) took 1/30th the time compared to String manipulations."));

		
		String tekst = "Więcej podróżnych w pociągach PKP Intercity! Zwiększamy limit zajętości miejsc w naszych pociągach. Od 1 czerwca będzie możliwość zakupu biletów na wszystkie miejsca siedzące dostępne w pociągu\" – poinformował przed dwoma dniami przewoźnik. Miał pewnie nadzieję, że ucieszy to podróżnych planujących czerwcowe wypady i nieśmiało planujących wakacje, ale efekt okazał się zgoła inny.\r\n" + 
				"\r\n" + 
				"Wszystkim nie dogodzisz. Na facebookowym profilu PKP Intercity żale wylewają zarówno ci, dla których zwiększenie liczby pasażerów jest ryzykowne i nie życzą sobie, by ktokolwiek usiadł obok, jak i ci, którzy pytają, jak przewoźnik wyobraża sobie podróżowanie w sytuacji, gdy do pociągu będzie mogło wejść tylko tylu pasażerów, ile jest miejsc siedzących. I ani jednego więcej. To oznacza koniec spontanicznego podróżowania, kiedy to bilet można było kupić w ostatniej chwili i, w najgorszym wariancie, stać na korytarzu przez cała trasę z Krakowa do Gdańska.\r\n" + 
				"\r\n" + 
				"O ile pasażerowie udający się w celach wypoczynkowych, mogą jakoś zaplanować podróż z wyprzedzeniem, to prawdziwy problem mają ci, którzy pociągiem dojeżdżają do pracy. Wprawdzie PKP Intercity obsługuje przede wszystkim trasy dalekobieżne, ale każdego dnia choćby z Łodzi kilkanaście tysięcy ludzi dojeżdża do pracy w stolicy. Obecnie jest ich mniej, ale firmy powoli wznawiają pracę w biurach, więc z każdym tygodniem liczba podróżnych będzie się zwiększała.";
		
		Predicate<String> czyZawieraSlowo = (n) -> tekst.contains(n);
		
		System.out.println("Czy w tekście była mowa o PKP? "+czyZawieraSlowo.test("PKP"));
		System.out.println("Czy w tekście była mowa o mojej mamie? "+czyZawieraSlowo.test("mama"));
		System.out.println("Czy w tekście była mowa o wypoczynku? "+czyZawieraSlowo.test("wypoczyn"));
		System.out.println("Czy pasażerowie mieli żal? "+czyZawieraSlowo.test("żal"));
	}

	private static void runNumericTest(int a, int b) {
		System.out.println(a + b);
	}

	private static void runNumericTest(TableOperation a, int b) {
		int[] tab = { 1, 142, 12, 5, 512, 32, 132, 12, 3123 };
		System.out.println(a.calc(tab) + b);
	}

}
