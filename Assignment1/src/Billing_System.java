import java.util.Scanner;

public class Billing_System extends BeveragesShop{
	Scanner scan = new Scanner(System.in);
	private String customer_name;
	private String customer_hp;
	private int quantity,choice;
	private double priceBeverages;
	private double voucher;
	
	Billing_System(){
		
		System.out.println("\n**************Welcome to BeveragesBusiness***************");
		System.out.print("Please enter your name         : ");
		customer_name = scan.next();
		System.out.print("Please enter your phone number : ");
		customer_hp = scan.next();
		do {
		System.out.println("\nPlease select the type of beverages : ");
		System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
		int option = scan.nextInt();
		while(option < 1 || option > 6) {
			System.out.println("\nOnly number from (1-6) is available, please check again. : ");
			System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
			option = scan.nextInt();
		}
		switch(option) {
		case 1 : this.priceBeverages = 3.00;break;
		case 2 : this.priceBeverages = 2.50;break;
		case 3 : this.priceBeverages = 1.00;break;
		case 4 : this.priceBeverages = 6.00;break;
		case 5 : this.priceBeverages = 10.00;break;
		case 6 : this.priceBeverages = 0.80;break;
		}
		System.out.print("\nEnter Quantity : ");
		this.quantity = scan.nextInt();
		if(this.quantity < 100) {
			calctotalprice();//overloading with no arguments as nothing change
			System.out.printf("\nTotal price  : RM%.2f" , calctotalprice());

		}
		
		else if(this.quantity == 100) {
			calctotalprice();//overloading with no arguments as nothing change
			System.out.printf("\nTotal price  : RM %.2f" , calctotalprice());
			System.out.println("\nGet free 1 ctn(24 pcs) of beverages." );
		}
		
		else if(this.quantity > 100 && this.quantity <=500) {
			double discount = 0.10;
			calctotalprice(discount);//overloading with 1 arguments as discount=0.10 if quantity > 100
			System.out.printf("\nQuantity more than 100.\nTotal price  : RM %.2f" , calctotalprice(discount));
		}
		
		else{//have discount if more than 500 , price will have changes
			double discount=0.10;
			double voucher = 20.00;
			calctotalprice(discount,voucher);
			System.out.printf("\nIf quantity more than 500.\nTotal price  : RM %.2f" , calctotalprice(discount,voucher));
			}
		System.out.println("\nChoose 1-Continue purchase,2-Exit and do payment :");
		choice = scan.nextInt();
		if(choice != 1 && choice != 2) {
			System.out.println("Choose only 1-Continue purchase,2-Exit and do payment :");
			choice = scan.nextInt();
		}
		}while(choice == 1); {
			System.out.println("Paid buy      : " + this.customer_name+ " ("+ this.customer_hp + ") ");
			System.out.println("\nThankyou for visiting " +super.name);
			System.out.println("If you meet up with any problem, feel free to call us in (03-2888588).");
			System.out.println();
		}
	}
	
	public double calctotalprice() {//overloading method-no argument
		return this.priceBeverages*this.quantity;
	}
	
	public double calctotalprice(double discount) {//overloading method-1 argument
		return (this.priceBeverages*this.quantity)*(1-discount);
	}
	
	public double calctotalprice(double discount,double voucher) {//overloading method-2 arguments
		return ((this.priceBeverages*this.quantity) *(1-discount))-this.voucher;
	}  

}
