import java.util.Scanner;

public class Mango extends Apple {
	Scanner scan = new Scanner(System.in);
	private int choice;
	private String comment;
	private double kcal = 60.0;
	
	public Mango(String name,int q,double price) {//subclass
		super(name, q, price);
		System.out.println("Mango constructor is invoked");
		calcCalories(q,kcal);
		colour();
		//calctotal(q,price);
		}
	
	public String colour(){
		do {
		System.out.print("\nEnter colour choice (1-yellow,0-green):");
		this.choice = scan.nextInt();
		
		if(choice == 1) {
			return this.comment = "Mango is ripe.";
			}
		else if(choice == 0) {
			return this.comment = "Mango is underripe.";
			}
		else {
			return this.comment = "Invalid input.";
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


//	public void calctotal(int q, double price) {
//		double total = q*price;
//		System.out.printf("Total amount of "+ q + " mango : RM %.2f" , total);
//
//	}

}
