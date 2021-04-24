package INHERITANCE;

import java.util.Scanner;

public class PHILIPS extends Television {
	Scanner s = new Scanner(System.in);
	    
	private String brand;
	private double price,total,discount,length,diagonal;
	private int unit,choice;
		
	//Constructor without argument
	    
	PHILIPS(){
	this.brand = "PHILIPS";
	
	System.out.println("Enter length(inch) : ");
	this.length = s.nextDouble();
	super.getHeight();
	super.getwidth();
	
	do {
              System.out.print("Enter Television Diagonal : ");
	      this.diagonal = s.nextDouble();
	   
	      if(diagonal == 55) {
	         this.price = 2299.00;break;
	     }
	     else if (diagonal == 43) {
	        this.price = 999.00;break;
	     }
	     else {
		System.out.println("Error input.(PHILIPS 4K only have diagonal with 55 inches and 43 inches)");
	     }
	
	}while(diagonal != 55 || diagonal != 43);	
			
	System.out.print("Enter unit : ");
	this.unit = s.nextInt();
			
			
	do {
	      System.out.print("Enter Membership (1-Yes,2-No) : ");
	      this.choice = s.nextInt();
			
	      if (choice == 1 ) {
		this.discount = 15.0;break;
	      }
	      else if (choice == 2 ) {
		this.discount = 0.0;break;
	      }
	      else {
		System.out.println("Wrong input. Enter only (1-Yes,2-No). ");
	      }
	} while (choice != 1 || choice != 0);
}
	
	
	public void Bluetooth() {
			System.out.println("Bluetooth connected.");
		}
		
	public void Wifi() {
			System.out.println("Wifi connected.");
		}
		
		//Getter
		public String getbrand() {
			return this.brand;
		}
		
		public double getdiagonal() {
			return this.diagonal;
		}
		
		public int getchoice() {
			return this.choice;
		}
		
		public double getLength() {
			return this.length;
		}
		
		public double volume() {
			return super.area()*length;
		}
		
		public double getPrice() {
			return this.price;
		}
		
		public int getunit() {
			return this.unit;
		}
		
		public double totalamount() {  //method
			return this.price*this.unit;
		}
		
		public double getdiscount() {
			return this.discount;
		}
		
		public double gettotal() {
			this.total = totalamount() - ((this.discount/100)*totalamount() );
			return this.total;
		}

}
