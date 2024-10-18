package day_3;

public class DiscountApp {
	 public static void checkDiscount(double purchaseAmount)  
	 { 
           if( purchaseAmount >100 ) {
        	   System.out.println("Discount applicable");
           }
           else {
        	   System.out.println("Discount not applicable");
           }
	  } 
	 
		public static void main(String[]args) 
		{
			checkDiscount(150.0); 
	}
}

