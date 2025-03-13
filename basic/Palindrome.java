package tkm;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("enter the number =");
		int num=number.nextInt();
		int rem,rev=0;
		int orgnum=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		number.close();
	}

}
