package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		//object creation
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "96757675";
		acc1.setname = ("Juan");
		System.out.println(acc1.getName());
		
		BankAccount acc2 = new BankAccount("Checking account type");
		acc2.accountNumber = "3453212";
		
		BankAccount acc3 = new BankAccount("Checking account type", 5000);
		acc3.accountNumber = "0453234";
		acc3.checkbalance();

		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		// cd1.name = "Juan";
		cd1.interestRate = "4,5";
		cd1.accountType = ("CD account");
		System.out.println(cd1.toString());
		cd1.compount();

	}

}
