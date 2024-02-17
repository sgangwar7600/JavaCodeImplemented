package com.q3tech.SuperPower;

//we can not make a overridden a method static , solution is we will 
//call that static method into our run() method

class Bank extends Thread {
	
	static int bal = 5000;
	static int withdraw;
	
	Bank(int withdraw) 
	{
		this.withdraw=withdraw;
	}
	
	public static synchronized void Withdraw() {
		
		String name = Thread.currentThread().getName();
		
		if (withdraw<=bal) {
			
			System.out.println(name + "withdraw money");
			bal = bal - withdraw;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	public void run() {
		Withdraw();
	}
	
}

public class CustomerStaticSynchro {

	public static void main(String[] args) {
		
		Bank obj = new Bank(5000);  //obj has one lock
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		
		t1.setName("Adam  ");
		t2.setName("Jeremy  ");
		
		t1.start();
		t2.start();
		
		Bank obj1 = new Bank(5000); //obj has one lock
		
		Thread t3 = new Thread(obj1);
		Thread t4 = new Thread(obj1);
		
		t3.setName("Sami  ");
		t4.setName("Pascale  ");
		
		t3.start();
		t4.start();
		
		
	} 
}
