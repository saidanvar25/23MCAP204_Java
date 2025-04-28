package tkm;
import java.util.Scanner;
public class Replace {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        System.out.print("Enter word to replace: ");
	        String oldWord = sc.next(); 

	        System.out.print("Enter new word: ");
	        String newWord = sc.next();  

	        String updatedText = text.replace(oldWord, newWord);
	        System.out.println("Updated string: " + updatedText);
	        sc.close();

	        

	}
	
}
