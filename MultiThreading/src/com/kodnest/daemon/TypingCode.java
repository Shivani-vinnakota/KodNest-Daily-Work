package com.kodnest.daemon;

public class TypingCode extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Typing Code");
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
