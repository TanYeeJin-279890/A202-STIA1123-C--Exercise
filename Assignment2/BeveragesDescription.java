import java.util.Scanner;

public class BeveragesDescription extends BeveragesShop{//inheritance
	Scanner scan = new Scanner(System.in);
	private String category;
	protected String Name;
	protected String flavour;
	private String type;
	protected double volume;
	protected double price;
	private int choice;
	
	BeveragesDescription(){
    System.out.println("---------------------Beverages Description System---------------------");
	System.out.println("\nThere are 6 types of beverages sold in BeveragesShop.");
	do {
	System.out.println("\n1-LiptonTea RM 3.00\n2-Nescafe RM 2.50\n3-Coke RM 1.00\n4-Tropicana Orange Juice RM 6.00\n5-HL Milk RM 10.00\n6-Mineral Water RM 0.80");
	printinfo();
	}while(choice == 1); 
	}

	public void printinfo() { // polymorphism
		System.out.println("Please select the beverages above to check the details of the beverages : ");
		int option = scan.nextInt();
		switch(option) {
		
		case 1 : this.category = "Tea";
				 System.out.println("*********************** "+ category +" *********************");
	             this.Name = "Lipton Tea";
			     System.out.println("Brand Name  : " + Name);
			     this.flavour = "Lemon";
			     System.out.println("Flavour     : " + flavour);
			     this.type = "Stimulating";
			     System.out.println("Type        : " + type);
			     this.volume = 750.0;
			     System.out.println("Volume      : " + volume + " ml.");
			     this.price = 3.00;
			     System.out.printf("Price       : RM %.2f" , price);
			     break;
			     
		 case 2 : this.category = "Coffee";
		 		  System.out.println("*********************** "+category+" *********************");
	     	      this.Name = "Nescafe";
	     		  System.out.println("Brand Name  : " + Name);
	     		  this.flavour = "Original";
	     		  System.out.println("Flavour     : " + flavour);
	     		  this.type = "Stimulating";
	     		  System.out.println("Type        : " + type);
	     		  this.volume = 250.0;
	     		  System.out.println("Volume      : " + volume + " ml.");
	     		  this.price = 2.50;
	     		  System.out.printf("Price       : RM %.2f" , price);
	     		  break;
	     		  
		 case 3 : this.category = "Soft Drinks";
		  		  System.out.println("*********************** "+category+" *********************");
		  		  this.Name = "Coke";
		 		  System.out.println("Brand Name  : " + this.name);
		 		  this.flavour = "Original";
		 		  System.out.println("Flavour     : " + this.flavour);
		 		  this.type = "Refreshing";
		 		  System.out.println("Type        : " + this.type);
		 		  this.volume = 250.0;
		 		  System.out.println("Volume      : " + this.volume + " ml.");
		 		  this.price = 1.00;
		 		  System.out.printf("Price       : RM %.2f" , this.price);
		 		  break;
		 		  
		 case 4 : this.category = "Fruit Juice";
			  		  System.out.println("*********************** "+category+" *********************");
			  		  this.Name = "Tropicana Twister";
			  		  System.out.println("Brand Name  : " + this.name);
			  		  this.flavour = "Orange";
			  		  System.out.println("Flavour     : " + this.flavour);
			  		  this.type = "Refreshing";
			  		  System.out.println("Type        : " + this.type);
			  		  this.volume = 950.0;
			  		  System.out.println("Volume      : " + this.volume + " ml.");
			  		  this.price = 6.00;
			  		  System.out.printf("Price       : RM %.2f" , this.price);
			  		  break;
			  		  
		 case 5 : this.category = "Milk";
			  	  	  System.out.println("*********************** "+category+" *********************");
			  	  	  this.Name = "HL";
			  	  	  System.out.println("Brand Name  : " + this.name);
			  	  	  this.flavour = "Original";
			  	  	  System.out.println("Flavour     : " + this.flavour);
			  	  	  this.type = "Nourishing";
			  	  	  System.out.println("Type        : " + this.type);
			  	  	  this.volume = 1000.0;
			  	  	  System.out.println("Volume      : " + this.volume + " ml.");
			  	  	  this.price = 10.00;
			  	  	  System.out.printf("Price       : RM %.2f" , this.price);
			  	  	  break;
			  	  	  
		 case 6 : this.category = "Mineral Water";
		 		  System.out.println("*********************** "+category+" *********************");
		 		  this.Name = "Aqua Pura";
		 		  System.out.println("Brand Name  : " + this.name);
		 		  this.flavour = "No Flavour";
		 		  System.out.println("Flavour     : " + this.flavour);
		 		  this.type = "Refreshing";
		 		  System.out.println("Type        : " + this.type);
		 		  this.volume = 550.0;
		 		  System.out.println("Volume      : " + this.volume + " ml.");
		 		  this.price = 0.80;
		 		  System.out.printf("Price       : RM %.2f" , this.price);
		 		  break;
		
		}
		System.out.println("\n1-Continue Checking Details \n2-Exit");
		choice = scan.nextInt();
		if(choice != 1 && choice != 2) {
			System.out.println("Choose only \n1-Continue Checking Details \n2-Exit ");
			choice = scan.nextInt();
		}
		
	}
	
	
}