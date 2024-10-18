package day2;
//loose coupling:parent type reference will refer to child object
//is called loose coupling
//this is polymorphism step1
//after this we have to make flexible and compact it is in day3
public class PaymentApp2 {
	public static void main(String[] args) {
		Payment ref ;
		ref = new UPI();
		
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println("==================");
		ref= new Card();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println("==================");
		 ref = new Wallet();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
	}
}
