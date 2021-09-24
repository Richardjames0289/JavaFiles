//Exercise:
//    - Read through community module on Polymorphism
//    - Have a go at testing polymorphism on your classes from yesterday.
//    - E.g. Create 3 instances of Farmer, stored as Object, Person and Farmer.
//    - Experiment with method access and casting to access methods.
//    - Use any extra time to recap anything and upload work to github if not done already.

      
package Inheritance;

public class Farmer extends Person{
	
	private String job;
	private int tractor;
	
	public Farmer(String name, int age, String job, int tractor) {
		super(name, age);
		this.job = job;
		this.tractor = tractor;
	}
	
	public Farmer() {
		super();
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

@Override
public String toString() {
	return "Farmer [name=" + this.getName() +", age=" + this.getAge() + "job=" + job + ", tractor=" + tractor + "]";
}





}

