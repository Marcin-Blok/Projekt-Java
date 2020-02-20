package pl.marcinblok.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import pl.marcinblok.obiektowosc.Student;

public class Meeting {
	private LocalDateTime dateTime;
	private Student student;

	public Meeting(LocalDateTime dateTime, Student student) {
		super();
		this.dateTime = dateTime;
		this.student = student;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime date) {
		this.dateTime = date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return  student + "\t|\t" + dateTime.format(DateTimeFormatter.ofPattern("dd MMM Y\t|\tHH:mm", Locale.forLanguageTag("cy")));
	}

}
