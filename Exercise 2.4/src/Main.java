
public class Main {

	public static void main(String[] args) {
		smartphone a = new smartphone();
		a.setBrand("OPPO A 53");
		a.setModel("CPH2127");
		a.setColour("Fairy White, Electric Black, Fancy Blue");
		a.setWeight(186);
		a.setheight(6.45);
		a.setwidth(2.96);
		a.setdepth(0.33);
		a.setprice(639.00);
		a.setNoOfPhone(2);
		
		System.out.println("Brand > " + a.getbrand());
		System.out.println("Colour > " + a.getcolour());
		System.out.println("Model > " + a.getmodel());
		System.out.println("Weight > " + a.getweight() + " g");
		System.out.println("Price > RM " + a.getPrice());
		System.out.print("Dimension : Height > " + a.getheight() + " mm, ");
		System.out.print("Width > " + a.getwidth() + " mm, ");
		System.out.print("Depth > " + a.getDepth() + " mm\n");
		System.out.print("Total price for "+ a.getNoOfPhone() +" "+ a.getbrand() + " is > RM " + a.gettotalprice());
		
		

		
		phone b = new phone();
		b.setBrand("HONOR 20");
		b.setModel("YAL-L21");
		b.setColour("Midnight Black, Sapphire Blue, Icelandic white, Phantom Blue");
		b.setWeight(174);
		b.setheight(6.07);
		b.setwidth(2.91);
		b.setdepth(0.31);
		b.setprice(1200.00);
		b.setNoOfPhone(3);
		
		System.out.println("\n\nBrand > " + b.getbrand());
		System.out.println("Colour > " + b.getcolour());
		System.out.println("Model > " + b.getmodel());
		System.out.println("Weight > " + b.getweight() + " g");
		System.out.println("Price > RM " + b.getPrice());
		System.out.print("Dimension : Height > " + b.getheight() + " mm, ");
		System.out.print("Width > " + b.getwidth() + " mm, ");
		System.out.print("Depth > " + b.getDepth() + " mm\n");
		System.out.println("Total price for "+ b.getNoOfPhone() +" "+ b.getbrand() + " is > RM " + b.gettotalprice());
		

	}


}
