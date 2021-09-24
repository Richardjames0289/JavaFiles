package PrinterScanner;

import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	
	public void method() {
	
	boolean menuflow;
	String Menuoption;
	double num1;
	double num2;
	
	System.out.println(" Welcome to the PrinterScanner Calculator");
	System.out.println("=".repeat(40));
	System.out.println("Please select the number you would like to use:");
	System.out.println("=".repeat(40));
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Division");
	System.out.println("4. Multiplication");
	System.out.println("=".repeat(40));
	
	menuflow = true;
	
	
	
	
while(menuflow);
int choice = scan.nextInt();

System.out.println("Please enter your first number:");
double num11 = scan.nextInt();
System.out.println("Thank you for your first number! Please enter your second number:");
double num21 = scan.nextInt();

switch (choice) {

case1: {
	System.out.println(CalcFunc.Adds(num11, num21));
	}
}

	

	
	
	
	
	

	}

}
