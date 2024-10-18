package day3_2ndway;

public class InstagramApp {
public static void main(String[] args) {
	Chatting chatting = new Chatting();
	Reels reels = new Reels();
	
	chatting.start();
	reels.start();
	try {
		chatting.join();
		reels.join();
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Instagram Application has been terminated");
}
}
