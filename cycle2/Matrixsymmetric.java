package tkm;
import java.util.Scanner;

public class Matrixsymmetric {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
			   	System.out.print("Enter the number of rows: ");
		        int row = sc.nextInt();
		        System.out.print("Enter the number of columns: ");
		        int col = sc.nextInt();
		        
		        int[][] arr = new int[row][col];
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		            	System.out.print("enter the value:");
		                arr[i][j] = sc.nextInt();
		            }
		        }


		        System.out.println("The matrix is:");
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }
		        boolean isSymmetric = true;
		        for (int i = 0; i < row; i++) {
		            for (int j = 0; j < col; j++) {
		                if (arr[i][j] != arr[j][i]) {
		                    isSymmetric = false;
		                    break;
		                }
		            }
		            if (!isSymmetric) {
		                break;
		            }
		        }

		        if (isSymmetric) {
		            System.out.println("The matrix is symmetric.");
		        } else {
		            System.out.println("The matrix is not symmetric.");
		        }

		        sc.close();
		    }
		// TODO Auto-generated method stub

	}


