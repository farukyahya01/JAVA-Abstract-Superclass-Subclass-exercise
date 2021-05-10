public class Automobile extends Vehicle {
	
	private int numberOfAirbags;
	private double priceOfExtraOptions;
	
	public Automobile(String vehicleNumber, String modelType, String color, int modelYear, double price, double weight,
			int engineCapacity, int numberOfAirbags, double priceOfExtraOptions ) {
		super(vehicleNumber, modelType, color, modelYear, price, weight, engineCapacity);
		this.numberOfAirbags = numberOfAirbags;
		this.priceOfExtraOptions = priceOfExtraOptions;
	}
	
	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}
	
	public double getPriceOfExtraOptions() {
		return priceOfExtraOptions;
	}
	
	public double getTotalPrice() {
		return 12.4;
	}
	
	public double getTotalWeight() {
		// (5 * 80) mean is the 5 people of avarage 80 kgs
		return super.getTotalWeight() + (5 * 80);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s %d%n%s %,.2f TL%n",
				super.toString(),
				"Number of Airbags: ", getNumberOfAirbags(),
				"Price of ExtraOptions: ", getPriceOfExtraOptions());
				
	}

}
