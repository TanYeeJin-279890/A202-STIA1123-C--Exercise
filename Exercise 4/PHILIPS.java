package INHERITANCE;

public class PHILIPS extends Television {

	    private double length;
		

		
		public PHILIPS(double weight, double height, double L) {
			super(weight,height);
			length = L;
			
		}
		
		public void Bluetooth() {
			System.out.println("Bluetooth connected.");
		}
		
		public void Wifi() {
			System.out.println("Wifi connected.");
		}
		
		//getter
		
		public double getlength() {
			return this.length;
		}
		
		public int getresolution() {
			return super.getresolution();
		}
		
		
		public int maxVol() {
			return super.getmaxVol();
		}
		
		public double volume() {
			return super.area()*length;
		}
		
		public double ratio() {
			return super.ratio();
		}
	

}
