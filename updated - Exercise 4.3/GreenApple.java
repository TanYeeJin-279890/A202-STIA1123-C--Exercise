import java.util.Scanner;

public class GreenApple extends Apple {
	Scanner scan = new Scanner(System.in);
	private String retailname, placeProduce,seasons;
	private double weight;
	public GreenApple(String name,String colour,double p,String n,String pp,String s,double weight) {
		super(name,colour,p);
		this.weight = weight;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
	
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
			double pr = 0.50;
			int qq = this.quantity;
			calctotal(pr,qq);
			System.out.println("If quantity more than 100.Total price of " + qq +" "+ name + " : RM" + calctotal(pr,qq));
		}
		
		calcCalories(this.quantity, kcal);
	}

	public String retailname(){
		return retailname;
	}
	
	public String placeProduce(){
		return placeProduce;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	
	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.name + "\n" + "Colour          :" + super.colour() + "\nRetail name     :" + this.retailname +
		      "\nProduce in      :" + this.placeProduce + "\nSeasons Harvest :" + this.seasons + "\nAverage Weight  :" + this.weight + "g per apple";
		
	}
}
