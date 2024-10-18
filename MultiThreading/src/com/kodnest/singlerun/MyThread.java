package com.kodnest.singlerun;

public class MyThread extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName()=='Numbers')
	}
	public void printnumbers() {
		System.out.println("===> Printing Numbers Started");
		for(int i = 1;i<=10;i++) {
			System.out.println("***"+i+" ");
		}
		System.out.println("===>Printing Numbers Completed");
	}
	
	public void printcharacters() {
		System.out.println("===> Printing Characters Started");
		for(int i = 1;i<=10;i++) {
			System.out.println("***"+i+" ");
		}
		System.out.println("===>Printing Characters Completed");
	}
}
