public class Runner {
	
	
	public static void main(String[] args) {
		Person richard = new Person("Richard", 180);
		Person emma = new Person("Emma", 180);
		Person rhys = new Person("Rhys", 180);
		Person hiru = new Person("Hiru", 180);
		
		Conditionals.Div();
		Iterations.count();
//		5) Create 4 instances of the Person class in your 
//runner and call the methods.
		
		emma.greet();
		rhys.greet2();
		hiru.greet();
		richard.greet2();
	}
}
