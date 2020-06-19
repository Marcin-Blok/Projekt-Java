package streampracticing;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	
	
		List<Car> vehicleList = new ArrayList<>();
		vehicleList.add(new Car("Audi", "A6", "Navy", "Automatic", "Petrol", 450, "Limousine", 2019, "Used", 340.000, 'Y'));
		vehicleList.add(new Car("Audi", "A8", "Grey", "Automatic", "Petrol", 510, "Limousine", 2020, "New", 470.000, 'Y'));
		vehicleList.add(new Car("Audi", "Quattro", "Red", "Manual", "Petrol", 300, "Coupe", 1982, "Classic", 250.000, 'N'));
		vehicleList.add(new Car("Porsche", "911", "Turquoise", "Automatic", "Petrol", 580, "Coupe", 2020, "New", 630.000, 'Y'));
		vehicleList.add(new Car("Porsche", "Cayenne", "Black", "Automatic", "Diesel", 410, "SUV", 2018, "Used", 130.000, 'Y'));
		vehicleList.add(new Car("Porsche", "Tycan", "Grey", "N/A", "Electric", 750, "Limousine", 2020, "New", 950.000, 'Y'));
		vehicleList.add(new Car("BMW", "650i", "Black", "Automatic", "Petrol", 280, "Coupe", 1980, "Classic", 180.000, 'N'));
		vehicleList.add(new Car("BMW", "760iL", "Navy", "Automatic", "Petrol", 550, "Limousine", 2020, "New", 1025000.00, 'Y'));
		vehicleList.add(new Car("BMW", "M6", "Grey", "Automatic", "Petrol", 580, "Grand Coupe", 2019, "Used", 140.000, 'Y'));
		vehicleList.add(new Car("Ford", "T", "Black", "Manual", "Petrol", 45, "Limousine", 1915, "Classic", 85.000, 'N'));
		vehicleList.add(new Car("Ford", "Focus", "White", "Automatic", "Petrol", 130, "Hatchback", 2016, "Used", 42.000, 'Y'));
		vehicleList.add(new Car("Ford", "GT", "Yellow", "Manual", "Petrol", 370, "Coupe", 1952, "Classic", 4500000.00, 'N'));
		vehicleList.add(new Car("Ford", "Mustang Eleonor", "Grey", "Automatic", "Petrol", 450, "Fastback", 1954, "Classic", 2000000.00, 'N'));
		vehicleList.add(new Car("Bentley", "GT", "Blue", "Automatic", "Petrol", 460, "Convertible", 2020, "New", 600.000, 'Y'));
		vehicleList.add(new Car("Rolls-Royce", "Wraith", "Navy", "Automatic", "Petrol", 550, "Coupe", 2018, "Used", 420.000, 'Y'));
		vehicleList.add(new Car("Fiat", "500", "Red", "Manual", "Petrol", 32, "Hatchback", 1957, "Classic", 40.000, 'N'));
		vehicleList.add(new Car("VW", "Arteon", "Silver", "Automatic", "Diesel", 230, "Limousine", 2020, "New", 110.000, 'Y'));
		vehicleList.add(new Car("Skoda", "Superb", "Brown", "Automatic", "Diesel", 190, "Limousine", 2017, "Used", 67.000, 'Y'));
		vehicleList.add(new Car("BMW", "i3", "Blue", "Automatic", "Electric", 140, "Hatchback", 2018, "Used", 75.000, 'Y'));
		vehicleList.add(new Car("Toyota", "Prius", "Silver", "Automatic", "Electric", 130, "Limousine", 2015, "Used", 40.000, 'Y'));

		
		
		vehicleList.stream().filter((car) -> car.getVehicleType().equalsIgnoreCase("Classic")).forEach(System.out::println);
		
		
		
		
	}
	
	/* 1. Wyświetl wszystkie klasyczne pojazdy.
	 * 2. Odszukaj pojazdy których cena przekracza 700.000, wyposażone w klimatyzację.
	 * 3. Które pojazdy są wyposażone w klimatyzację oraz mają więcej jak 10 lat?
	 * 4. Czy są pojazdy o mocy silnika przekraczającej 300 KM oraz cenie do 200.000?
	 * 5. Które pojazdy są napędzane silnikiem elektrycznym?
	 * 6. Wyświetl wszystkie modele marki Ford.
	 * 7. Wyświetl wszystkie marki pojazdów.
	 * 8. Czy są pojazdy w kolorze 'Grey', które są nowe a ich cena nie przekracza 300.000?
	 */

}
