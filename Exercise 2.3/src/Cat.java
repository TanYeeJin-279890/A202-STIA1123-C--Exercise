import java.io.PrintStream;
import java.util.Scanner;

public class Cat {
	//need to declare variable first in class
     String name , colour , sex , HasShots;
     double Biteforce;
     int age;
     char choice;
     
     Scanner s = new Scanner(System.in);
	
     void printIdentityScanner() {
    	 
    	 System.out.println("Enter Name, Colour, Sex and Age : ");
    	 String n = s.nextLine();
    	 String c = s.nextLine();
    	 String x = s.nextLine();
    	 int a = s.nextInt();
    	 
    	 System.out.println("Cat name > " + n );
    	 System.out.println("Colour > " + c );
    	 System.out.println("Sex > " + x );
    	 System.out.println("Cat age > " + a + " years old");
    	 
     }
     
     
     void calcfoodweight() {
    	 System.out.println("\nEnter cat's weight > ");
    	 double weight = s.nextDouble();
    	 double total = (weight*40*30)/1000;
    	 double price = total*7;
    	
    	 System.out.println("\nTotal cat food (brand = SMARTHEARD) consumed per day > " + total + "kg");
		 System.out.printf("\nTotal price spend on food per month > RM %.2f " ,price);
    	
     }
   
     
     void checkShots(String name) {
    	 do {
    	 System.out.println("\nDoes the cat has Shots? (y-has,n-no)");
    	 choice = s.next().charAt(0);
    	 switch(choice){
    	 case'y':System.out.println(name + " has shots.");break;
    	 case'n':System.out.println("\n" + name + " has no shots.");break;
    	 default : System.out.print("Error. Wrong choice!(Input only 'y' or 'n'.)");
    	 }
    	 
    	 }while (choice != 'y' && choice != 'n');
      }
     
     void Strength(double B) {
    	 System.out.println("\nStrength : ");
    	 
    	 System.out.println("-----To Calculate How High can a Cat Jump-----  ");
    	 System.out.println("Enter time taken to reach the highest point in one jump (s) >");
    	 double second = s.nextDouble();
    	 double g = 9.8;
    	 double v = g*second;
    	 double calc = (g*(Math.pow(second,2)));
    	 double h = ((v*second) - (0.5*calc));
    	 System.out.printf("\nCat height in one jump (m) > %.4f%n" , h );
    	 
    	 System.out.println("-----To Calculate Speed of a Cat run-----  ");
    	 System.out.println("Enter distance(m) >");
    	 double d = s.nextDouble();
    	 System.out.println("Enter time taken to reach (s) >");
    	 double t = s.nextDouble();
    	 double s = d/t;
    	 System.out.printf("Cat speed while running(m/s) > %.2f%n" , s ); 
    	 System.out.println("Bite force > " + B + " N/cm^2"); 
     }
     
     
     
     
    	
}