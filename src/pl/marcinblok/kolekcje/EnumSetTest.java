package pl.marcinblok.kolekcje;

import java.util.EnumSet;

public class EnumSetTest {
	public static void main(String[] args) {
		EnumSet<Status> statusyUprzywilejowane = EnumSet.allOf(Status.class);
		
		Status[] tablicaEnum = new Status[statusyUprzywilejowane.size()];
		tablicaEnum=statusyUprzywilejowane.toArray(tablicaEnum);
		
		
		for(Status s : tablicaEnum) {
			System.out.println(s);
		}
		
		statusyUprzywilejowane.remove(Status.STANDAR);
		
		EnumSet<Status> statusy2 = EnumSet.of(Status.NIEPELNOSPRAWNY, Status.W_CIAZY);
		
		System.out.println(statusyUprzywilejowane);
	}
}
