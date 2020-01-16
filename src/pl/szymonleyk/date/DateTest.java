package pl.szymonleyk.date;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import obiektowosc.Student;

public class DateTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(-232342);
		System.out.println(d2);
		
		System.out.println(d1.before(d2));
		
		
		// calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.HOUR, 20);
		System.out.println(c.getTime());
		c.setTimeZone(TimeZone.getDefault());
		System.out.println(c.getTime());
		c.set(Calendar.SECOND, 55);
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone().inDaylightTime(c.getTime()));
		
		
		// -----------------------------------------
		
		Calendar c1 = Calendar.getInstance();
		System.out.println("Czas w Polsce: "+c1.get(Calendar.DAY_OF_YEAR)+" - "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE));		
		c1.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println("Czas w Los Angeles: "+c1.get(Calendar.DAY_OF_YEAR)+" - "+c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE));
		
		// -------------------------------------
		
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		
		System.out.println();

		// dzieñ dzisiejszy
		int liczbaSpotkan = 150;
		Student student = new Student("Marcin", "Blok");
		LocalDateTime firstMeeting = LocalDateTime.of(LocalDate.of(2020, 01, 23), LocalTime.of(11, 00));
		
		// stworzy³em cykliczne spotkania na podstawie danych
		Meeting[] meetings = new Meeting[liczbaSpotkan];
		for(int i = 0; i < liczbaSpotkan; i++) {
			Meeting meeting = new Meeting(firstMeeting.plusDays(i*7), student);	
			meetings[i] = meeting;
		}
		
		// wyœwietliæ info o spotkaniach
		for(Meeting meeting:meetings) {
			System.out.println(meeting);
			
			// zapisaæ do pliku
			FileWriter file;
			try {
				file = new FileWriter("spotkania.txt", true);
				BufferedWriter out = new BufferedWriter(file);
		        out.write(meeting.toString()+"\n");
		        out.close();
			} catch (IOException e) {
				System.out.println("Jakiœ b³¹d.");
			}
		}
		
		
		
		
		
		// sprawdz wiek
		LocalDate birthDate = LocalDate.of(2005, 02, 11);
		LocalDate currDate = LocalDate.now();

		Period period = Period.between(birthDate, currDate);
		System.out.println("Od urodzenia minê³o: "+period.getYears() + " lat, "+period.getMonths()+" miesiêcy, "+period.getDays()+" dni.");
		
		
		System.out.println(Period.ofYears(2050));
		
		Duration d = Duration.ofHours(24);
		System.out.println(d.toNanos());

	}
}
