
public class HelloWorld {

	public static void main(String[] args) {
//output hello world to console
		
		System.out.println("Hello World");
		
// out helloworld as a string to the console
		
		String message = "Hello World";
		System.out.println(message);

		hi("Output three");
		System.out.println(usingReturn("Output four"));
	}
// Do the same with a method
	
	public static void hi(String input) {
		System.out.println(input);
	}
	
	public static String usingReturn(String str) {
		return str;
	}
	
}
