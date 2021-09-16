package Inheritance;

public class Farmer extends Person{
	
	private String job;
	private int tractor;
	
	public Farmer(String name, int age, String job, int tractor) {
		super(name, age);
		this.job = job;
		this.tractor = tractor;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getTractor() {
		return tractor;
	}

	public void setTractor(int tractor) {
		this.tractor = tractor;
	}
	
 public void fmethod() {
	 System.out.println("I like pigs!");
 }
@Override
public void eat() {
	System.out.println("I only eat in the morning");
}





}

