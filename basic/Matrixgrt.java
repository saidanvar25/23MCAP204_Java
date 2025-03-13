package tkm;
import java.util.Scanner;
public class Matrixgrt {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int biggestvalue = arr[0][0];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter values");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(biggestvalue < arr[i][j]) {
					biggestvalue = arr[i][j];
				}
			}
		}
		System.out.println("biggest value is :"+ biggestvalue);


	}

}
