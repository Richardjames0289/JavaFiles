




//5) Use getters and System.out.println(); to print out the values in your Runner.java.
//6) Generate toString in your Encapsulation.java and invoke it from Runner.java.

//Please create a new package for this exercise.
package Encap;

public class Encapsulation {
	//1) Create a new class call Encapsulation with 5 variables (one String, one integer, one double, one float and one long).
	private String str;
	private int num;
	private double dec;
	private float flo;
	private long nu;
	
//2) Encapsulate your variables (make them private and generate getters and setters).	
	
	public Encapsulation(String str, int num, double dec, float flo, long nu) {
		super();
		this.str = str;
		this.num = num;
		this.dec = dec;
		this.flo = flo;
		this.nu = nu;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

	public float getFlo() {
		return flo;
	}

	public void setFlo(float flo) {
		this.flo = flo;
	}

	public long getNu() {
		return nu;
	}

	public void setNu(long nu) {
		this.nu = nu;
	}
	//3) Generate two constructors - one should be empty.

	public Encapsulation() {
		super();
	}
	
	
	


	
	
	
	
}
