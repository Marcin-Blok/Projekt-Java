package pl.marcinblok.wyrazenia.stream;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getImie().compareTo(o2.getImie());
	}

}
