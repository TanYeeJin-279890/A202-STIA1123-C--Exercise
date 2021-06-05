import java.util.Scanner;

public class Finance extends EmployeeManagement1{ //inheritance
	Scanner scan = new Scanner(System.in);
	private double totalsales;
	private double profit;
	private double netincome;
	

	Finance() {
		System.out.println("-------------Finance System-----------");
		System.out.println("Please key in the information needed.");
		System.out.print("\nTotal Sales per month :  RM ");
		this.totalsales = scan.nextDouble();
		Payment g = new Inventoryexp();//interface
		System.out.print("\nTotal Cost Inventory per month :  RM ");
		System.out.print(g.payment());
		double cost = g.payment();
		this.profit = this.totalsales - cost;
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
		print();
		System.out.println();
		}
	
	public void print() {
		Payment e = new Financeexp();//interface
		System.out.print("\nTotal Expenses per month :  RM ");
		System.out.print(e.payment());
		double expenses = e.payment();
		
		Payment f = new EmployeeManagement1exp();//interface
		double salary = f.payment();
		
		Payment g = new Inventoryexp();//interface
		double cost = g.payment();
		
		this.netincome = this.profit - expenses - cost - salary;
		if(netincome<0) {
			System.out.printf("\nNet Income(loss) : RM %.2f" , this.netincome);
			System.out.println("\n");
		}
		else if(netincome==0) {
			System.out.printf("\nNet Income(equal) : RM %.2f" , this.netincome);
			System.out.println("\n");
		}
		else{
			System.out.printf("\nNet Income(profit) : RM %.2f" , this.netincome);
			System.out.println("\n");
		} 
		
		
		
	}

}
