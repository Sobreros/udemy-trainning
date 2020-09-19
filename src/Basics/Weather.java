package Basics;

public class Weather {
	public static void main(String[] args) {
		
		//sugge stions based to temperature
		
	int tem= 65;
	String suncondition = "sunny";
	
	if (tem>80) {
		System.out.println("Its pleasant. wear shorts");
		tem=30;
	}
	else if ((tem>60) && (suncondition == "sunny")) {
		tem = 30;
		System.out.println("Its a little cooler. wear a long sleeve. "
				+ "also a hat could be good");
	}
	else {
		System.out.println("Its cold outside");
	}
	System.out.println("the end");

	}
}
