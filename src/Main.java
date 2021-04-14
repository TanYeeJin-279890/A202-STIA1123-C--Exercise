
public class Main {

	public static void main(String[] args) {
		smartphone a = new smartphone();
		a.setBrand();
		a.setModel("CPH2127");
		a.setColour();
		a.setWeight(186);
		a.setheight(6.45);
		a.setwidth(2.96);
		a.setdepth(0.33);
		a.setprice(639.00);
		a.setnoofphone();
		
		System.out.println("Brand > " + a.getbrand());
		System.out.println("Colour > " + a.getcolour());
		System.out.println("Model > " + a.getmodel());
		System.out.println("Weight > " + a.getweight() + " g");
		System.out.println("Price > RM " + a.getPrice());
		System.out.print("Dimension : Height > " + a.getheight() + " mm, ");
		System.out.print("Width > " + a.getwidth() + " mm, ");
		System.out.print("Depth > " + a.getDepth() + " mm\n\n");
		System.out.print("Total price is > RM " + a.gettotalprice());

		

		
		smartphone b = new smartphone();
		b.setBrand();
		b.setModel("YAL-L21");
		b.setColour();
		b.setWeight(174);
		b.setheight(6.07);
		b.setwidth(2.91);
		b.setdepth(0.31);
		b.setprice(1200.00);
		a.setnoofphone();
		
		System.out.println("Brand > " + b.getbrand());
		System.out.println("Colour > " + b.getcolour());
		System.out.println("Model > " + b.getmodel());
		System.out.println("Weight > " + b.getweight() + " g");
		System.out.println("Price > RM " + b.getPrice());
		System.out.print("Dimension : Height > " + b.getheight() + " mm, ");
		System.out.print("Width > " + b.getwidth() + " mm, ");
		System.out.print("Depth > " + b.getDepth() + " mm");
		System.out.print("Total price is > RM " + b.gettotalprice());
		

	}

}
