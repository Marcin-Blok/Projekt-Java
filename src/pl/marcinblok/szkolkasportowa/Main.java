package pl.marcinblok.szkolkasportowa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDate dataUrodzenia = LocalDate.of(1980, 02, 21);		
		Klub gksABC = new Klub("GKS ABC", LocalDate.of(1918, 12, 12));
		Trener t1 = new Trener("Krystian", "Nowak", LocalDate.of(1950, 12, 11), 5111, "du¿e");
		Pilkarz p1 = new Pilkarz("Marian", "Kowalski", LocalDate.parse("1980-02-21"), "rybki", LocalDate.parse("1990-06-23"), gksABC, t1, "pomocnik");
		Pilkarz p2 = new Pilkarz("Marian", "Kowalski", LocalDate.parse("1980-02-21"), "steki", LocalDate.parse("1990-06-14"), gksABC, t1, "napastnik");

		LocalDateTime dataTreningu = LocalDateTime.now().plusDays(7);
		Trening trening = new Trening(dataTreningu, t1, p1, p2);
		Trening trening2 = new Trening(dataTreningu, t1, p1);
		
		System.out.println(t1.getImie() + " " + t1.getNazwisko() + " " + t1.getDataUrodzenia()+ " " + t1.getDoswiadczenie());

		System.out.println(p1.getImie() + " " + p1.getNazwisko() + " " + p1.getDataUrodzenia() +  " " + p1.getDieta() + " " + p1.getDataRozpoczeciaKariery() + " " + p1.getAktualnyKlub().toString());
		
	}
	
}
