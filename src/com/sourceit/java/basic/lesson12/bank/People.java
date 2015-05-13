package com.sourceit.java.basic.lesson12.bank;

public class People {
	private String name;
	private long money;
	
	public People(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void printBalance(){
		System.out.println(name + " has " + money + " money.");
	}

	public void addMoney(long amount) {
		this.money += amount;
	}

	public long withdraw(long amount) {
		if(money >= amount){
			money -= amount;
			
			return amount;
		}

		return 0;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
