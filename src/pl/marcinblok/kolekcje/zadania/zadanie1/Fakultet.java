package pl.marcinblok.kolekcje.zadania.zadanie1;

import java.util.HashSet;

public class Fakultet {
	
	
	HashSet<Student> listaZapisanychStudentow = new HashSet<>();

	public void zapiszNaFakultet(Student e) {
		if(listaZapisanychStudentow.size() < 5) {
			if(listaZapisanychStudentow.add(e) == true) 
			{
				System.out.println("Zosta�e�/�a� zapisany/a na fakultet");
			}else 
			{
				System.out.println("Jeste� ju� na li�cie");
			}
		}else if (listaZapisanychStudentow.size() >= 5)
		{
			System.out.println("Brak miejsc na wybrany fakultet");
		}
	
	}
	


}
