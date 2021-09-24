package calculatorScanner;

import java.util.Scanner;

public class CalculatorScanner {

	public static double result;

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}
	

	public static double div(double num1, double num2) throws ArithmeticException, CantDivideByLargeNumberException {
	
		if (num2==0) {
			throw new ArithmeticException("Cannot divide by 0");
		}else if (num1 < num2 ) {
			throw new CantDivideByLargeNumberException(" Avoid dividing by a larger number than" + num1);
		}else {
			return num1 / num2;
			
		}
	}
	
}
