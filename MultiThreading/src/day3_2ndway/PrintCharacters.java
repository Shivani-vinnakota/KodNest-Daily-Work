package day3_2ndway;

public class PrintCharacters implements Runnable{

	@Override
	public void run() {
		for(int i=65;i<=74;i++){
			System.out.println((char)(i));
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
