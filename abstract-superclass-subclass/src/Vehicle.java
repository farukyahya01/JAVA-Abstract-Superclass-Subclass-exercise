/*
 * Personel and Contect of App Information
 * Created by 		- Faruk Yahya AKSU
 * Created date 	- 10.05.2021
 * Content of App   - Write a Java abstract superclass Vehicle and three subclasses Automobile, Bus, and Truck with the following UML diagram.: 
 * 
 * Note : This program was written using the eclipse program.
 * */

public abstract class Vehicle{

	private String vehicleNumber;
	private String modelType;
	private String color;
	private int modelYear;
	private double price;
	private double weight;
	private int engineCapacity;
	
	public static int numberOfVehicles;
	
	public Vehicle(String vehicleNumber, String modelType, String color, int modelYear, double price, double weight, int engineCapacity) {
		this.vehicleNumber = vehicleNumber;
		this.modelType = modelType;
		this.color = color;
		this.modelYear = modelYear;
		this.price = price;
		this.weight = weight;
		this.engineCapacity = engineCapacity;
		
		numberOfVehicles++;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public String getModelType() {
		return modelType;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract double getTotalPrice() throws Exception;
	
	public double getTotalWeight() {
		return weight;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s %s%n%s %s%n%s %d%n%s %,.2f TL%n%s %,.2f kg%n%s %d cc",
				"Vehicle Number: ", getVehicleNumber(),
				"Model Type: ", getModelType(),
				"Color: ", getColor(),
				"Model Year: ", getModelYear(),
				"Price: ", getPrice(),
				"Weight: ", getTotalWeight(),
				"Engine Capacity: ", getEngineCapacity());
	}

	
}
