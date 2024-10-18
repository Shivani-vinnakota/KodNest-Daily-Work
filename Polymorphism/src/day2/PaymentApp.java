package day2;
//this is not polymorphism
public class PaymentApp {
public static void main(String[] args) {
	UPI upi = new UPI();
	upi.checkBalance();
	upi.sendNotification();
	upi.applyCode();
	upi.pay();
	System.out.println("==================");
	Card card = new Card();
	card.checkBalance();
	card.sendNotification();
	card.applyCode();
	card.pay();
	
	System.out.println("==================");
	Wallet wallet = new Wallet();
	wallet.checkBalance();
	wallet.sendNotification();
	wallet.applyCode();
	wallet.pay();
}
}
