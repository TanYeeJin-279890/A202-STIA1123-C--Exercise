import java.util.Scanner;

public class Television {
	Scanner s = new Scanner(System.in);
	String brand;
	String colour;
	double price,total,discount;
	int size,resolution;
	
	//default constructor
	//Television a = new Television();
	Television(){
		System.out.println("Enter Brand of Television : ");
		this.brand = s.next(); 
		System.out.println("Enter Colour : ");
		this.colour = s.next(); 
		s.nextLine();
		System.out.println("Enter Size (inch) : ");
		this.size = s.nextInt(); 
		System.out.println("Enter Resolution : ");
		this.resolution = s.nextInt();
		System.out.println("Enter Price : ");
		this.price = s.nextDouble();
		do {
		System.out.println("Enter Discount(Max Discount -> 30%) : ");
		this.discount = s.nextDouble();
		this.total = this.price - ((this.discount/100)*this.price);
		}while(discount < 0 || discount > 30);
		
		
	}
	
	//Parameterized constructor
	Television(String b,String c,int s,int r,double p, double d){
		this.brand = b;
		this.colour = c;
		this.size = s;
		this.resolution = r;
		this.price = p;
		this.discount = d;
		this.total = this.price - ((this.discount/100)*this.price);
	}

}
