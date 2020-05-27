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
		
		
	}
}
