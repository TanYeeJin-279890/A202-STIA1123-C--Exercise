import java.util.Scanner;

public class Apple extends Fruit{
	Scanner scan = new Scanner(System.in);
	private String colour;
	protected double kcal = 54.0;
	protected double price;
	protected int quantity;
	
	public Apple(String name,int q,double p) {//subclass,constructor with 3 arguments
		super(name);
		this.quantity = q;
		this.price = p;
	
		if(this.quantity <= 20) {
			calctotal();//overloading with no arguments as nothing change
			System.out.printf("\nTotal price  : RM%.2f" , calctotal());
		}
		else if(this.quantity > 20 && this.quantity <=100) {
			double pr = 1.00;
			calctotal(pr);//overloading with 1 arguments as price=1.00 if quantity > 20
			System.out.printf("\nIf quantity more than 20.Total price  : RM%.2f" , calctotal(pr));
		}
		
		else{//have discount if more than 100 , price will have changes
			double pr = 0;
			double discount=0;
			
			if(name == "Pink Lady"|| name == "Apple") {
				pr = 0.80;
				getdiscount d = new AppleDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				System.out.println("Purchase more than 100 "+name+" apples. Discount provided : "+ (d.rateofdiscount()*100)+ " %.\n");
				discount = d.rateofdiscount();
				System.out.println(name);
				calcCalories(this.quantity, kcal);
			}
			else if (name == "Grape") {
				pr = 6.00;
				getdiscount d = new GrapeDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				System.out.println("Purchase more than 100 "+name+" . Discount provided : "+ (d.rateofdiscount()*100)+ " %.\n");
				discount = d.rateofdiscount();
				System.out.println(name);
				
			}
			else if (name == "Mango") {
				pr = 3.50;
				getdiscount d = new MangoDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				System.out.println("Purchase more than 100 "+name+" . Discount provided : "+ (d.rateofdiscount()*100)+ " %.\n");
				discount = d.rateofdiscount();
				System.out.println(name);
				
			}
			else if (name == "Granny Smith") {
				pr = 0.50;
				getdiscount d = new AppleDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				System.out.println("Purchase more than 100 "+name+" apples. Discount provided : "+ (d.rateofdiscount()*100)+ " %.\n");
				discount = d.rateofdiscount();
				System.out.println(name);
				calcCalories(this.quantity, kcal);
			}
			
			calctotal(discount, pr); //overloading with 2 arguments
			System.out.printf("If quantity MORE than 100, Total price: RM %.2f" , calctotal(discount, pr));
			System.out.println();
			
		}
		System.out.println();
		
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
	
	public double calctotal(double discount,double pr) {//overloading method
		return (pr*this.quantity) *(1-discount);
	}  
	
	
	public String colour(){
		return colour = "Red,Green";
	}
	
	public String toString() { //overriding method-dif classes
		return "\nFruit name      :" + super.name +
			   "\n" + "Colour \t\t:" + colour();
		
	}
}
