//Calculator Revisited
//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller 
//than the second, otherwise it prints out a message saying that the division cannot be performed.
public class Conditionals {
	public static double D1 = 6;
	public static double D2 = 8;
	
	public static void main(String[] args) {
		
		if (D1 < D2) {
			System.out.println(Div());
		} else {
			System.out.println("The division cannot be performed");
		}
	}

	public static double Div() {
		double D3 = D1 / D2;
		return D3;
	}
}