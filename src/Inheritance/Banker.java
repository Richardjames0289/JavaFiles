package Inheritance;

public class Banker extends Person{

	private String job;
	private int salary;
		
	public Banker(String name, int age, String job, int salary) {
		super(name, age);
		this.job = job;
		this.salary = salary;
	}

		
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
 public void bmethod() {
	 System.out.println("I love Money!");
 }
 @Override
 public void eat() {
	 System.out.println("I like to eat in the Evening");
 }

}
