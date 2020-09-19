package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		//declare variable
		String career;
		System.out.println("Program is starting");
		
		//define variable
		career= "Software Developer";
		System.out.println("my career is: "+ career);
		
		//declare and define
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.5;
		
		career = "Web Developer";
		
		//compute annual salary
		double salary = hoursperweek * weeksperyear * rate;
		System.out.println ("my salary as a " + career + " is " + salary);
	}

}
