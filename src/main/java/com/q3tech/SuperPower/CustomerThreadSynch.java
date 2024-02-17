package com.q3tech.SuperPower;

class Bus implements Runnable {
	
	int available=3, passenger;
	
	Bus(int passenger) {
		this.passenger = passenger;
	}
	
	public synchronized void run()
	{
		String name = Thread.currentThread().getName();
		
		if(available>=passenger) {
			
			System.out.println(name + "reserved seat");
			
			available = available-passenger;
		} 
		
		else {
			System.out.println("my apology, seat not available");
		}
	}
}

 class CustomerThreadSynch {
	 public static void main(String[] args) { 

	Bus r = new Bus(2);
	
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	Thread t3 = new Thread(r);
	
	t1.setName("James   ");
	t2.setName("Robert  ");
	t3.setName("Richard ");
	
	t1.start();
	t2.start();
	t3.start();
	
	 }

	

	
}
