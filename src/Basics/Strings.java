package Basics;

public class Strings {

	public static void main(String[] args) {
		String booktitle;
		String wordchoice = "ring";
		
		booktitle = "the lord of the rings";
		
		if (booktitle.contains(wordchoice)) {
			System.out.println("The book contains the word ring");
		}
		
		String Firstname = "Giannis";
		String Lastname = "Chloptsios";
		String SSN = "97882773";
		
		System.out.print(Firstname.substring(0,1));
		System.out.print(Lastname.substring(0,1));
		System.out.print(SSN.substring(5));

	}

}