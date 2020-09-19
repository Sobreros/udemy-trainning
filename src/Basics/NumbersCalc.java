package Basics;

public class NumbersCalc {
	public static void main(String[] args) {
		printName();
		int A= 10;
		int B = 20;
		addNumbers(A, B);
		System.out.println(multipleNumbers(A,B));
	
	}
	
	static void printName() {
		System.out.println("My name is Giannis");
	}
	
	static void addNumbers(int An, int Bn) {
		int sum = An +Bn;
		System.out.println("Numbers =" + sum);

	}
	static int multipleNumbers(int Aa, int Bb) {
		int product = Aa * Bb;
		addNumbers(product,product);
		return product;
		
	}
} 
