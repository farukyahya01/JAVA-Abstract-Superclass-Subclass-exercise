
public class VehicleDemo{

	public static void main(String[] args) {
		Vehicle.numberOfVehicles = 0;
		
		Vehicle[] myVehicles = new Vehicle[8];
		
		Automobile[] myAutomobiles = new Automobile[3];
		myAutomobiles[0] = new Automobile("0158110101", "A 180d", "Blue", 2021, 250000.00, 1200.00, 1600, 7, 22000.00);
		myAutomobiles[1] = new Automobile("0158110102", "C 200 AMG", "White", 2020, 450000.00, 2000.00, 1700, 10, 15000.00);
		myAutomobiles[2] = new Automobile("0158110103", "E 220d", "Gray", 2021, 1250000.00, 1200.00, 3000, 10, 54000.00);
		
		Bus[] myBuses = new Bus[2];
		myBuses[0] = new Bus("3158128282", "Travego", "White", 2021,  2500000.00, 5000.00, 4000, 40, 22000.00, 0.00);
		myBuses[1] = new Bus("3158128283", "Tourismo", "White", 2021, 3500000.00, 4500.00, 4000, 20, 0.00, 30000.00);
		
		Truck[] myTrucks = new Truck[3];
		myTrucks[0] = new Truck("1158173733", "Actros", "White", 2020, 1500000.00, 5000.00, 5000, 7000.00, 7.30, 50000.00);
		myTrucks[1] = new Truck("1158173734", "Arocs", "Red", 2021, 1700000.00, 4500.00, 5000, 6000.00, 7.30, 50000.00);
		myTrucks[2] = new Truck("1158173735", "Atego", "Red", 2021, 2500000.00, 4000.00, 5000, 5000.00, 7.30, -5000.00);
		
		myVehicles[0] = myAutomobiles[0];
		myVehicles[1] = myAutomobiles[1];
		myVehicles[2] = myAutomobiles[2];
		myVehicles[3] = myBuses[0];
		myVehicles[4] = myBuses[1];
		myVehicles[5] = myTrucks[0];	
		myVehicles[6] = myTrucks[1];
		myVehicles[7] = myTrucks[2];
		
		double totalPriceOfAllVehicles = 0;
		double totalWeightOfAllVehicles = 0;
		
		for(int i = 0; i < myVehicles.length; i++) {
			System.out.println(myVehicles[i].getClass().getSimpleName());
			
			System.out.println("--------------------------------");
			System.out.println(myVehicles[i].toString());
			
			try{
				totalPriceOfAllVehicles += myVehicles[i].getTotalPrice();
				
			}catch(Exception e){
				System.out.println("Price values should be positive for 1158173735");
			}
			
			totalWeightOfAllVehicles += myVehicles[i].getTotalWeight();
		}
		
		System.out.println("Number of Vehicles Created: " + Vehicle.numberOfVehicles);
		System.out.printf("Total Weight of All Vehicles: %,.2f kg\n", totalWeightOfAllVehicles);
		System.out.printf("Total Price of All Vehicles: %,.2f TL\n", totalPriceOfAllVehicles);
	}

}
