import java.util.Scanner;

public class BillingSystem1 extends BeveragesDescription { //inheritance
	Scanner scan = new Scanner(System.in);
	private int option,count,max = 10000000;
	private String cusname; //customer name
	private String cushp;//customer phone number
	private String respond;
	private double voucher,finaltotal = 0.0;
	double[]price = {3.00,2.50,1.00,6.00,10.00,0.80};
	double[]total = new double[max];
	double[]totalprice = new double[max];
	int[]quantity = new int[max];
	int[]totalquantity = new int[max];
	
	BillingSystem1() {
        System.out.println("\n************** Welcome to BeveragesBusiness ***************");
		System.out.print("Please enter your name         : ");
		cusname = scan.next();
		System.out.print("Please enter your phone number : ");
		cushp = scan.next();
		
	do {
		System.out.println("\nPlease select the type of beverages : ");
		System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
		option = scan.nextInt();
		while(option < 1 || option > 6) {
			System.out.println("\nOnly number from (1-6) is available, please check again. : ");
			System.out.println("1-LiptonTea \n2-Nescafe \n3-Coke \n4-Tropicana Orange Juice \n5-HL Milk \n6-Mineral Water");
			option = scan.nextInt();
		}
        System.out.print("Please enter the quantity : ");
        quantity[count] = scan.nextInt();
        total[count] = price[option - 1] * quantity[count];
        System.out.printf("Total price = RM%.2f%n", total[count]);
        
        totalquantity[option - 1] = totalquantity[option - 1] + quantity[count];
        totalprice[option - 1] = totalprice[option - 1] + total[count];
        finaltotal = finaltotal + total[count];
        count++;
        System.out.print("Do you want to continue? (y/n) : ");
        respond = scan.next();
        } while (respond.equalsIgnoreCase("y"));{
        	System.out.println();
        	System.out.println("Paid by    :" + this.cusname + " (" + this.cushp + " )");
            System.out.printf("\nFinal Price : RM%.2f%n", finaltotal);
            printinfo();
        }
        }
	
	public void printinfo() {//polymorphism
		if(this.finaltotal < 400.00) {
			calctotalprice();//overloading with no arguments as nothing change
			System.out.println();
			}
		
		else if(this.finaltotal > 400.00 && this.finaltotal <= 500.00) {
			double discount = 0.10;
			calctotalprice(discount);//overloading with 1 arguments as discount=0.10 if quantity > 400
			System.out.println("Payment more than 400.\nDiscount Given : " + (discount*100) + " %");
			System.out.printf("\nPrice after discount  : RM %.2f" , calctotalprice(discount));
			System.out.println();
		}
		
		else{//have discount if more than 500 , price will have changes
			double discount=0.10;
			double voucher = 20.00;
			calctotalprice(discount,voucher);
			System.out.println("Purchase more than RM500.00.\nDiscount Given : " + (discount*100) + " %");
			System.out.println("Cash Voucher : RM " + voucher);
			System.out.printf("\nPrice after discount  : RM %.2f" , calctotalprice(discount,voucher));
			System.out.println();
			}
	}
	
	public double calctotalprice() {//overloading method-no argument
		return this.finaltotal ;
	}
	
	public double calctotalprice(double discount) {//overloading method-1 argument
		return this.finaltotal *(1-discount);
	}
	
	public double calctotalprice(double discount,double voucher) {//overloading method-2 arguments
		return (this.finaltotal *(1-discount))-this.voucher;
	} 	

}
