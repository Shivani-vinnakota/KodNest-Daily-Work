package com.kodnest.daemon;

public class DaemonDemo {
	public static void main(String[] args) {
		//Instantiate Thread Objects
		TypingCode t1 = new TypingCode();
		SavingCode t2 = new SavingCode();
		CompilingCode t3 = new CompilingCode();
		
		//set thread as Daemon Thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		//start all Threads
		t1.start();
		t2.start();
		t3.start();
	}

}
