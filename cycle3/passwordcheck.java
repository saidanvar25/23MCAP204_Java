package tkm;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class passwordcheck {
	
		
		public static void validatePassword(String password) throws InvalidPasswordException {
	        if (password.length() < 8) {
	            throw new InvalidPasswordException("Password must be at least 8 characters long.");
	        }
	     // Check if password contains at least one digit
	        if (!password.matches(".*\\d.*")) {  
	            throw new InvalidPasswordException("Password must contain at least one number.");
	        }
	     // Check if password contains at least one special character
	        if (!password.matches(".*[$#&)].*")) {  
	            throw new InvalidPasswordException("Password must contain at least one special character ($, #, &, or )).\"");
	        }
		}
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();
	        
	        try {
	            validatePassword(password);
	            System.out.println("Password is valid.");
	        } catch (InvalidPasswordException e) {
	            System.out.println("Invalid password: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
		

	}

}
