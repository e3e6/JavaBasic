package com.sourceit.java.basic.lesson12.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String title;
	private long money = 1000000000000l;
	private List<Account> accounts = new ArrayList<Account>();
	
	/**
	 * Constructor of Bank
	 * @param title
	 */
	public Bank(String title){
		this.title = title;
	}

	
	
	
	public void createAccount(People client) {
		accounts.add(new Account(client));
	}

	/**
	 * Ask for a loan
	 * @param client
	 * @param amount
	 * @return the amount of borrowed money
	 */
	public long takeLoan(People client, int amount) {
		Account a = findClientsAccount(client);
		
		if(a != null){
			if (money < amount){
				System.out.println("Sorry, " + client + " we do not have any money for you.");		
			} else {
					a.loans += amount;
					money -= amount;
					
					return amount;
			}
		}
		
		return 0;
	}
	
	/**
	 * Put money to client's account
	 * @param client
	 * @param money
	 */
	public void put(People client, long money) {
		Account a = findClientsAccount(client);
		
		if(a != null){
			a.money += money;
		}
		
	}
	
	/**
	 * Transfer money between two accounts
	 * @param client1 from
	 * @param client2 to
	 * @param money
	 */
	public void transferMoney(People client1, People client2, long money) {
		Account acc1 = findClientsAccount(client1);
		Account acc2 = findClientsAccount(client2);
		
		if(acc1 != null && acc2 != null){
			if(acc1.money >= money){
				acc1.money -= money;
				acc2.money += money;
				
				System.out.println(">> Transferred [" + money + "] from [" + client1 + "] to [" + client2 + "]");
			}
		}
		
	}
	
	private Account findClientsAccount(People client){
		for(Account a: accounts){
			if(a.client == client) return a;
		}
		
		System.out.println("Sorry, " + client + " we can't work with you. Please create an account first.");
		return null;
	}
	
	


	public long withdraw(People client, long money) {
		Account acc = findClientsAccount(client);
		
		if(acc != null && acc.money >= money){
			acc.money -= money;
			
			return money;
		}
		
		return 0;
	}


	public void printBalance() {
		System.out.println("The \"" + this.title + "\" report:");
		
		for(Account acc: accounts){
			System.out.println("\t- Our client [" + acc.client + "] has [" + acc.money + "] and own us [" + acc.loans + "]");
		}
	}
	
	private class Account {
		private People client;
		
		private long money;
		private long loans;
		
		public Account(People client){
			this.client = client;
		}
	}
}
