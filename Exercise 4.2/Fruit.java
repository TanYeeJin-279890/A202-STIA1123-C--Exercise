import java.util.Scanner;

public class Fruit {
	//private-control who is going to access this data , only class itself and only subclass can access
    private String name;//declare name in superclass
	public Fruit(String name) {//superclass-variable can be use in any subclass
		this.name = name;
		System.out.println("\nFruit constructor is invoked");
      }
	
	public String getName() {
		return name;
	}

}

class Grape extends Fruit{
	Scanner scan = new Scanner(System.in);
    String colour,comment;
	int option;
	public Grape(String name) {//subclass
		super(name);
		System.out.println("Grape constructor is invoked");
		System.out.println("Colour mostly in purple,red and green");
		}
	
	public void seed() {
		do {
			System.out.print("Enter option (1-seedless,0-seeded):");
			this.option = scan.nextInt();
			
			if(option==1) {
				this.comment = "More easier and enjoyable while eating.";break;
				}
			else if(option==0) {
				this.comment = "Annoyed by spitting outthe seed.Can choose to eat seed or split out.";break;
				}
			else { 
				System.out.println("Invalid input.");
			}
			
			}while(option != 1||option != 0);
		}
	
	
	public String getcomment() {
		return this.comment;
	}
}


class Mango extends Fruit{
	Scanner scan = new Scanner(System.in);
	int choice;
	String comment;
	
	public Mango(String name) {//subclass
		super(name);
		System.out.print("Mango constructor is invoked");
		}
	
	public void colour(){
		do {
		System.out.print("Enter colour choice (1-yellow,0-green):");
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
}
	
class Apple extends Fruit {
	String colour;
	public Apple(String name,String colour) {//subclass
		super(name);
		this.colour = colour;
		System.out.println("Apple constructor is invoked");
  }
}

class RedApple extends Apple {
	Scanner scan = new Scanner(System.in);
	String retailname, placeProduce,seasons;
	double weight,price,total;
	int unit;
	public RedApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour);
		this.weight = weight;
		this.price = price;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple purchased :  ");
		this.unit = scan.nextInt();
		
	}
	public double total() {
		return this.total = this.unit*this.price;
	}
	
}

class GreenApple extends Apple {
	Scanner scan = new Scanner(System.in);
	String retailname, placeProduce,seasons;
	double weight,price,total;
	int unit;
	public GreenApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour);
		this.weight = weight;
		this.price = price;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		System.out.print("\n\nEnter number of apple purchased :  ");
		this.unit = scan.nextInt();
		
	}
	public double total() {
		return this.total = this.unit*this.price;
	}
	
}

class GoldApple extends RedApple{
    double total;
	public GoldApple(String name,String colour,String n,String pp,String s,double weight,double price) {
		super(name,colour,n,pp,s,weight,price);
		
}
	public double total() {
		return this.total = this.unit*this.price;
	}
}

	
class Main {

	public static void main(String[] args) {
		Grape g = new Grape("Grape");
		System.out.println("Fruit name :" + g.getName());
		g.seed();
		System.out.println("Comment :" + g.getcomment());
		
		Mango m = new Mango("Mango");
		System.out.println("Fruit name :" + m.getName());
		m.colour();
		System.out.println("Comment :" + m.getcomment());
		
		Apple a = new Apple("Red Apple","Red");
		System.out.println("Fruit name :" + a.getName());
		System.out.println(a.colour);
		
		RedApple pl = new RedApple("Pink Lady" , "Red" ,  "Cripps Pink" , "Western Australia" , "November to August" , 133.0 , 1.80);
		System.out.println("Apple name       :" + pl.getName());
		System.out.println("Colour           :" + pl.colour);
		System.out.println("Retail name      :" + pl.retailname);
		System.out.println("Produce in       :" + pl.placeProduce);
		System.out.println("Seasons Harvest  :from" + pl.seasons);
		System.out.println("Average Weight   :" + pl.weight + "g per apple");
		System.out.printf("\nPrice per apple : RM %.2f" , pl.price);
		System.out.printf("\nTotal Price     : RM %.2f" , pl.total());
		
		GreenApple gs = new GreenApple("Granny Smith" , "Green" , "No retail name" , "US" , "beginning in August and are available year round" , 128.0 , 1.54);
		System.out.println("\nApple name       :" + gs.getName());
		System.out.println("Colour           :" + gs.colour);
		System.out.println("Retail name      :" + gs.retailname);
		System.out.println("Produce in       :" + gs.placeProduce);
		System.out.println("Seasons Harvest  :" + gs.seasons);
		System.out.println("Average Weight   :" + gs.weight + "g per apple");
		System.out.printf("\nPrice per apple : RM %.2f" , gs.price);
		System.out.printf("\nTotal Price     : RM %.2f" , gs.total());
		
		GoldApple gd = new GoldApple("Golden Delicious" , "Golden" , "Apple Lite" , "US" , "fall through Winter" , 190.0 , 1.82);
		System.out.println("\nApple name       :" + gd.getName());
		System.out.println("Colour           :" + gd.colour);
		System.out.println("Retail name      :" + gd.retailname);
		System.out.println("Produce in       :" + gd.placeProduce);
		System.out.println("Seasons Harvest  :" + gd.seasons);
		System.out.println("Average Weight   :" + gd.weight + "g per apple");
		System.out.printf("\nPrice per apple : RM %.2f" , gd.price);
		System.out.printf("\nTotal Price     : RM %.2f" , gd.total());
		
		}
}






	


