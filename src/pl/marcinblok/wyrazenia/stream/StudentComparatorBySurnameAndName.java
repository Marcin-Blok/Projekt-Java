package pl.marcinblok.wyrazenia.stream;

import java.util.Comparator;

public class StudentComparatorBySurnameAndName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int result = o1.compareTo(o2);
		if(result == 0) {
			result = o1.getImie().compareTo(o2.getImie());
		}
		return result;
	}

}
