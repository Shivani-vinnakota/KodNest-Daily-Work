package day2;

public class BirdApp {
public static void main(String[] args) {
	Sky sky = new Sky();
	sky.permitBirds(new GoldenEagle());
	sky.permitBirds(new SerpantEagle());
	sky.permitBirds(new MountainEagle());
	
	System.out.println("-----------------------");
	
	sky.permitBirds(new VegSparrow());
	sky.permitBirds(new NonvegSparrow());
}
}
