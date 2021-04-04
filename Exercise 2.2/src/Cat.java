
public class Cat {
	//need to declare variable first in class
     String name , colour , sex , HasShots , species , type;
     double weight , speed , height , Biteforce , foodweight;
     int age ;
     
    
     
     void printCatIdentity(String n , String s , double w , int a ){
    	 System.out.println();
    	 System.out.println("Cat name > " + n );
    	 System.out.println("Sex > " + s );
    	 System.out.println("Cat weight > " + w + "kg");
    	 System.out.println("Cat age > " + a + " years old");
    	
     }
     void printSpecies(String s , String t ) {
    	 System.out.println("\nScientific name > " + s );
    	 System.out.println("Cat types > " + t );
     }
     
     void printCharacteristic(String h , String c , double f) {
    	 System.out.println("\nCharacteristic : ");
    	 System.out.println("Cat colour > " + c );
    	 System.out.println("Cat HasShots > " + h );
    	 System.out.println("Cat can eat (40g/bodymass) > " + f + " grams of food");
     }
     
     void printStrength(double B, double s, double h) {
    	 System.out.println("\nStrength : ");
    	 System.out.println("Cat height in one jump > " + h + " metres");
    	 System.out.println("Cat speed while running > " + s + " km/hr"); 
    	 System.out.println("Bite force > " + B + " N/cm^2"); 
     }
     
     
    	
}