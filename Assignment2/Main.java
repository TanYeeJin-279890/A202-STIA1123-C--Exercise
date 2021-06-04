import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		String username ,password ;
		AdvertisementandMarketing ad = new AdvertisementandMarketing();
		ad.settitleAd("Get Discount 10% "); // encapsulation
		ad.setdate("31/7/2021");// encapsulation
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		case 1 : System.out.println("******************* Beverages Shop System *******************");
				 System.out.println("Please Enter System Username : ");//username : Flamingo
		         username = scan.next();
				 System.out.println("Please Enter System Password : ");//password : abgh1234
				 password = scan.next();
				 if(username.equals("Flamingo") && password.equals("abgh1234")) {
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
		         case 4 :
		        	     ad.printinfo();
		        	     System.out.println("Voucher only available before "+ ad.getdate());
		 		         System.out.println();break;
		         }
		         if(opt<1 && opt>4) {
			         System.out.println("\n1.Employee Management System \n2.Inventory System \n3.Finance System \n4.Advertisement and Marketing System");
			         System.out.println("Please Choose Only Option(1-4)");
			         opt = scan.nextInt();
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         }
				 else {
					 System.out.println("Wrong input.");break;
				 }
		         
		         
		case 2 :do { 
				 System.out.println("******************* Welcome to Beverages Shop *******************");
        		 System.out.println("\n1.Beverages Description System \n2.Promotion \n3.Shopping Cart and Checking out \n4.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
                 case 1 :BeveragesDescription d = new BeveragesDescription();
                 		 System.out.println(d);break;
                 case 2 :ad.printinfo();break;
                 case 3 :BillingSystem1 b = new BillingSystem1();
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

	


