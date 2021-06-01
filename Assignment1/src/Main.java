import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("******************* Beverages Shop System *******************");
				 System.out.println("As an Admin you are allowed to enter : ");
		         do {
		         System.out.println("\n1.Employee Management System \n2.Inventory System \n3.Finance System \n4.Advertisement and Marketing System");
		         System.out.println("Please Choose your option : ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :EmployeeManagement1 em = new EmployeeManagement1();
		        	 	 System.out.println(em);break;
		         case 2 :Inventory s = new Inventory();
		        	     System.out.println(s);;break;
		         case 3 :Finance f = new Finance();
		        	 	 System.out.println(f);break;
		         case 4 :AdvertisementandMarketing ad = new AdvertisementandMarketing();
		        	     System.out.println(ad);break;
		         }
		         if(opt<1 && opt>4) {
			         System.out.println("\n1.Employee Management System \n2.Inventory System \n3.Finance System \n4.Advertisement and Marketing System");
			         System.out.println("Please Choose Only Option(1-4)");
			         opt = scan.nextInt();
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         
		         
		case 2 :do { 
				 System.out.println("******************* Welcome to Beverages Shop *******************");
        		 System.out.println("\n1.Beverages Description System \n2.Promotion \n3.Shopping Cart and Checking out \n4.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
                 case 1 :BeveragesDescription d = new BeveragesDescription();
                 		 System.out.println(d);break;
                 case 2 :AdvertisementandMarketing ad = new AdvertisementandMarketing();
                	 	 System.out.println(ad);break;
                 case 3 :Billing_System b = new Billing_System();
                	     System.out.println(b);break;
                 }
                 if(opt<1 && opt>3) {
                	 System.out.println("\n1.Beverages Description System \n2.Promotion \n3.Shopping Cart and Checking out \n4.Exit");			         System.out.println("Please Choose Only Option(1-6)");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Beverages Shop System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for visiting Beverages Shop.");
		
	}
}

	


