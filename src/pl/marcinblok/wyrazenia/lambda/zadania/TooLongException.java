package pl.marcinblok.wyrazenia.lambda.zadania;

public class TooLongException extends Exception {
	
	public TooLongException() {
		super("Tekst jest zbyt długi");
	}

}
