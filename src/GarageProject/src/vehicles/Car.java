package vehicles;

public class Car extends Vehicle {
	
	boolean sunroof;


	public Car(String type, String manufacturer, String colour, int wheels, int doors, boolean sunroof) {
		super(type, manufacturer, colour, wheels, doors);
		this.sunroof = sunroof;
	}


	
	public Car(String type, String manufacturer, String colour, int wheels, int doors) {
		super(type, manufacturer, colour, wheels, doors);
	}



	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	
	
	@Override
	public int bill(int a) {
		a = 500;
		System.out.println("The car costs: £" +a);
		return a;
	}




		
	}
		
			
	
	

		
	
	
	
	
	
	
	


