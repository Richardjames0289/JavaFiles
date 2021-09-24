package hashmaps;

import java.util.HashMap;

public class Hashmaps {
	
	public static void main(String[] args) {

	 HashMap<String, String> alphAndMorse = new HashMap<>();
	 
	 public String output = "";

		alphAndMorse.put(".-","a");
		alphAndMorse.put("-..", "b");
		alphAndMorse.put("-.-.","c");
		alphAndMorse.put("-..","d");
		alphAndMorse.put(".","e");
		alphAndMorse.put("..-.","f");
		alphAndMorse.put("--.","g");
		alphAndMorse.put("....", "h");
		alphAndMorse.put("..","i");
		alphAndMorse.put(".---","j");
		alphAndMorse.put("-.-","k");
		alphAndMorse.put(".-..","l");
		alphAndMorse.put("--", "m");
		alphAndMorse.put("-.","n");
		alphAndMorse.put("---","o");
		alphAndMorse.put(".--.","p");
		alphAndMorse.put("--.-", "q");
		alphAndMorse.put(".-.", "r");
		alphAndMorse.put("...", "s");
		alphAndMorse.put("-","t");
		alphAndMorse.put("..-","u");
		alphAndMorse.put("...-","v");
		alphAndMorse.put(".--","w");
		alphAndMorse.put("-..-","x");
		alphAndMorse.put("-.--","y");
		alphAndMorse.put("--..","z");
		
	
	

//	System.out.println(alphAndMorse.get(""));
//	System.out.println(gap(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
//	}
//
//	
//	public static String gap(String gaps) {
//		if(gaps.contains(" ")) {
//			int number = gaps.indexOf(" ");
//			gaps = gaps + gaps.substring(number + 1, gaps.length());
//			
//			
//				
//			
//		}
//		return gaps;
//	
//	(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	public String translate(String input) {
		String inputArray[]=input.split(" ");
		
		for (String i : inputArray) {
			output += this.morse.get(i);
		}
	}
	
		
	
	
//	String answer = new String(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");
//	String str = new String();
//	
//	for(char i = 0; i < answer.length() ; i++) {
//		if i = alphAndMorse.keyset()
//		
//		System.out.println(i);
//		
//	}
//	
	
}
	

}


