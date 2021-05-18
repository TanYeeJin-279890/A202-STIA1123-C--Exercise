import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		Grape g = new Grape("Grape",120,6.00);
		System.out.println(g);//print using overriding method
		System.out.println();
		
		Mango m = new Mango("Mango",110,3.50);
		System.out.println(m);//print using overriding method
		System.out.println();
		
		Apple a = new Apple("Apple",200,1.80);
		System.out.println(a);//print using overriding method
		System.out.println();
		
		
		RedApple pl = new RedApple("Pink Lady" , 300 ,1.80 , "Red" ,"Cripps Pink", "Western Australia" , "November to August" , 133.0);
		System.out.println(pl);//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Granny Smith" , 300 , "Green" , 1.54 , "No retail name" , "US" , "beginning in August and are available year round" , 128.0);
		System.out.println(gs);//print using overriding method
		System.out.println();
		
		
		System.out.println("------------------------Thankyou-----------------------");
		
		}

}




