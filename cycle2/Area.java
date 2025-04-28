package tkm;

import java.util.Scanner;

interface Shape{
	double calculatearea();
	
}

class Triangle implements Shape{
	
	private double base,height;
	
	public Triangle(double base,double height){
		this.base=base;
		this.height=height;
		
	}
	
	public double calculatearea(){
		return 0.5*base*height;
		
	}
}

class Rectangle2 implements Shape{
	
	private double length,width;
	
	public Rectangle2(double length,double width){
		
		this.length=length;
		this.width=width;
	}
	
	public double calculatearea() {
		
		return length*width;
	}
	
}

public class Area {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the base of the triangle:");
		double base=sc.nextDouble();		
		System.out.print("enter the height of the triangle:");
		double height=sc.nextDouble();
		Shape triangle=new Triangle(base,height);
				
		System.out.print("enter the length of the Rectangle:");
		double length=sc.nextDouble();		
		System.out.print("enter the width of the Rectangle:");
		double width=sc.nextDouble();
		Shape rectangle=new Rectangle2(length,width);
		
		System.out.println("The area of the triangle:"+triangle.calculatearea());
		System.out.println("The area of the Rectangle:"+rectangle.calculatearea());
		
		sc.close();
	}
	

}
