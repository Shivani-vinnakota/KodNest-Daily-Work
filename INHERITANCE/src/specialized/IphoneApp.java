package specialized;

public class IphoneApp {
public static void main(String[] args) {
	Iphone ip = new Iphone();
	ip.os();
	ip.design();
	System.out.println("+++++++++++++");
	Iphone4 i4 = new Iphone4();
	i4.design();
	i4.playsong();
	System.out.println("+++++++++++++");
	Iphone6 i6 = new Iphone6();	
	i6.design();
	i6.unlockingFingerPrint();
	System.out.println("+++++++++++++");
	Iphone14 i14= new Iphone14();	
	i14.design();
	i14.unlockingFaceRecognisation();;
	
}
}
