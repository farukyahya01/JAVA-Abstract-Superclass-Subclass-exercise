
public class Bus extends Vehicle {

	private int numberOfPassengerSeats;
	private double priceOfDriverBed;
	private double priceOfToilet;
	
	public Bus(String vehicleNumber, String modelType, String color, int modelYear, double price, double weight,
			int engineCapacity, int numberOfPassengerSeats, double priceOfDriverBed, double priceOfToilet) {
		super(vehicleNumber, modelType, color, modelYear, price, weight, engineCapacity);
		this.numberOfPassengerSeats = numberOfPassengerSeats;
		this.priceOfDriverBed = priceOfDriverBed;
		this.priceOfToilet = priceOfToilet;
	}

	public int getNumberOfPassengerSeats() {
		return numberOfPassengerSeats;
	}
	
	public double getPriceOfDriverBed() {
		return priceOfDriverBed;
	}
	
	public double getPriceOfToilet() {
		return priceOfToilet;
	}
	
	@Override
	public double getTotalPrice() {
		return super.getPrice() + getPriceOfDriverBed() + getPriceOfToilet();
	}
	
	@Override
	public double getTotalWeight() {
		return super.getTotalWeight() + ((getNumberOfPassengerSeats() + 1) * 80);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s %d%n%s %,.2f TL%n%s %,.2f TL%n",
				super.toString(),
				"Number of Passenger Seats: ", getNumberOfPassengerSeats(),
				"Price of Driver Bed: ", getPriceOfDriverBed(),
				"Price of Toilet: ", getPriceOfToilet());
	}

}
