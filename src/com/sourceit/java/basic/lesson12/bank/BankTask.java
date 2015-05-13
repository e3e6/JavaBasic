package com.sourceit.java.basic.lesson12.bank;

public class BankTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bankOfAmerica = new Bank("BankOfAmerica");		
		People people1 = new People("Tom");
		People people2 = new People("Jerry");
		
		//Create Accounts
//		bankOfAmerica.createAccount(people1);
		bankOfAmerica.createAccount(people2);
		
		//Take a loan
		people1.addMoney(bankOfAmerica.takeLoan(people1, 1000));
		
		//Put money to account
		long m = people1.withdraw(500);		
		bankOfAmerica.put(people1, m);
		
		//Transfer
		bankOfAmerica.transferMoney(people1, people2, 500);
		
		//Take money from a Bank
		people2.addMoney(bankOfAmerica.withdraw(people2, 500));
		
		
		//Print totals
		print("----- TOTALS ----- ");
		people1.printBalance();
		people2.printBalance();
		bankOfAmerica.printBalance();
		//TODO
	}

	
	public static void print(String str){
		System.out.println(str);
	}
}
