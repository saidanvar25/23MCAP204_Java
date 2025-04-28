package tkm;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER THE RADIUS: ");
		float radius=obj.nextFloat();
		
		System.out.println("Area of Circle: "+3.14*radius*radius);
		System.out.println("Perimeter of Circle: "+2*3.14*radius);
		

	}

}
