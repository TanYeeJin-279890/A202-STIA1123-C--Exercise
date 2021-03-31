
public class Main {

	public static void main(String[] args) {
		Cat MyCat = new Cat();
		Cat AbuCat = new Cat();
		MyCat.name = "Cola";
		MyCat.colour = "Orange";
		MyCat.weight = "2.50kg";
		MyCat.age = "1 year old";
		MyCat.HasShots = "Has Shots";
		System.out.println(MyCat.name + "\n" + MyCat.colour + "\n" +  MyCat.weight +"\n" + MyCat.age +"\n"+ MyCat.HasShots);
		System.out.println();
        AbuCat.name = "Lina";
		AbuCat.colour = "Chocolate";
		AbuCat.weight = "3.00kg";
		AbuCat.age = "2 year old";
		AbuCat.HasShots = "Has Shots";
		System.out.println(AbuCat.name + "\n" + AbuCat.colour + "\n" +  AbuCat.weight +"\n" + AbuCat.age +"\n"+ AbuCat.HasShots);

	}

}
