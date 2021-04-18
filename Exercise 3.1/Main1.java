
public class Main1 {

	public static void main(String[] args) {
		Television1 a = new Television1();
		
		System.out.println("Brand Colour Size Resolution > " + a.brand + ", "+a.colour+", "+a.getsize()+" inch, "+a.getresolution()+"K.");
		System.out.println("Price > RM " + a.getPrice());
		System.out.println("Discount given > " + a.getdiscount() + " %");
		System.out.println("Total Price > RM " + a.gettotal());
		
		
		Television1 b = new Television1("Philips Ultra Slim Smart LED TV","Black");
		
		b.setdiscount(10.0);
		b.setprice(2800.00);
		b.setresolution(4);
		b.setsize(55);
		
		System.out.println("\n\nBrand Colour Size Resolution > " + b.brand + ", "+b.colour+", "+b.getsize()+" inch, "+b.getresolution()+"K.");
		System.out.println("Price > RM " + b.getPrice());
		System.out.println("Discount given > " + b.getdiscount() + " %");
		System.out.println("Total Price > RM " + b.gettotal());
		

	}
}
