//Create a method which accepts 3 parameters, 2 integers and a boolean.
//
//If the boolean is true, the method will return a sum of the two numbers, and 
//it if is false it will return the multiplication of the two numbers.
//For example:
//
//Input (1, 2, true) -> 3
//Input (3, 3, false) -> 9
//Input (1, 1, true) -> 2

public class flowchart {

	public static void main(String[] args) {
		bools();
		flow(500);
	}

	public static void bools() {
		int int1 = 1;
		int int2 = 2;
		int int3 = 3;
		boolean bool = false;
		if (bool == true) {
			System.out.println(int1 + int2);
		} else {
			System.out.println(int1 * int2);
		}
		}
		
	public static void flow(int A) {
		
		if (A > 2000) {
			System.out.println("A");
		if (A > 6000)
			System.out.println("C");
		} else {
			System.out.println("B");
		if (A > 4000) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		}
		if(A <= 2000) {
			System.out.println("1");
		if(A < 100 ) {
			System.out.println("2");
		} else {
			System.out.println("3");
				if ( A < 600) {
					System.out.println("4");
					if ( A < 500) {
					System.out.println("7");
					}else {
					System.out.println("6");
				 
					System.out.println("5");
				}
				}
		}
		}
		
			
		
	}
			
				



}
