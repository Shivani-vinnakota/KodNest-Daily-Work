package day3_2ndway;

public class Chatting extends Thread{
   public void run()
   {
	   try {
		   System.out.println("Chatting Started");
		   Thread.sleep(2000);
		   System.out.println("chit chat chit chat");
		   Thread.sleep(2000);
		   System.out.println("chatting Ended");
		   Thread.sleep(2000);
		   
	   }
	   catch(InterruptedException e) {
			e.printStackTrace();
		}
   }
}
