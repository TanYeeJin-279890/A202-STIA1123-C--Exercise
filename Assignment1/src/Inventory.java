import java.util.Scanner;

public class Inventory extends BeveragesShop{
	Scanner scan = new Scanner(System.in);
	private String category;
	private String Name;
	private String ID;
	private String flavour;
	private String type;
	private double volume;
	private double price;
	private int quantityleft=500,choice,quantityordered,quantity=500,opt,respond;
	
	
	Inventory(){
		System.out.println("-------------Inventory System-----------");
		do {
		System.out.print("\nChoose \n[1-Upadate Quantity of Beverages]\n[2-Display Inventory]\n[3-Exit]");
		System.out.println("Option : ");
		opt = scan.nextInt();
		switch(opt) {
		case 1 : updateQuantity();break;
		case 2 : display();break;
		}
		System.out.println("Continue with Inventory System?(1-Yes,0-No) : ");
	    respond = scan.nextInt();
	    if(respond!=1 && respond!=0) {
	    	System.out.println("Wrong Input.");
	    	System.out.println("Continue Checking another Workers?(1-Yes,0-No) : ");
		    respond = scan.nextInt();
	    }   
		}while(respond==1);
		System.out.println("End Session Inventory System");
	}
	
	public void updateQuantity() {
		System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
		System.out.print("\nChoose Beverages to change Quantity : ");
		int select = scan.nextInt();
		System.out.print("\nEnter Quantity ordered : ");
		this.quantityordered = scan.nextInt();
		if(quantityordered!=0) {
			this.quantity = this.quantityleft-this.quantityordered;
			switch(select) {
			case 1 :  this.quantityleft = this.quantity;break;
			case 2 :  this.quantityleft = this.quantity;break;
			case 3 :  this.quantityleft = this.quantity;break;
			case 4 :  this.quantityleft = this.quantity;break;
			case 5 :  this.quantityleft = this.quantity;break;
			case 6 :  this.quantityleft = this.quantity;break;
			}
		}
		else {
			this.quantityleft = this.quantity = 500;
		}
	}
	
