public class stringManipulation {
//	Create two Strings where one string has a value of “yesterday it was raining” and the other string with a 
//	value of “today it is sunny”
//
//	Concatenate both values, capitalise both strings and print out the result.
//	The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
	public static void main(String[] args) {
//		String string1 = "yesterday it was raining";
//		String string2 = "today it is sunny";
//		String string3 = string1 + " "+ string2;
//		
//		System.out.println(string3.toUpperCase());
//		Now use the substring method to print out: `TODAY IT IS RAINING`
//		System.out.println(string2.substring(0,12) + string1.substring(17,24));
		
	
//		For this task you are to implement 4 methods that manipulate String objects. For all parts of this 
//		section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or 
//		any methods you have yet to be taught as this defeats the purpose of the exercise:

//			Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a 
//			different line.
//			Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to 
//			find in the message. A boolean value should be returned to indicate whether or not the second String has been 
//			found in the message.
	
//		Method 1 - When given a String, count and return how many words there are in that String.
		
//		String string1 = "yesterday it was raining";
//		int space = 0;
//        for (int i = 0; i < string1.length(); i++) {
//            if (string1.substring(i, i + 1).contentEquals(" ") || i == (string1.length() - 1)) {
//                space++;
//                
//                System.out.println(space);
//            }
//        }
//	
		
//		Method 1 - When given a String, count and return how many words there are in that String.
//		String string1 = "yesterday it was raining";
//		for (int i = 0; i < string1.length() ; i++) {
//			int count = 0;
//				if i = (" ");
//				count = i;
//		}
					
				
//		Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
		
//		need a seperate count to rememebr what the values are between i and then print them out!
		String string1 = "Tomorrow it will rain";
		
		int space = 0;
      for (int i = 0; i < string1.length(); i++) {
          if (string1.substring(i, i + 1).contentEquals(" ") || i == (string1.length() - 1)) {
              space++;
              
              System.out.println(string1.substring(i, i+4));
          }
      }
		
		
	}
}

	
	
