
public class Cat {
	//need to declare variable first in class
     String name , colour , sex , HasShots;
     double weight , speed , height , Biteforce;
     int age;
     
    
     
     void printCatIdentity(String n , String s , double w , int a ){
    	 System.out.println();
    	 System.out.println("Cat name > " + n );
    	 System.out.println("Sex > " + s );
    	 System.out.println("Cat age > " + a + " years old");
    	 System.out.println("Cat weight > " + a + "kg");
    	 
     }
   
     
     void printCharacteristic(String h , String c ) {
    	 System.out.println("\nCharacteristic : ");
    	 System.out.println("Cat colour > " + c );
    	 System.out.println("Cat HasShots > " + h );
    	 
     }
     
     void printStrength(double B, double s, double h) {
    	 System.out.println("\nStrength : ");
    	 System.out.println("Cat height in one jump > " + h + " metres");
    	 System.out.println("Cat speed while running > " + s + " km/hr"); 
    	 System.out.println("Bite force > " + B + " N/cm^2"); 
     }
     
     void calcfoodweight(double w) {
    	 System.out.println("\nTotal food consumed per day > " + w*40 + "g");
     }
     
     
    	
}