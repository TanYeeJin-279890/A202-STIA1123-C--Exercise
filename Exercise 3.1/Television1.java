import java.util.Scanner;

public class Television1 {
	Scanner s = new Scanner(System.in);
	String brand;
	String colour;
	private double price,total,discount;
	private int size,resolution;
	
	
	
	//default constructor
	//Television a = new Television();
	
	Television1(){
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
	Television1(String b,String c){
		this.brand = b;
		this.colour = c;
	}
	
	
	//Create Setter Method
        public void setprice(double price) {
		this.price = price;
	}
    
        public void setsize(int size) {
		this.size = size;
	}
    
        public void setresolution(int resolution) {
		this.resolution = resolution;
	}
    
        public void setdiscount(double discount) {
		this.discount = discount;
	}
    
	//Create Getter Method
	public String getbrand() {
		return this.brand;
	}
	
	public String getcolour() {
		return this.colour;
	}
	
	public int getsize() {
		return this.size;
	}
    
        public int getresolution() {
		return this.resolution;
	}
    
	public Double getPrice() {
		return this.price;
	}
	
	public Double getdiscount() {
		return this.discount;
	}
	
	public Double gettotal() {
		this.total = this.price - ((this.discount/100)*this.price);
		return this.total;
	}

}


