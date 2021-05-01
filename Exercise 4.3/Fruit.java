import java.util.Scanner;
public class Fruit {
    protected String name;//declare name in superclass // protected - universe cannot access
	public Fruit(String name) {//superclass-variable can be use in any subclass
		this.name = name;
		System.out.println(name + " constructor is invoked");
      }
	
	public String getName() {
		return name;
	}

}

class Grape extends Fruit{
	Scanner scan = new Scanner(System.in);
    private String comment;
	private int option;
	public Grape(String name) {//subclass
		super(name);
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
	
	public void seed(int option) {//overloading
		
		if(option==1) {
			System.out.println("\nYou can buy Black Beauty(seedless).");
			System.out.println();
			}
		else if(option==0) {
			System.out.println("\nYou can buy Calmeria Grapes(seeded).");
			System.out.println();
			}
		else { 
			System.out.println("Invalid input.");
		}
		
	}
	
	
	public String getcomment() {
		return this.comment;
	}
	
	public void calcCalories(int quantity,double kcal) {//overloading in same class(can also be in dif class)
		double total = quantity*kcal;
		System.out.println("Total calories of "+ quantity + " grapes :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name        :" + super.getName() +
			   "\n" + "Colour            :Colour mostly in purple,red and green. "
			   +"\nComment           :" + this.comment;
		
	}
	
}


class Mango extends Fruit{
	Scanner scan = new Scanner(System.in);
	private int choice;
	private String comment;
	
	public Mango(String name) {//subclass
		super(name);
		System.out.print("Mango constructor is invoked");
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
	
	public void calcCalories(int quantity,double kcal) {//overloading in same class(can also be in dif class)
		double total = quantity*kcal;
		System.out.println("\nTotal calories of "+ quantity + " mango :" + total + "kcal.");
	}
	
	public String toString() { //overriding method-dif classes
		return "\nFruit name        :" + super.getName() +
			   "\n" + "Comment           :" + getcomment();
		
	}
}
	
class Apple extends Fruit {
	private String colour;
	public Apple(String name,String colour) {//subclass
		super(name);
		this.colour = colour;
		System.out.println("Apple constructor is invoked");
  }
	public void Appletype() {//overloading in same class(can also be in dif class)
		System.out.println("3 types of apples are sold.");
	}
	
	public void Appletype(String type) {//overloading in same class(can also be in dif class)
		System.out.println(type);
	}
	
	public void Appletype(int quantity,double kcal) {//overloading in same class(can also be in dif class)
		double total = quantity*kcal;
		System.out.println("\n\nTotal calories of "+ quantity + " apples :" + total + "kcal.");
	}
	
	public String colour(){
		return colour;
	}
	
	public String toString() { //overriding method-dif classes
		return "Fruit name      :" + super.getName() +
			   "\n" + "Colour \t\t:" + colour();
		
	}
	
}

class RedApple extends Apple {
	Scanner scan = new Scanner(System.in);
	private String retailname, placeProduce,seasons;
	private double weight;
	protected double price;
	private double total;
	protected int quantity;
	public RedApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour);
		this.weight = weight;
		this.price = price;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple purchased :  ");
		this.quantity = scan.nextInt();
		
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
	
	public double price(){
		return price;
	}
	
	public int getquantity(){
		return this.quantity;
	}
	
	public void calctotal() {//overriding method
		total = quantity*price;
		System.out.println("\nTotal price of "+ quantity +" "+ name +" "+" : RM" + total);
	}

	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
			   "\nRetail name     :" + this.retailname +
		       "\nProduce in      :" + this.placeProduce +
		       "\nSeasons Harvest :" + this.seasons +
		       "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nPrice per apple : RM" + this.price;
		
	}
	
	
}

class GreenApple extends Apple {
	Scanner scan = new Scanner(System.in);
	private String retailname, placeProduce,seasons;
	private double weight,price,total;
	private int quantity;
	public GreenApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour);
		this.weight = weight;
		this.price = price;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple purchased :  ");
		this.quantity = scan.nextInt();
		
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
	
	public double price(){
		return price;
	}
	
	public int getquantity(){
		return this.quantity;
	}
	
	public void calctotal() {//overriding method
		total = quantity*price;
		System.out.println("\nTotal price of "+ quantity +" "+ name +" "+" : RM" + total);
	}

	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
			   "\nRetail name     :" + this.retailname +
		       "\nProduce in      :" + this.placeProduce +
		       "\nSeasons Harvest :" + this.seasons +
		       "\nAverage Weight  :" + this.weight + "g per apple" +
		       "\nPrice per apple : RM" + this.price;
		
	}
}

class GoldApple extends RedApple{
   public GoldApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour,n,pp,s,weight,price);
}
   public void calctotal() {//overriding method
		double total = quantity*price;
		System.out.println("\nTotal price of "+ quantity +" "+ name +" "+" : RM" + total);
	}


	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.getName() +
			   "\n" + "Colour          :" + super.colour() +
			   "\nRetail name     :" + super.retailname() +
		       "\nProduce in      :" + super.placeProduce() +
		       "\nSeasons Harvest :" + super.seasons() +
		       "\nAverage Weight  :" + super.weight() + "g per apple" +
		       "\nPrice per apple : RM" + super.price();
		
	}
	
	
}

	
class Main {

	public static void main(String[] args) {
		
		Grape g = new Grape("Grape");
		g.seed();
		g.seed(1);//overloading method
		g.calcCalories(1, 67.0);//overloading method
		System.out.println(g);//print using overriding method
		System.out.println();
		
		Mango m = new Mango("Mango");
		m.colour();
		m.calcCalories(1, 60.0);
		System.out.println(m);//print using overriding method
		System.out.println();
		
		Apple a = new Apple("Apple","Red,Green,Gold");
		System.out.println(a);//print using overriding method
		a.Appletype();
		a.Appletype("\t\t1. Pink Lady."+ "\n\t\t2. Granny Smith."+ "\n\t\t3. Golden Delicious" );//print using overloading method 
		a.Appletype(1,52.0);//print using overloading method
		System.out.println();
		
		RedApple pl = new RedApple("Pink Lady" , "Red" ,  "Cripps Pink" , "Western Australia" , "November to August" , 133.0 , 1.80);
		System.out.println(pl);//print using overriding method
		pl.calctotal();//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Granny Smith" , "Green" , "No retail name" , "US" , "beginning in August and are available year round" , 128.0 , 1.54);
		System.out.println(gs);//print using overriding method
		gs.calctotal();//print using overriding method
		System.out.println();
		
		GoldApple gd = new GoldApple("Golden Delicious" , "Golden" , "Apple Lite" , "US" , "fall through Winter" , 190.0 , 1.82);
		System.out.println(gd);//print using overriding method
		gd.calctotal();//print using overriding method
		System.out.println();
		
		System.out.println("------------------------Thankyou-----------------------");
		
		}
}






	


