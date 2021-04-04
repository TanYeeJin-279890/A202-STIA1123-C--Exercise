
public class Main {

	public static void main(String[] args) {
		Cat MyCat = new Cat(); // create first new object MyCat
		
		MyCat.printCatIdentity("Cola","Male",2.50 , 1);
		MyCat.printSpecies("Felis Catus", "Tabby");
		MyCat.printCharacteristic("Has Shots" ,  "Orange" , 100.0);
		MyCat.printStrength(2.4 , 47.0 , 48.26);
	
		
		
		Cat AbuCat = new Cat(); // create second new object MyCat
		AbuCat.printCatIdentity("Lina","Female", 3.00 , 2);
		AbuCat.printSpecies("Felis Catus", "British Shorthair");
		AbuCat.printCharacteristic("No Shots" , "Chocolate" , 120.0);
		AbuCat.printStrength(2.0 , 44.0 , 34.47);

	}

}
