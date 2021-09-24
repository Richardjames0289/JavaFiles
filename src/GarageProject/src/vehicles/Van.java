package vehicles;

public class Van extends Vehicle {
	
	int space;



	public Van(String type, String manufacturer, String colour, int wheels, int doors, int space) {
		super(type, manufacturer, colour, wheels, doors);
		this.space = space;
	}
	

	public Van(String type, String manufacturer, String colour, int wheels, int doors) {
		super(type, manufacturer, colour, wheels, doors);
	}


	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}
	
	@Override
	public int bill(int a) {
		a = 1000;
		System.out.println("The Van costs: £" +a);
		return a;
	}

	
	

}
