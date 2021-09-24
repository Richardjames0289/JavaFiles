package Interfaces;

public abstract interface Vehicle {

	public void M1();
	public void M2();
		
	public static void main(String[] args) {
		Car car1 = new Car();
		Bicycle bike1 = new Bicycle();
		Van van1 = new Van();
		
		car1.m3();
		bike1.M1();
		van1.M2();
	}
	}

