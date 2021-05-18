public class RedApple extends Apple{
	private String retailname, placeProduce,seasons,colour;
	private double weight;
	
	public RedApple(String name,int q,double p,String colour,String n,String pp,String s,double weight) {
		super(name,q,p);
		this.weight = weight;
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		this.colour = colour;
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
		return "\nApple name      :" + super.name +"\n" + "Colour          :" + this.colour + "\nRetail name     :" + this.retailname +
		       "\nProduce in      :" + this.placeProduce +"\nSeasons Harvest :" + this.seasons + "\nAverage Weight  :" + this.weight + "g per apple";
		
	}
}
	

