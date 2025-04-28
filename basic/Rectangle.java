package tkm;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length =");
		float length =scanner.nextFloat();

		System.out.println("enter the breadth =");
		float breadth =scanner.nextFloat();
		
		float area=length * breadth;
		float perimeter=2*(length*breadth);
		System.out.println("Area =" +area);
		System.out.println("perimeter =" +perimeter);
		scanner.close();

	}

}

