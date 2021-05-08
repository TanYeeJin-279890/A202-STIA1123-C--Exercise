import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

		Grape g = new Grape("Grape",2);
		System.out.println(g);//print using overriding method
		System.out.println();
		
		Mango m = new Mango("Mango",3);
		System.out.println(m);//print using overriding method
		System.out.println();
		
		Apple a = new Apple("Apple","Red,Green",1.80);
		System.out.println(a);//print using overriding method
		System.out.println();
		
		
		RedApple pl = new RedApple("Pink Lady" , "Red" ,1.80 , "Cripps Pink" , "Western Australia" , "November to August" , 133.0);
		System.out.println("Discount Rate :" + a.discount()+"\n");
		System.out.println(pl);//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Granny Smith" , "Green" , 1.54 , "No retail name" , "US" , "beginning in August and are available year round" , 128.0);
		System.out.println("Discount Rate :" + gs.discount()+"\n");
		System.out.println(gs);//print using overriding method
		System.out.println();
		
		
		System.out.println("------------------------Thankyou-----------------------");
		
		}

}




