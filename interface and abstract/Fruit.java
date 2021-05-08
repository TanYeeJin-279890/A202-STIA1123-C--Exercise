public abstract class Fruit {
	protected String name;//declare name in superclass // protected - universe cannot access
	public Fruit(String name) {//superclass-variable can be use in any subclass
		this.name = name;
		
		//System.out.println(name + " constructor is invoked");
      }
	public abstract double calctotal();
	public abstract double calctotal(double pr);
	public abstract double calctotal(double pr,int qq);
    

}







	


