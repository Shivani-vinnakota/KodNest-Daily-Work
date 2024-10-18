package com.kodnest.daemon;

public class CompilingCode extends Thread{

	@Override
	public void run() {
		for(;;) {//Infinite loop
			System.out.println("Compile Code");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
