
//

//
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.
//Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.
//
//Results
//A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
//Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

public class Operators {

	public static void main(String[] args) {
		System.out.println(Adds(1, 2));
		System.out.println(subt(8, 6));
		System.out.println(multi(5, 10));
		System.out.println(Div(8, 6));
	}

	// Create a method that accepts two integers as input, then returns an integer
	// that is the sum of these two parameters. (Addition)
	private static int Adds(int int1, int int2) {
		int int3 = int1 + int2;
		return int3;
	}
	// Subtraction - which takes two numbers, then returns the result of the
	// subtraction.

	private static int subt(int sub1, int sub2) {
		int sub3 = sub1 - sub2;
		return sub3;
	}

	// Create the following additional three methods that each take two parameters:
	// Multiplication - which takes two numbers and returns the product.
	private static int multi(int m1, int m2) {
		int m3 = m1 * m2;
		return m3;
	}

	// Division - which takes two numbers, then returns the result of the division.
	// Your division method may have returned the wrong result; This is called a
	// rounding error and is quite common in most languages. this is because we were
	// using ints rather than doubles. Modify the division method so that it takes
	// Double parameters and then return a Double, if not already.
	private static double Div(int D1, int D2) {
		int D3 = D1 / D2;
		return D3;
	}

	
}
