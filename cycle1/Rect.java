package tkm;
import java.util.Scanner;
public class Rect {
		
	double length;
	double width;
	
  //default value is 1 
	Rect(){
		this.length=1.0;
		this.width=1.0;
	}
	
	public Rect(double length,double width) {
		this.length=length;
		this.width=width;	
	}
	
	double area;
	double perimeter;
	
	public double checkarea() {		
		return length*width;
	}
	
	
	public double checkperi() {		
		return 2*(length+width);
	}


	public void display() {
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Area: "+checkarea());
		System.out.println("Perimeter: "+checkperi());
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Rect R1=new Rect();
		R1.display();
	
		System.out.print("enter thge length:");
		double len=sc.nextDouble();	
		
		System.out.print("enter thge width:");
		double wid=sc.nextDouble();	
		
		Rect R2=new Rect(len,wid);
		R2.display();
		
			
	}

}
