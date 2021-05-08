import java.util.Scanner;

public class Mango extends Fruit {
	Scanner scan = new Scanner(System.in);
	private int choice;
	private String comment;
	private double kcal = 60.0;
	
	public Mango(String name,int q) {//subclass
		super(name);
		System.out.println("Mango constructor is invoked");
		calcCalories(q,kcal);
		colour();
		}
	
	public void colour(){
		do {
		System.out.print("\nEnter colour choice (1-yellow,0-green):");
		this.choice = scan.nextInt();
		
		if(choice == 1) {
			this.comment = "Mango is ripe.";break;
			}
		else if(choice == 0) {
			this.comment = "Mango is underripe.";break;
			}
		else {
			System.out.println("Invalid input.");
		}
		
		}while(choice != 1||choice != 0);
	}
	
	public String getcomment() {
		return this.comment;
	}
	
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = q*kcal;
		System.out.println("Total calories of "+ q + " mango :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "\nFruit name        :" + super.name +
			   "\n" + "Comment           :" + getcomment();
		
	}

	@Override
	public double calctotal() {
		return 0;
	}

	@Override
	public double calctotal(double pr) {
		return 0;
	}

	@Override
	public double calctotal(double pr, int qq) {
		return 0;
	}
}
