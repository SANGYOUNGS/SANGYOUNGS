package com.classex;


public class Account {

	private String name; // 계좌 소유주명
	private long balance; // 현재 잔액
	
	public Account(String name) {
		this.name = name;
	}
	public String getName( ) {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	//입급
	public void deposit(long amount) {
		balance += amount;
	}
	//출금
	public void withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
		}
		else
			balance -= amount;
	}
}
