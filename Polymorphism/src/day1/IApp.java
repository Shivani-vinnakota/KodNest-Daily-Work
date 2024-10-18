package day1;

public class IApp {
public static void main(String[] args) {
	Iphone ip = new Iphone();
	ip.os();
	ip.design();
	System.out.println("====================");
	 Iphone4 i4 = new Iphone4();
	 i4.os();
	 i4.design();
	 i4.playSong();
	 System.out.println("====================");
	 Iphone6 i6 = new Iphone6();
	 i6.os();
	 i6.design();
	 i6.unlockUsingFingerprint();
	 System.out.println("====================");
	 Iphone14 i14 = new Iphone14();
	 i14.os();
	 i14.design();
	 i14.unlockUsingFaceRecognition();;
}
}
