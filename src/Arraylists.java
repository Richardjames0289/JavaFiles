import java.util.ArrayList;
import java.util.List;

public class Arraylists {
	
//	create a new ArrayList
	public static void main(String[] args) {
		List <String> names = new ArrayList<>();

//		add() several elements
		
		names.add("Richard");
		names.add("Rhys");
		names.add("Hiro");
		names.add("Emma");
		
//		print out the entire ArrayList
		
		System.out.println(names);
		
//		iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
		for(String name : names) {
			System.out.println(name);
		}
		for(int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
//		get() specific elements
//		set() different elements
//		remove() elements
		
		
	}
}
