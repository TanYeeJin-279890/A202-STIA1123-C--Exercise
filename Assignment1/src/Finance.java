import java.util.Scanner;

public class Finance extends BeveragesShop{ // subclass for BeveragesShop
	Scanner scan = new Scanner(System.in);
	private double totalsales;
	private double totalcost;
	private double employees_salary;
	private double expenses;
	private double profit;
	private double netincome;
	

	Finance() {
		System.out.println("-------------Finance System-----------");
		System.out.println("Please key in the information needed.");
		BevSales();
		calcNetIncome();
		System.out.println();
		}
	
	public void BevSales() {
		System.out.print("\nTotal Sales per month :  RM ");
		this.totalsales = scan.nextDouble();
		System.out.print("\nTotal Cost on buying Stock per month :  RM ");
		this.totalcost = scan.nextDouble();
		this.profit = this.totalsales - this.totalcost;
		if(profit<0) {
			System.out.printf("\nFinancial Loss : RM %.2f" , this.profit);
			System.out.println();
		}
		else if(profit==0) {
			System.out.printf("\nBalance : RM %.2f" , this.profit);
			System.out.println();
		}
		else{
			System.out.printf("\nProfit : RM %.2f" , this.profit);
			System.out.println();
		} 
	}
	
	public void calcNetIncome() {
		System.out.println();

		System.out.print("\nTotal Expenses per month :  RM ");
		this.expenses = scan.nextDouble();
		System.out.print("\nTotal Employees' salary per month :  RM ");
		this.employees_salary = scan.nextDouble();
		this.netincome = this.profit - this.employees_salary - this.expenses;
		if(netincome<0) {
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		}
		else if(netincome==0) {
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		}
		else{
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		} 
		
		
		
	}

}
