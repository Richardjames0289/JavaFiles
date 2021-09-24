public class Person {

//	PERSON TASK:

//		4) Create 2 methods that use these variable (e.g. 
//				greet - similar to the one I showed you). 
//They SHOULD NOT be static.
//		5) Create 4 instances of the Person class in your 
//runner and call the methods.
//		6) Upload your code to GitHub.

//	1)Create a Person class with a few variables (height,
//	name, shoe size, job title, age).
	int height;
	String name;
	double shoe;
	String job;
	int age;

//	2) Generate a constructor with all of them.
	public Person(int height, String name, double shoe, String job, int age) {
		super();
		this.height = height;
		this.name = name;
		this.shoe = shoe;
		this.job = job;
		this.age = age;
	}

//	3) Create another constructor that only has name and
//height.
	public Person(String name, int height) {
		this.name = name;
		this.height = height;

	}

	
//	4) Create 2 methods that use these variable (e.g. 
//	greet - similar to the one I showed you). 
//They SHOULD NOT be static.

	public void greet() {
		System.out.println("Welcome " + name);
	}
	public void greet2() {
		System.out.println("Objects are instances of the class!");
	}

}
