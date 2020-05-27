package pl.marcinblok.kolekcje.zadania.zadanie1;

import java.util.HashSet;

public class Main {
	public static void main(String [] args) {
		
		Student student1 = new Student("Patryk", 1);
		Student student2 = new Student("Ania", 3);
		Student student3 = new Student("Paulina", 2);
		
		Fakultet bioinformatyka = new Fakultet();
		Fakultet obiektyIBazyDanych = new Fakultet();
		Fakultet optymalizacja = new Fakultet();
		
		bioinformatyka.zapiszNaFakultet(student1);
		bioinformatyka.zapiszNaFakultet(student1);
		bioinformatyka.zapiszNaFakultet(student3);
		bioinformatyka.zapiszNaFakultet(student2);
		bioinformatyka.zapiszNaFakultet(new Student("Anna", 5));
		bioinformatyka.zapiszNaFakultet(new Student("Piotr", 7));
		bioinformatyka.zapiszNaFakultet(new Student("Ola", 9));
	
		HashSet listaStudentowBioinformatyki = bioinformatyka.listaZapisanychStudentow;
		System.out.println("Lista studentow Bioinformatyki:" + listaStudentowBioinformatyki);
		
		
	}
}
