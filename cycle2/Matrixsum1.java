package tkm;
import java.util.Scanner;
public class Matrixsum1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = sc.nextInt();

	        int[][] arr = new int[rows][cols];
	        int[] rowSum = new int[rows];
	        int[] colSum = new int[cols];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Enter value: ");
	                arr[i][j] = sc.nextInt();
	            }
	        }

	        System.out.println("\n--- MATRIX ---");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                rowSum[i] += arr[i][j]; 
	                colSum[j] += arr[i][j];  
	            }
	        }

	    
	        System.out.println("\nSum of each row:");
	        for (int i = 0; i < rows; i++) {
	            System.out.println("Row " + (i + 1) + " sum: " + rowSum[i]);
	        }

	        System.out.println("\nSum of each column:");
	        for (int j = 0; j < cols; j++) {
	            System.out.println("Column " + (j + 1) + " sum: " + colSum[j]);
	        }


	}

}
