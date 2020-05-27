package pl.marcinblok.kolekcje.zadania.zadanie1;

import java.util.HashSet;

public class Fakultet {
	
	
	HashSet<Student> listaZapisanychStudentow = new HashSet<>();

	public void zapiszNaFakultet(Student e) {
		if(listaZapisanychStudentow.size() < 5) {
			if(listaZapisanychStudentow.add(e) == true) 
			{
				System.out.println("Zosta³eœ/³aœ zapisany/a na fakultet");
			}else 
			{
				System.out.println("Jesteœ ju¿ na liœcie");
			}
		}else if (listaZapisanychStudentow.size() >= 5)
		{
			System.out.println("Brak miejsc na wybrany fakultet");
		}
	
	}
	


}
