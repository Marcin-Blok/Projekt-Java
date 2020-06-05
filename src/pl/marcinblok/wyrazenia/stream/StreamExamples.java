package pl.marcinblok.wyrazenia.stream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExamples {
	public static void main(String[] args) {
		List<Student> studenci = Utils.generateStudents(1000);

//		for (Student student : studenci) {
//			System.out.println(student);
//		}

//		System.out.println("------------ Studenci z nazwiskiem na literę 'a'");
//		studenci.stream().filter((student) -> student.getNazwisko().charAt(0) == 'a')
//				.forEach((student) -> System.out.println(student));
//
//		System.out.println("------------ Studenci z nazwiskiem na literę 'a' oraz imieniem na literę 'b'");
//		studenci.stream().filter((student) -> student.getNazwisko().charAt(0) == 'a')
//				.filter((student) -> student.getImie().charAt(0) == 'b')
//				.forEach((student) -> System.out.println(student));
//		
//		System.out.println("------------ Pobierz imiona pierwszych 10 studentów, wyświetl z dużej litery");
//		studenci.stream().map((student) -> student.getImie()).limit(10).forEach((imie) -> {
//			imie = imie.replace(imie.charAt(0), Character.toUpperCase(imie.charAt(0)));
//			System.out.println(imie);
//		}); 
//		
//		System.out.println("------------ Na jakie litery rozpoczynają się imiona studentów");
//		studenci.stream().map((student) -> student.getImie().charAt(0)).distinct().forEach((litera) -> System.out.println(litera));

//		System.out.println("------------ Posortuj studentów po nazwisku");
//		studenci.stream().sorted().forEach(System.out::println);

//		System.out.println("------------ Posortuj studentów po imieniu");
//		studenci.stream().sorted(new StudentComparatorByName()).forEach(System.out::println);

//		System.out.println("------------ Posortuj studentów po nazwisku oraz imieniu");
//		studenci.stream().sorted(new StudentComparatorBySurnameAndName()).forEach(System.out::println);

//		System.out.println("------------ Posortuj studentów po nazwisku oraz imieniu, wrzuć do tablicy");
//		Object[] abc = studenci.stream().sorted(new StudentComparatorBySurnameAndName()).toArray();
//
//		for (Object a : abc) {
//			Student s = (Student) a;
//			System.out.println(s.getImie());
//		}

		System.out.println("------------ Poszukaj studenta z największą średnią");
		Optional<Student> max = studenci.stream().max(new StudentComparatorByAVG());
		if (max.isPresent()) {
			System.out.println(max.get());
		}

		System.out.println("------------ Poszukaj studenta z najmniejszą średnią");
		Optional<Student> min = studenci.stream().min(new StudentComparatorByAVG());
		if (min.isPresent()) {
			System.out.println(min.get());
		}

		System.out.print("------------ Ile jest średnich powyżej 3.0? ");
		int ile = studenci.stream().map(s -> s.getAverage()).reduce(0.0, (w, s) -> {
			if (s > 3.0) {
				System.out.println("znalazłem: "+s);
				return w+1;
			} else {
				return w;
			}
		}).intValue();
		
		/*
		 	znalazłem: 4.0
			znalazłem: 1.0
			znalazłem: 4.0
			znalazłem: 2.0
			znalazłem: 5.0
			
			(0.0, 4.0) -> 1.0
			(1.0, 1.0) -> 1.0
			(1.0, 4.0) -> 2.0
			(2.0, 2.0) -> 2.0
			(2.0, 5.0) -> 3.0
		 */
		System.out.println(ile);

		List<Pracownik> pracownicy = Utils.generatePraconicy(20);
		System.out.println("------------ Policz ile potrzebujesz na wypłatę pensji dla pracowników.");
		Optional<Integer> sumaPensji = pracownicy.stream().map(pracownik -> pracownik.getPensja())
				.reduce((p1, p2) -> p1 + p2);
		System.out.println("Wszyscy pracownicy: ");
		pracownicy.forEach(System.out::println);
		System.out.println("Suma pensji: " + sumaPensji.get());

		// 22
		// 1
		// 51
		
		/* 
		 * (0, 22) -> 22
		 * (22, 1) -> 23
		 * (23, 51) -> 74
		 */
		
		/*
		 * (22, 1) -> 23
		 * (23, 51) -> 74
		 * 
		 */
		
		System.out.println("------- Znajdz studentó ze średnią powyżej 3.0");
		List<Student> studenciZWyzszaSrednia = studenci.stream().filter(s -> s.getAverage()>3.0).collect(Collectors.toList());
		
		System.out.println("Ilu ich jest ? "+studenciZWyzszaSrednia.size());
		
		Set<Student> studenciZWyzszaSrednia2 = studenci.stream().filter(s -> s.getAverage()>3.0).collect(Collectors.toSet());
		System.out.println("Ilu ich jest ? "+studenciZWyzszaSrednia2.size());
		
		List<Student> studenciZWyzszaSrednia3 = studenci.stream().filter(s -> s.getAverage()>3.0).distinct().collect(Collectors.toList());
		System.out.println("Ilu ich jest ? "+studenciZWyzszaSrednia3.size());
		
		
		// Zadania
		// 1. wyświetl studentó z indeksami ropoczynającymi się na cyfrę 3 lub 8
		// 2. oblicz średnią z parzystych indeksów
		// 3. Wyświetl każdego studenta w formacie np. pierwsza litera imienia +
		// nazwisko np. sleyk
		

	}
}
