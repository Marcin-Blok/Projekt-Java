package pl.marcinblok.wyrazenia.stream;

import java.util.List;

public class StreamExamples {
	public static void main(String[] args) {
		List<Student> studenci = Utils.generateStudents(1000);

//		for (Student student : studenci) {
//			System.out.println(student);
//		}

		System.out.println("------------ Studenci z nazwiskiem na literę 'a'");
		studenci.stream().filter((student) -> student.getNazwisko().charAt(0) == 'a')
				.forEach((student) -> System.out.println(student));

		System.out.println("------------ Studenci z nazwiskiem na literę 'a' oraz imieniem na literę 'b'");
		studenci.stream().filter((student) -> student.getNazwisko().charAt(0) == 'a')
				.filter((student) -> student.getImie().charAt(0) == 'b')
				.forEach((student) -> System.out.println(student));
		
		System.out.println("------------ Pobierz imiona pierwszych 10 studentów, wyświetl z dużej litery");
		studenci.stream().map((student) -> student.getImie()).limit(10).forEach((imie) -> {
			imie = imie.replace(imie.charAt(0), Character.toUpperCase(imie.charAt(0)));
			System.out.println(imie);
		}); 
		
		System.out.println("------------ Na jakie litery rozpoczynają się imiona studentów");
		studenci.stream().map((student) -> student.getImie().charAt(0)).distinct().forEach((litera) -> System.out.println(litera));

	}
}
