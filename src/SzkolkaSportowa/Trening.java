package SzkolkaSportowa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trening {
	private LocalDate dataTreningu;
	private LocalDateTime godzinaTreningu;

	public Trening(LocalDate dataTreningu, LocalDateTime godzinaTreningu) {
		super();
		this.dataTreningu = dataTreningu;
		this.godzinaTreningu = godzinaTreningu;
	}

	public LocalDate getDataTreningu() {
		return dataTreningu;
	}

	public void setDataTreningu(LocalDate dataTreningu) {
		this.dataTreningu = dataTreningu;
	}

	public LocalDateTime getGodzinaTreningu() {
		return godzinaTreningu;
	}

	public void setGodzinaTreningu(LocalDateTime godzinaTreningu) {
		this.godzinaTreningu = godzinaTreningu;
	}

}
