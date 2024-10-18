package com.kodnest.daemon;

public class SavingCode extends Thread{

	@Override
	public void run() {
		for(;;) {//Infinite loop
			System.out.println("Save Code");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) { 
				e.printStackTrace();
			}
			
		}
	}
}
