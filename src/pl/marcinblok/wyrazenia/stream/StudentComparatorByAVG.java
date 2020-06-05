package pl.marcinblok.wyrazenia.stream;

import java.util.Comparator;

public class StudentComparatorByAVG implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.getAverage(), o2.getAverage());
	}

}
