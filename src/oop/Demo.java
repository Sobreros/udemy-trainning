package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " is walking");
	}
	
	void eat () {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
		
		//instatiating an object
		Person person1 = new Person();
		
		// define some properties
		person1.name = "Giannis";
		person1.email = "jdhf@gmail.com";
		person1.phone = "08879827";
		
		//abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		
		/*
		
		String name = "Giannis";
		String email =  "dddks@gmail.com";
		String phone = "677898668";
		walking (name);
	//	System.out.println(name + " is walking");

		String name2 = "Giorgos";
		String email2 =  "ooooo@gmail.com";
		String phone2 = "7898668";
		
		walking (name2);
	//	System.out.println(name2 + " is walking");

	}
	
	static void walking (String name) {
		System.out.println(name + " is walking");
	*/
		
	}

}
