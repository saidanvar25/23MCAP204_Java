package tkm;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		 
		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of terms : ");
	        int n = sc.nextInt();
	        
	        int a = 0, b = 1;
	        System.out.print(a + " " + b);

	        for (int i = 2; i < n; i++) {
	            int sum = a + b;
	            System.out.print(" " + sum);
	            a = b;
	            b = sum;
	        }
	}

}
