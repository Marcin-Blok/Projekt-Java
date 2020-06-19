package streampracticing;

public class Car {
	private String make;
	private String model;
	private String color;
	private String driveType;
	private String fuelType;
	private int power;
	private String bodyType;
	private int modelYear;
	private String vehicleType;
	private double price;
	private char airconditioning;
	
	
	public Car(String make, String model, String color, String driveType, String fuelType, int power, String bodyType,
			int modelYear, String vehicleType, double price, char airconditioning) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.driveType = driveType;
		this.fuelType = fuelType;
		this.power = power;
		this.bodyType = bodyType;
		this.modelYear = modelYear;
		this.vehicleType = vehicleType;
		this.price = price;
		this.airconditioning = airconditioning;
	}


	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public String getColor() {
		return color;
	}


	public String getDriveType() {
		return driveType;
	}


	public String getFuelType() {
		return fuelType;
	}


	public int getPower() {
		return power;
	}


	public String getBodyType() {
		return bodyType;
	}


	public int getModelYear() {
		return modelYear;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public double getPrice() {
		return price;
	}


	public char getAirconditioning() {
		return airconditioning;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", driveType=" + driveType
				+ ", fuelType=" + fuelType + ", power=" + power + ", bodyType=" + bodyType + ", modelYear=" + modelYear
				+ ", vehicleType=" + vehicleType + ", price=" + price + ", airconditioning=" + airconditioning + "]";
	}
	

	
	

	
	
	
	


}
