public class Truck extends Vehicle{

	private double maxLoadCapacity;
	private double lengthOfTrailer;
	private double priceOfTrailer;
	
	public Truck(String vehicleNumber, String modelType, String color, int modelYear, double price, double weight,
			int engineCapacity, double maxLoadCapacity, double lengthOfTrailer, double priceOfTrailer) {
		super(vehicleNumber, modelType, color, modelYear, price, weight, engineCapacity);
		this.maxLoadCapacity = maxLoadCapacity;
		this.lengthOfTrailer = lengthOfTrailer;
		this.priceOfTrailer = priceOfTrailer;
	}
	
	public double getMaxLoadCapacity() {
		return maxLoadCapacity;
	}
	
	public double getLengthOfTrailer() {
		return lengthOfTrailer;
	}
	
	public double getPriceOfTrailer() {
		return priceOfTrailer;
	}
	
	@Override
	public double getTotalPrice() throws Exception{
		if(super.getPrice() < 0 || priceOfTrailer < 0) {
			throw new Exception("Price values should be positive for " + getVehicleNumber());
		}
		return super.getPrice() + getPriceOfTrailer();
	}
	
	@Override
	public double getTotalWeight() {
		return super.getTotalWeight() + getMaxLoadCapacity();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s %,.2f kg%n%s %,.2f cm%n%s %,.2f TL%n",
				super.toString(),
				"Max Load Capacity: ", getMaxLoadCapacity(),
				"Length of Trailer: ", getLengthOfTrailer(),
				"Price of Trailer: ", getPriceOfTrailer());
	}
}
