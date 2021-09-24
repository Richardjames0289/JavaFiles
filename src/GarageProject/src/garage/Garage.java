package garage;

import java.util.ArrayList;

import vehicles.Vehicle;

public class Garage {
	
	private	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	int carCost;
	int vanCost;
	int bikeCost;
	int count; 
	
	
	
////Create a method in Garage that iterates through each Vehicle, 
//calculating a bill for each type of Vehicle in a different way,
//depending on the type of Vehicle it is (this does not need to be complex).
	
	public void iterations(int carCost2) {
		count = 0;
		
	for (Vehicle vehicle : vehicles) {
		if (vehicle.getType() == "Car") {
		carCost = (int) vehicle.bill(carCost);
		} else if (vehicle.getType() == "Van") {
		vanCost = (int) vehicle.bill(vanCost);
		} else if (vehicle.getType() == "Motorbike") {
		bikeCost = (int) vehicle.bill(bikeCost);
		} else {
		count++;
		}
	}
	}
	
//	Garage should have methods that add a Vehicle, remove a Vehicle
//	by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.
	
		
	public void addVehicles(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.vehicles.remove(v)) {
			System.out.println("\n\nVehicle removed.");
		} else {
			System.out.println("\n\nVehicle not found.");
		}
	}
	public void removeVehiclesByType(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == type) {
				found.add(vehicle);
			}
		}
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
		}
	
//	fix a Vehicle (which calculates the bill) 
	iterations(carCost);
	iterations(vanCost);
	iterations(bikeCost);
	
	}
	
//	and to empty the Garage.
	
	public void deleteGarage() {
		vehicles.removeAll(vehicles);
	}

//	Garage should have a method to remove multiple Vehicles by their type.
	
	public void removeMulti(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getType() == type) {
				found.add(vehicle);
			}
		}
		
		for(Vehicle destroy: found) {
			vehicles.remove(destroy);
		}
		
	}
	}



