package vehicles;

public class Motorcycle extends Vehicle{
	
	int sidecar;

	

	public Motorcycle(String type, String manufacturer, String colour, int wheels, int doors, int sidecar) {
		super(type, manufacturer, colour, wheels, doors);
		this.sidecar = sidecar;
	}
	

	public Motorcycle(String type, String manufacturer, String colour, int wheels, int doors) {
		super(type, manufacturer, colour, wheels, doors);
	}


	public int getSidecar() {
		return sidecar;
	}

	public void setSidecar(int sidecar) {
		this.sidecar = sidecar;
	}
	
	@Override
	public int bill(int a) {
		a = 250;
		System.out.println("The motorbike costs: £" +a);
		return a;
	}
	
	

}
