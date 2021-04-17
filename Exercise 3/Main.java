
public class Main {

	public static void main(String[] args) {
		Television a = new Television();
		System.out.println("Brand Colour Size Resolution > " + a.brand + ", "+a.colour+", "+a.size+" inch, "+a.resolution+"K.");
		System.out.println("Price > RM " + a.price);
		System.out.println("Discount given > " + a.discount + " %");
		System.out.println("Total Price > RM " + a.total);
		
		Television b = new Television("Philips Ultra Slim Smart LED TV","Black", 55 , 4 , 2800.00 , 10.0);
		System.out.println("\n\nBrand Colour Size Resolution > " + b.brand + ", "+b.colour+", "+b.size+" inch, "+b.resolution+"K.");
		System.out.println("Price > RM " + b.price);
		System.out.println("Discount given > " + b.discount + " %");
		System.out.println("Total Price > RM " + b.total);
		

	}

}
