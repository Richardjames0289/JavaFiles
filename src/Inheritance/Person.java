package Inheritance;
//    - Every person should have some generic attributes (e.g. name, age) and functionality (e.g. eat, sleep).
//    - The Banker and Farmer subclasses should also have attributes and functionality unique to them.
//    - The two subclasses should have their own custom constructors to set any relevant values.
//    - The two subclasses should also override a method from the Person class and implement it differently.
//    - All three classes should override the toString() method in order to print some useful information about the class.
//    - The Subclass toString() methods should include the same information as Person, but with their own unqiue info on top.
//    - Use encapsulation - private class variables with getters & setters.
//    - Use a separate runner class with a main method.
eat
public class Person {
	
	public static void main(String[] args) {
		
	}
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("I like to eat");
	}
	 public void sleep() {
		 System.out.println("I like to sleep");
	 }
	

	
	
	
}
