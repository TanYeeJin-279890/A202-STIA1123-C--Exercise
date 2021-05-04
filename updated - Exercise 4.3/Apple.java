import java.util.Scanner;

public class Apple extends Fruit {
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
		
	public void getprice() {
		System.out.print("Enter quantity of "+ name +" apple : ");
		this.quantity = scan.nextInt();
		
		if(this.quantity <= 20) {
			calctotal();
			System.out.println("Total price of " + quantity +" "+ name + " : RM" + calctotal());
		}
		else if(this.quantity > 20 && this.quantity <=100) {
			double pr = 1.00;
			calctotal(pr);
			System.out.println("If quantity more than 20.Total price of " + quantity +" "+ name + " : RM" + calctotal(pr));
		}
		
		else{
			double pr = 0.80;
			int qq = this.quantity;
			calctotal(pr,qq);
			System.out.println("If quantity more than 100.Total price of " + qq +" "+ name + " : RM" + calctotal(pr,qq));
		}
		
		calcCalories(this.quantity, kcal);
	}

	
	public void calcCalories(int q,double kcal) {//overriding method-dif classes
		double total = this.quantity*kcal;
		System.out.println("Total calories of "+ this.quantity + " apples :" + total + "kcal.");
	}
	
	public double calctotal() {//overloading method
		return this.price*this.quantity;
	}
	
	public double calctotal(double pr) {//overloading method
		return pr*this.quantity;
	}
	
	public double calctotal(double pr,int qq) {//overloading method
		return pr*qq;
	}   
	
	public String colour(){
		return colour;
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name      :" + super.name +
			   "\n" + "Colour \t\t:" + colour();
		
	}
}
