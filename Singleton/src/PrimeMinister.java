
public class PrimeMinister {
	//step1 static , step4 private
	private static  PrimeMinister pm = null;
     String name;
     int age ;
     String gender;
     //step2 private constructor
     private PrimeMinister(String name,int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void attendMeetingWithChiefMinister() {
    	 System.out.println(name+" Prime minister is attending meetings with cheif ministers");
     }
     
     public void maintainGoodRealtionshipsWithOtherPrimeMinisters() {
    	 System.out.println(name+" Prime minister is maintaing good relations with prime ministers");
     }
     
     public void takecareOfCountryCitizens() {
    	 System.out.println(name+" Prime minister is taking care of citizens");
     }
     //step 3 public static method
     public static PrimeMinister getInstance() {
    	 if(pm == null) {
    		 pm = new PrimeMinister("Modi",74,"Male");
    	 }
    		 return pm;
     }
}
