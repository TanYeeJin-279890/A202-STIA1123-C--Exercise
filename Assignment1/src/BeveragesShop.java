import java.util.Scanner;

public class BeveragesShop { //superclass
	protected String name;
	protected String address;
	protected double open;
	protected double close;
	protected String phoneNo;
	
	BeveragesShop(){ // constructor without argument
		this.name = "BeveragesShop";
		this.address = "NO50,Jln LP1,"+
		              " Taman Limbongan Permai,"+
				       "75200 Melaka";
		this.phoneNo = "03-2888588";
		this.open = 10.00;
		this.close = 10.00;
		print();
	}
	
	public void print() {
		System.out.println("Name     : " + this.name);
		System.out.println("Location : " + this.address);
		System.out.println("Tel      : " + this.phoneNo);
		System.out.println("Open at  : " + this.open + " am");
		System.out.println("Close at : " + this.close + " pm");
		System.out.println("Open Day : all day ");
	}

}
