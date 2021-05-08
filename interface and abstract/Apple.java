import java.util.Scanner;

public class Apple extends Fruit implements getdiscount {
	Scanner scan = new Scanner(System.in);
	private String colour;
	protected double kcal = 54.0;
	protected double price;
	protected int quantity;
	
	public Apple(String name,String colour,double p) {//subclass
		super(name);
		this.colour = colour;
		this.price = p;
		
	}
	
	public double discount() {
	      return 0.15; //15%	
	}
	
		
	public void getprice() {
		System.out.print("Enter quantity of "+ name +" apple : ");
		this.quantity = scan.nextInt();
		
		if(this.quantity <= 20) {
			calctotal();
			System.out.printf("\nTotal price  : RM%.2f" , calctotal());
		}
		else if(this.quantity > 20 && this.quantity <=100) {
			double pr = 1.00;
			calctotal(pr);
			System.out.printf("\nIf quantity more than 20.Total price  : RM%.2f" , calctotal(pr));
		}
		
		else{
			double pr = 0.80;
			int qq = this.quantity;
			calctotal(pr,qq);
			System.out.printf("\nIf quantity more than 100.Total price  : RM%.2f" , calctotal(pr,qq));
		}
		System.out.println();
		calcCalories(this.quantity, kcal);
	}

	
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = this.quantity*kcal;
		System.out.println("Total calories of "+ this.quantity + " apples :" + total + "kcal.");
	}
	
	public double calctotal() {//overloading method
		return this.price*this.quantity*(1-discount());
	}
	
	public double calctotal(double pr) {//overloading method
		return pr*this.quantity*(1-discount());
	}
	
	public double calctotal(double pr,int qq) {//overloading method
		return pr*qq*(1-discount());
	}  
	
	
	public String colour(){
		return colour;
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name      :" + super.name +
			   "\n" + "Colour \t\t:" + colour();
		
	}
}
