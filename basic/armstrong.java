package tkm;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number =");
		int num=sc.nextInt();
		int orgnum=num;
		double rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+Math.pow(rem, 3);
			num=num/10;
			
		}
		if(orgnum==sum) {
			System.out.print("its a armstrong number");
		}
		else {
			System.out.print("its not a armstrong number"+sum);
		}
		sc.close();
	}

}
