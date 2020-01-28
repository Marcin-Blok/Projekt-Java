package SzkolkaSportowa;

import java.time.LocalDateTime;

public class Trening {
	private LocalDateTime terminTreningu;
	private Trener trener;
	private Sportowiec[] sportowcy;
	
	public Trening(LocalDateTime terminTreningu, Trener trener, Sportowiec ... sportowcy) {
		super();
		this.terminTreningu = terminTreningu;
		this.trener = trener;
		this.sportowcy = sportowcy;
	}

	public LocalDateTime getTerminTreningu() {
		return terminTreningu;
	}

	public void setTerminTreningu(LocalDateTime terminTreningu) {
		this.terminTreningu = terminTreningu;
	}
	
	

}
