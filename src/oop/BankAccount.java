package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	
	//static variable
	static final String routingNumber = "12345";
	
	//instance variables
	private String name;
	String ssn;
	String accountType;
	double balance = 0;

	public String setname;

	//constructors definitions
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT. " + accountType);

	}
	
	BankAccount(String accountType, double initDeposit) {
		//local variables accountType, initDeosit, Msg
		System.out.println("NEW ACCOUNT. " + accountType);
		System.out.println("initial deposit of  " + initDeposit);
		String Msg = "";
		if (initDeposit < 1000) {
			Msg = "Wrong deposit";
		//	System.out.println(Msg);

		} else {
			Msg = "Thanks for initial deposit";
		//	System.out.println(Msg);

		}
		System.out.println (Msg);
		balance = initDeposit;
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	//interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	
	
	// define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkbalance() {
		System.out.println("balance " + balance);
	}
	
	void getsStatus() {
		
	}
	//Overide the "toString"
	public String toString() {
		return "[" + name + "." + accountNumber + ". Balance: $" +balance +"]";
	}

}
