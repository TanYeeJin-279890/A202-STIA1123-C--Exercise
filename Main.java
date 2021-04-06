
public class Main {

	public static void main(String[] args) {
		Cat MyCat = new Cat(); // create first new object MyCat
		
		MyCat.printCatIdentity("Cola","Male" , 2.50 , 1);
		MyCat.printCharacteristic("Has Shots" ,  "Orange" );
		MyCat.printStrength(2.4 , 47.0 , 48.26);
		MyCat.calcfoodweight(2.50);
	
		
		
		Cat AbuCat = new Cat(); // create second new object MyCat
		AbuCat.printCatIdentity("Lina","Female" , 3.00 , 2);
		AbuCat.printCharacteristic("No Shots" , "Chocolate");
		AbuCat.printStrength(2.0 , 44.0 , 34.47);
		AbuCat.calcfoodweight(3.00);

	}

}
