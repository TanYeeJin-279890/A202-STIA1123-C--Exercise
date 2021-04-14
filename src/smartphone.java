import java.util.Scanner;

public class smartphone {
	Scanner scan = new Scanner(System.in);
	String brand,model,colour;
	int NoOfPhone;
	double weight,height,width,depth,price,totalprice;
	
	//Create Setter Method
		public void setBrand() {
	    	System.out.println("\nWhat is the brand of the phone you want ? ");
	    	this.brand = scan.next();
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setColour() {
	    	System.out.println("What is the colour of the phone you want ? ");
	    	this.colour = scan.next();
		}
		
		public void setnoofphone() {
			System.out.println("Quantity purchased ? ");
	    	this.NoOfPhone = scan.nextInt();
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public void setheight(double height) {
			this.height = height;
		}
		
		public void setwidth(double width) {
			this.width = width;
		}
		
		public void setdepth(double depth) {
			this.depth = depth;
		}
		
		public void setprice(double price) {
			this.price = price;
		}
		//Create Getter Method
		public String getbrand() {
			return this.brand;
		}
		
		public String getmodel() {
			return this.model;
		}
		
		public String getcolour() {
			return this.colour;
		}

		
		public Double getweight() {
			return this.weight;
		}

		
		public Double getheight() {
			return this.height;
		}
		
		public Double getwidth() {
			return this.width;
		}
		
		public Double getDepth() {
			return this.depth;
		}
		
		public Double getPrice() {
			return this.price;
		}
		
		public Double gettotalprice() {
			this.totalprice = this.NoOfPhone*this.price;
			return this.totalprice;
		}


}
