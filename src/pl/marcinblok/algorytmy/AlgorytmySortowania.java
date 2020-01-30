package pl.marcinblok.algorytmy;

public class AlgorytmySortowania {

	/*
	 * 
	 procedure bubbleSort( A : lista elementów do posortowania )
	   n = liczba_elementów(A)
	    do
	     for (i = 0; i < n-1; i++) do:
	       if A[i] > A[i+1] then
	         swap(A[i], A[i+1])
	       end if
	     end for
	     n = n-1
	   while n > 1
	 end procedure
	 
	 */
	
	
	public static void sortowanieBabelkoweRosnaco(int[] liczby) {
		int n = liczby.length;
		do {
			for (int i = 0; i < n-1; i++) {
				if(liczby[i] > liczby[i+1]) {
					zamienMiejscami(liczby, i, i+1);
				}
			}
			n--;
		} while (n > 1);
	}
	
	
	/*
	 * 1 5 7 2
	 * 5 1 7 2
	 * 5 7 1 2
	 * 5 7 2 1   n--
	 * 7 5 2 1 
	 * 7 5 2 1   n--
	 * 7 5 2 1   n--
	 */
	public static void sortowanieBabelkoweMalejaco(int[] liczby) {
		int n = liczby.length;
		do {
			for (int i = 0; i < n-1; i++) {
				if(liczby[i] < liczby[i+1]) {
					zamienMiejscami(liczby, i, i+1);
				}
			}
			n--;
		} while (n > 1);
	}


	private static void zamienMiejscami(int[] liczby, int i, int j) {
		int tmp = liczby[i];
		liczby[i] = liczby[j];
		liczby[j] = tmp;
	}	
}
