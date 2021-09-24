//	A person takes 3 exams in college, Physics, Chemistry, and Biology, each 
//	exam has a maximum of 150 marks. When all the exam marks have been added together, 
//	we can find the overall percentage that the person has got by multiplying their score 
//	by 100 and then dividing by 450.
//
//	Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, 
//	total and percentage. This class should also have 2 methods:
//
//	Method 1 - displays the results that the person got for each exam and then the total mark. 
//	Try to make the output neat and bespoke for each exam.
//	Method 2 - which finds and displays the percentage that the person received for the exams overall.

public class Results {
	
	public static void main(String[] args) {
		marks();
		
		

	}

	public static void marks() {
		int  phy = 120;
		int chem = 100;
		int bio = 139;
		int tot = (phy + chem + bio);
		System.out.println("Physics= " + phy + "\nChemistry= " + chem + "\nBiology= " + bio
				+ "\nYour total mark is: " + tot);
		score(tot);
	}
	public static void score(int tot) {
				int perc = (tot*100)/450;
		System.out.println("Your total percentage is:" + perc + "%");
	}
}
