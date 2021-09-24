package vehicles;

public class Vehicle {
	
		
		private String type;
		private String manufacturer;
		private String colour;
		private int wheels;
		private int doors;
		
	
		public Vehicle(String type, String manufacturer, String colour, int wheels, int doors) {
			super();
			this.type = type;
			this.manufacturer = manufacturer;
			this.colour = colour;
			this.wheels = wheels;
			this.doors = doors;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public String getManufacturer() {
			return manufacturer;
		}


		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}


		public String getColour() {
			return colour;
		}


		public void setColour(String colour) {
			this.colour = colour;
		}


		public int getWheels() {
			return wheels;
		}


		public void setWheels(int wheels) {
			this.wheels = wheels;
		}


		public int getDoors() {
			return doors;
		}


		public void setDoors(int doors) {
			this.doors = doors;
		}


		@Override
		public String toString() {
			return "vehicle [type=" + type + ", manufacturer=" + manufacturer + ", colour=" + colour + ", wheels="
					+ wheels + ", doors=" + doors + "]";
		}
		
		public int bill(int a) {
			System.out.println("The vehicle costs £" + a);
			return a;
			
			
		}

		}
		



	


