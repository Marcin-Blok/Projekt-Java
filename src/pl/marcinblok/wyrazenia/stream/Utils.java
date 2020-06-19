package pl.marcinblok.wyrazenia.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
	public static Student generateStudent() {
		return new Student(generujImie(), generujNazwisko(), generujIndex());
	}
	
	public static List<Student> generateStudents(int count) {
		List<Student> generated = new ArrayList<>();

		String nazwisko = "abc";
		for (int i = 0; i < count; i++) {
			
			if(i % 2 == 0) {
				nazwisko = generujNazwisko();
			}
			
			generated.add(new Student(generujImie(), nazwisko, generujIndex(), generujSrednia()));
		}
		return generated;
	}
	
	public static List<Pracownik> generatePraconicy(int count) {
		List<Pracownik> generated = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			generated.add(new Pracownik(generujImie(), generujPensje()));
		}
		return generated;
	}


	private static int generujPensje() {
		Random rnd = new Random();
		return (int)2222 + rnd.nextInt(41212);
	}

	private static double generujSrednia() {
		Random rnd = new Random();
		return 1 + rnd.nextInt(5);
	}

	private static int generujIndex() {
		Random rnd = new Random();
		return 100000 + rnd.nextInt(900000);
	}

	private static String generujNazwisko() {
		return givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect(10);
	}

	private static String generujImie() {
		return givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect(5);
	}

	public static String givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect(int length) {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = length;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		
		return generatedString;
	}
}
