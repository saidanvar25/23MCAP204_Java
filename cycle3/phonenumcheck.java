package tkm;
import java.util.Scanner;

//Custom Exception for invalid phone numbers
class InvalidPhoneNumberException extends Exception {
 public InvalidPhoneNumberException(String message) {
     super(message);
 }
}

public class phonenumcheck {
		
		 public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
		        if (!phoneNumber.matches("\\d{10}")) { // Checks if the phone number has exactly 10 digits
		            throw new InvalidPhoneNumberException("Phone number must have exactly 10 digits.");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter your phone number: ");
		        String phoneNumber = scanner.nextLine();
		        
		        try {
		            validatePhoneNumber(phoneNumber);
		            System.out.println("Phone number is valid.");
		        } catch (InvalidPhoneNumberException e) {
		            System.out.println("Invalid phone number: " + e.getMessage());
		        } finally {
		            scanner.close();
		        }
		// TODO Auto-generated method stub

	}

}
