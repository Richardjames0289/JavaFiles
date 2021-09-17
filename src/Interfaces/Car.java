package Interfaces;

public class Car implements Vehicle, Convertible {

	@Override
	public void M1() {
		System.out.println("This car has four wheels");
		
	}

	@Override
	public void M2() {
		System.out.println("This car has 6 windows");
	
	}

	@Override
	public void m3() {
		System.out.println("Is car a convertible?");
		
	}
	

}
