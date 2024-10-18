
public class PMApp {
public static void main(String[] args) {
	//PrimeMinister pm1=new PrimeMinister("Modi", 74,"Male");
	//PrimeMinister pm2=new PrimeMinister("Rahul" ,67, "Male");
	
	PrimeMinister pm1=PrimeMinister.getInstance();
	PrimeMinister pm2=PrimeMinister.getInstance();
	
	//PrimeMinister.pm=null;so that no one  can access directly 
	//so we making as pm is private ..so this one more step 4th step
	
	PrimeMinister pm3=PrimeMinister.getInstance();
	
	System.out.println(pm1);
	System.out.println(pm2);
	System.out.println(pm3);
	
}
}
