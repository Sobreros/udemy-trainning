package Basics;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(fac(8));

	}
	
	static int fac(int n) {
		if (n == 0 || n ==1) {
			return 1;
		}
		else {
			
			return (n*fac(n-1));
	
		}
	}	

}
