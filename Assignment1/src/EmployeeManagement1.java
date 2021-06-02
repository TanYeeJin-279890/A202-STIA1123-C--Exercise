import java.util.Scanner;

public class EmployeeManagement1 extends BeveragesShop{ // subclass for BeveragesShop
	Scanner scan = new Scanner(System.in);
	private int noOfWorkers = 10;
	private double hourperSalary1 = 3000.00; //admin salary/month
	private double hourperSalary2 = 1500.00; //stocker salary/month
	private double hourperSalary3 = 1800.00; //cashier salary/month
	private double hourperSalary4 = 2300.00; //accountant salary/month
	private int respond;
	private double totalSalary;
	

	EmployeeManagement1() {
		System.out.println("-------------Employee Management System-----------");
		System.out.println("Beverages Shop contains a total of "+this.noOfWorkers+" workers.");
		personalinfo();
		System.out.printf("\nTotal Expenses On Salary : RM %.2f " , calctotalExpensesOnsalary());
		System.out.println();
	}
	
	public void personalinfo() {
		do {
		System.out.println("1-Admin\n2-Stocker\n3-Cashier\n4-Accountants");
		System.out.print("\nSelect to check details : ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("1 Admin");
		 		 System.out.println("\nName   : Elaine Wong"+
		 				 			"\nAge    : 35"+
		 				 			"\nTel    : 012-3456781"+
		 				 			"\nSalary : RM " + this.hourperSalary1);
		 		 					System.out.println();break;
		
		case 2 : System.out.println("4 Stockers");
				 System.out.println("\nName   : Jamie"+
						 "\nAge    : 21"+
						 "\nTel    : 012-8348555"+
						 "\nSalary : RM " + this.hourperSalary2);
				 System.out.println("\nName   : Rain"+
						 "\nAge    : 22"+
						 "\nTel    : 012-8388213"+
						 "\nSalary : RM " + this.hourperSalary2);
				 System.out.println("\nName   : Richole"+
						 "\nAge    : 30"+
						 "\nTel    : 012-3456788"+
						 "\nSalary : RM " + this.hourperSalary2);
				 System.out.println("\nName   : Richard"+
						 "\nAge    : 35"+
						 "\nTel    : 012-2335288"+
						 "\nSalary : RM " + this.hourperSalary2);
				 		 System.out.println();break;
		
		case 3 : System.out.println("3 Cashiers");
				 System.out.println("\nName   : Elina Tan"+
						 "\nAge    : 35"+
						 "\nTel    : 012-3456783"+
						 "\nSalary : RM " + this.hourperSalary3);
				 System.out.println("\nName   : Jean"+
						 "\nAge    : 32"+
						 "\nTel    : 012-1234222"+
						 "\nSalary : RM " + this.hourperSalary3);
				 System.out.println("\nName   : Rita"+
						 "\nAge    : 22"+
						 "\nTel    : 012-5315432"+
						 "\nSalary : RM " + this.hourperSalary3);
				 		 System.out.println();break;
		case 4 : System.out.println("2 Accountants");
				 System.out.println("\nName   : Subrina"+
						 "\nAge    : 35"+
						 "\nTel    : 016-3335455"+
						 "\nSalary : RM " + this.hourperSalary4);
				 System.out.println("\nName   : Lina"+
						 "\nAge    : 25"+
						 "\nTel    : 018-5353211"+
						 "\nSalary : RM " + this.hourperSalary4);
				 		 System.out.println();break;
		}
		System.out.println("Continue Checking another Workers?(1-Yes,0-No) : ");
	    respond = scan.nextInt();
	    if(respond!=1&&respond!=0) {
	    	System.out.println("Wrong Input.");
	    	System.out.println("Continue Checking another Workers?(1-Yes,0-No) : ");
		    respond = scan.nextInt();
	    }  
		}while(respond==1);
		System.out.println("End Checking Workers Personal Information");
	}
	
	public double calctotalExpensesOnsalary() {
		totalSalary = hourperSalary1 + (hourperSalary2*4) + (hourperSalary3*3) + (hourperSalary4*2);
		return totalSalary;
	}
	

	

}
