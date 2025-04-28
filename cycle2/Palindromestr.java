package tkm;
import java.util.Scanner;
public class Palindromestr {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        str = str.toLowerCase().replaceAll("\\s", "");

        int length=str.length();
        int i=0;
        while(i<length/2){
        	
            if(str.charAt(i)!=str.charAt(length-i-1)) {
                System.out.println("The string is not a palindrome");
                return; 
            }
            i++;
        }
        System.out.println("The string is a palindrome.");
	}

}
