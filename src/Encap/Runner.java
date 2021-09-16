package Encap;

public class Runner {
	
	public static void main(String[] args) {
		
	

	//4) Use setters to set values in your Runner.java.
	Encapsulation A = new Encapsulation();
	
	A.setStr("Me");
	A.setNum(25);
	A.setDec(3.2);
	A.setFlo(2.5f);
	A.setNu(261686);
	
//	5) Use getters and System.out.println(); to print out 
//	the values in your Runner.java.
	
	System.out.println("name" + A.getStr());
	System.out.println("number" + A.getNum());
	System.out.println("Decimal" + A.getDec());
	System.out.println("Float" + A.getFlo());
	System.out.println("Long number" + A.getNu());
	
	}
	
}
