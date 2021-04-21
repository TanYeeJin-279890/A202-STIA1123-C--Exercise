package INHERITANCE;

public class main {

	public static void main(String[] args) {
        
		LG objLG = new LG();
		System.out.println("\n\n-------------------------------"+objLG.getbrand()+"----------------------------------");
		System.out.println("Length > " + objLG.getLength()+ " inch ");
		System.out.println("Width > " + objLG.getwidth()+ " inch ");
		System.out.println("Height > " + objLG.getHeight()+ " inch ");
		System.out.println("Resolution > "+ objLG.getresolution()+"K ");
		System.out.println("Max Volume > "+ objLG.getmaxVol()+" dB(decibels).");
		System.out.println("Connection > ");
		objLG.Bluetooth();
		objLG.Wifi();
		System.out.println("Area of Television > " + objLG.area());
		System.out.println("Volume of Television > " + objLG.volume());
		System.out.println("Ratio of Screen Size > " + objLG.ratio());
		System.out.println("Diagonal of this television > " + objLG.getdiagonal());
		System.out.println("Display Customer Membership Discount > Customer have " + objLG.getdiscount() + "% discount");
		System.out.println("Units > " + objLG.getunit());
		System.out.printf("Price > RM %.2f" , objLG.getPrice());
		System.out.printf("\nTotal price > RM %.2f " , objLG.totalamount());
		System.out.printf("\nTotal price after discount >RM %.2f " , objLG.gettotal());
		
		System.out.println();
		
		PHILIPS objPHILIPS = new PHILIPS();
		System.out.println("\n\n-------------------------------"+objPHILIPS.getbrand()+"-----------------------------");
		System.out.println("Length > " + objPHILIPS.getLength()+ " inch ");
		System.out.println("Width > " + objPHILIPS.getwidth()+ " inch ");
		System.out.println("Height > " + objPHILIPS.getHeight()+ " inch ");
		System.out.println("Resolution > "+ objPHILIPS.getresolution()+"K ");
		System.out.println("Max Volume > "+ objPHILIPS.getmaxVol()+" dB(decibels).");
		System.out.println("Connection > ");
		objPHILIPS.Bluetooth();
		objPHILIPS.Wifi();
		System.out.println("Area of Television > " + objPHILIPS.area());
		System.out.println("Volume of Television > " + objPHILIPS.volume());
		System.out.println("Ratio of Screen Size > " + objPHILIPS.ratio());
		System.out.println("Diagonal of this television > " + objPHILIPS.getdiagonal());
		System.out.println("Display Customer Membership Discount > Customer have " + objLG.getdiscount() + "% discount");
		System.out.println("Units > " + objPHILIPS.getunit());
		System.out.printf("Price > RM %.2f " , objPHILIPS.getPrice());
		System.out.printf("\nTotal price > RM %.2f " , objPHILIPS.totalamount());
		System.out.printf("\nTotal price after discount > RM %.2f " , objPHILIPS.gettotal());
		

	}

}
