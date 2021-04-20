package INHERITANCE;

public class LG extends Television {

    private double length;
	
	
	
	
	public LG(double w, double h, double L) {
		super(w,h);
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
