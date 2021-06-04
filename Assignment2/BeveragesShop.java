public abstract class BeveragesShop { // abstraction 
	protected String name;
	protected String address;
	protected double open;
	protected double close;
	protected String phoneNo;
	
	BeveragesShop(){
		this.name = "BeveragesShop";
		this.address = "NO50,Jln LP1,"+
		               "\nTaman Limbongan Permai,"+
				       "\n75200 Melaka";
		this.phoneNo = "03-2888588";
		this.open = 10.00;
		this.close = 10.00;
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.phoneNo);
		System.out.println("Open at  : " + this.open + " am");
		System.out.println("Close at : " + this.close + " pm");
		System.out.println("Open Day : all day ");
	}
	
	
	public abstract void printinfo(); //abstract method && Polymorphism

}
