
public class Main {

	public static void main(String[] args) {
		Cat MyCat = new Cat(); // create first new object MyCat
		
		System.out.println("*******MYCAT*******");
		MyCat.printIdentityScanner();
		MyCat.calcfoodweight();
		MyCat.checkShots("Cola");
		MyCat.Strength(35.00);
		
		System.out.println();
		
		Cat AbuCat = new Cat(); // create second new object MyCat
	    System.out.println("*******ABUCAT*******");
	    AbuCat.printIdentityScanner();
	    AbuCat.calcfoodweight();
	    AbuCat.checkShots("Lina");
		AbuCat.Strength(34.47);
		

	}

}
