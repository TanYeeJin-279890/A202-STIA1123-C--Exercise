package INHERITANCE;

import java.util.Scanner;

public class Television {
	//scanner input
	Scanner s = new Scanner(System.in);
	private double height,width;
	private int resolution, maxVol; 
	
	//Constructor
	Television(){
		
		System.out.print("Enter Width of Television(inch) : ");
		this.width = s.nextDouble(); 
		System.out.print("Enter Height Volume of Television(inch) : ");
		this.height = s.nextDouble();
		System.out.print("Enter Resolution of Television(K) : ");
		this.resolution = s.nextInt(); 
		System.out.print("Enter Max Volume of Television(dB) : ");
		this.maxVol = s.nextInt(); 
		
	}
	
	
	//Getter method
	
	public double getwidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double ratio() {
		return width/height;
	}
	
	public int getresolution() {
		return this.resolution;
	}
	
	public int getmaxVol() {
		return this.maxVol;
	}
	
	
	
}
