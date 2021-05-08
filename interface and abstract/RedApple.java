public class RedApple extends Apple{
	private String retailname, placeProduce,seasons;
	private double weight;
	
	public RedApple(String name,String colour,double p,String n,String pp,String s,double weight) {
		super(name,colour,p);
		this.weight = weight;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		getprice();
	}
	
	public String retailname(){
		return retailname;
	}
	
	public String placeProduce(){
		return placeProduce;
	}
	
	public String seasons(){
		return seasons;
	}
	
	public double weight(){
		return weight;
	}
	
	public String toString() { //overriding method-dif classes
		return "Apple name      :" + super.name +"\n" + "Colour          :" + super.colour() + "\nRetail name     :" + this.retailname +
		       "\nProduce in      :" + this.placeProduce +"\nSeasons Harvest :" + this.seasons + "\nAverage Weight  :" + this.weight + "g per apple";
		
	}
}
	

