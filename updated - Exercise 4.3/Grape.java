import java.util.Scanner;

public class Grape extends Fruit {
	Scanner scan = new Scanner(System.in);
    private String comment;
	private int option;
	private double kcal = 62.0;
	public Grape(String name,int q) {//subclass
		super(name);
		seed();
		calcCalories(q,kcal);
		
	}
	
	public void seed() {
		do {
			System.out.print("Enter option (1-seedless,0-seeded):");
			this.option = scan.nextInt();
			
			if(option==1) {
				this.comment = "More easier and enjoyable while eating.";break;
				}
			else if(option==0) {
				this.comment = "Annoyed by spitting out the seed.Can choose to eat seed or split out.";break;
				}
			else { 
				System.out.println("Invalid input.");
			}
			
			}while(option != 1||option != 0);
		}

	
	public String getcomment() {
		return this.comment;
	}
	
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = q*kcal;
		System.out.println("Total calories of "+ q + " grapes :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name        :" + super.name +
			   "\n" + "Colour            :Colour mostly in purple,red and green. " +
			   "\nComment           :" + this.comment;
		
	}
}