	public void display() {
		System.out.println("There are 6 types of beverages sold in BeveragesShop.");
		do {
		System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
		System.out.println("Please select the beverages above to check the details of the beverages : ");
		int option = scan.nextInt();
		switch(option) {
		
		case 1 : this.category = "Tea";
				 System.out.println("*********************** "+ category +" *********************");
	             this.Name = "Lipton Tea";
			     System.out.println("Brand Name   : " + name);
			     this.ID = "B001";
			     System.out.println("ID           : " + ID);
			     this.flavour = "Lemon";
			     System.out.println("Flavour      : " + flavour);
			     this.type = "Stimulating";
			     System.out.println("Type         : " + type);
			     this.volume = 750.0;
			     System.out.println("Volume       : " + volume + " ml.");
			     this.price = 3.00;
			     System.out.printf("Price        : RM %.2f" , price);
			     this.quantityleft = this.quantity;
			     System.out.println("\nQuantityleft : " + quantity);
			     break;
			     
		 case 2 : this.category = "Coffee";
		 		  System.out.println("*********************** "+category+" *********************");
         	      this.Name = "Nescafe";
	     		  System.out.println("Brand Name   : " + name);
	     		  this.ID = "B002";
	     		  System.out.println("ID           : " + ID);
	     		  this.flavour = "Original";
	     		  System.out.println("Flavour      : " + flavour);
	     		  this.type = "Stimulating";
	     		  System.out.println("Type         : " + type);
	     		  this.volume = 250.0;
	     		  System.out.println("Volume       : " + volume + " ml.");
	     		  this.price = 2.50;
	     		  System.out.printf("Price        : RM %.2f" , price);
	     		  this.quantityleft = this.quantity;
	     		  System.out.println("\nQuantityleft : " + quantityleft);
	     		  break;
	     		  
		 case 3 : this.category = "Soft Drinks";
		  		  System.out.println("*********************** "+category+" *********************");
		  		  this.Name = "Coke";
		 		  System.out.println("Brand Name   : " + this.name);
		 		  this.ID = "B003";
		 		  System.out.println("ID           : " + this.ID);
		 		  this.flavour = "Original";
		 		  System.out.println("Flavour      : " + this.flavour);
		 		  this.type = "Refreshing";
		 		  System.out.println("Type         : " + this.type);
		 		  this.volume = 250.0;
		 		  System.out.println("Volume       : " + this.volume + " ml.");
		 		  this.price = 1.00;
		 		  System.out.printf("Price        : RM %.2f" , this.price);
		 		  this.quantityleft = this.quantity;
		 		  System.out.println("\nQuantityleft : " + this.quantityleft);
		 		  break;
		 		  
		 case 4 : this.category = "Fruit Juice";
 		  		  System.out.println("*********************** "+category+" *********************");
 		  		  this.Name = "Tropicana Twister";
 		  		  System.out.println("Brand Name   : " + this.name);
 		  		  this.ID = "B004";
 		  		  System.out.println("ID           : " + this.ID);
 		  		  this.flavour = "Orange";
 		  		  System.out.println("Flavour      : " + this.flavour);
 		  		  this.type = "Refreshing";
 		  		  System.out.println("Type         : " + this.type);
 		  		  this.volume = 950.0;
 		  		  System.out.println("Volume       : " + this.volume + " ml.");
 		  		  this.price = 6.00;
 		  		  System.out.printf("Price        : RM %.2f" , this.price);
 		  		  this.quantityleft = this.quantity;
 		  		  System.out.println("\nQuantityleft : " + this.quantityleft);
 		  		  break;
 		  		  
		 case 5 : this.category = "Milk";
  		  	  	  System.out.println("*********************** "+category+" *********************");
  		  	  	  this.Name = "HL";
  		  	  	  System.out.println("Brand Name   : " + this.name);
  		  	  	  this.ID = "B005";
  		  	  	  System.out.println("ID           : " + this.ID);
  		  	  	  this.flavour = "Original";
  		  	  	  System.out.println("Flavour      : " + this.flavour);
  		  	  	  this.type = "Nourishing";
  		  	  	  System.out.println("Type         : " + this.type);
  		  	  	  this.volume = 1000.0;
  		  	  	  System.out.println("Volume       : " + this.volume + " ml.");
  		  	  	  this.price = 10.00;
  		  	  	  System.out.printf("Price        : RM %.2f" , this.price);
  		  	  	  this.quantityleft = this.quantity;
  		  	  	  System.out.println("\nQuantityleft : " + this.quantityleft);
  		  	  	  break;
  		  	  	  
		 case 6 : this.category = "Mineral Water";
		 		  System.out.println("*********************** "+category+" *********************");
		 		  this.Name = "Aqua Pura";
		 		  System.out.println("Brand Name   : " + this.name);
		 		  this.ID = "B006";
		 		  System.out.println("ID           : " + this.ID);
		 		  this.flavour = "No Flavour";
		 		  System.out.println("Flavour      : " + this.flavour);
		 		  this.type = "Refreshing";
		 		  System.out.println("Type         : " + this.type);
		 		  this.volume = 550.0;
		 		  System.out.println("Volume       : " + this.volume + " ml.");
		 		  this.price = 0.80;
		 		  System.out.printf("Price        : RM %.2f" , this.price);
		 		  this.quantityleft = this.quantity;
		 		  System.out.println("\nQuantityleft : " + this.quantityleft);
		 		  break;
		
		}
		System.out.println("\n1-Continue Checking Details \n2-Exit");
		System.out.print("\nPlease Select : ");
		choice = scan.nextInt();
		if(choice != 1 && choice != 2) {
			System.out.println("Choose only \n1-Continue Checking Details \n2-Exit ");
			System.out.print("\nPlease Select : ");
			choice = scan.nextInt();
		}
		}while(choice == 1); {
			System.out.println("Thankyou for visiting " +super.name);
		}
	}
	
	

}
