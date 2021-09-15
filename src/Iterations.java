public class Iterations {

	public static void main(String[] args) {
//		for (int i=100; i<=200; i++) {
//			if (i%2 == 0) {
//				System.out.println("-");
//			} else {
//				System.out.println("*");
//			}
//		}
//	}
		// Create a method that can print out the numbers 1-10 10 times each.
//		count();
//		flow5();
		double change = coins(12.53, 15);
		
		coins2(change);
	}

//	public static void count() {
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//
//				System.out.println(j);
//			}
//
//		}
//	}
//}

//public static void flow5() {
//for (int i=1; i<=10; i++) {
//int count =0;
//while (count<i) {
//System.out.println(i);
//count++;
//}
//}
//}
	public static double coins(double price, double cost) {
		double change = cost - price;
		return change;
		
				
	}
	public static void coins2(double change) {
		int fifties = 0;
		while (change > 50) {
			change = change - 50;
			fifties++;
		}
	}
}
