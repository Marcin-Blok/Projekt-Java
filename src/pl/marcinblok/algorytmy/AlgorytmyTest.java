package pl.marcinblok.algorytmy;

import java.util.Arrays;

public class AlgorytmyTest {
	public static void main(String[] args) {
		int liczby[] = {5, 1, 6, 0, 8, -1};
		
		AlgorytmySortowania.sortowanieBabelkoweRosnaco(liczby);
		System.out.println("Wynik:"+Arrays.toString(liczby));
		

		AlgorytmySortowania.sortowanieBabelkoweMalejaco(liczby);
		System.out.println("Wynik:"+Arrays.toString(liczby));
	}
}
