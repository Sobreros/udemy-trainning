package Basics;

public class Cities {

	public static void main(String[] args) {
		//declare and define array
		String[] cities = {"Larissa", "Karditsa", "Trikala"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		//declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Yolo";
		states[2] = "Fornia";
		states[3] = "Cali";
		states[4] = "Cania";
		
		//the do loop
		int i=0;
		do {
			System.out.println(states[i]);
			i=i+1;
		} while (i<5);
		
		//while loop. if true stop
		int n = 0;
		boolean statefound = false;
		while (statefound) {
			String state = states[n];
			System.out.println(states);
			if (state == "Fornia") {
				System.out.println("State found");
				statefound = true;
			}
			n++;  
		}
		
		//the for loop
		for (int x=0; x<5; x++) {
			System.out.println(states[x]);
			

		}
		
		//declare array and then define the array
		String[] countries;
		countries = new String[3];
		countries[0]= "USA";
		countries[1]= "US";
		countries[2]= "U";
		System.out.println(countries[1]);

	}


}
