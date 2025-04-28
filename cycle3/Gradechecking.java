package tkm;

import java.util.Scanner;

//Custom exception for invalid grade
class InvalidGradeException extends Exception {
 public InvalidGradeException(String message) {
     super(message);
 }
}

public class Gradechecking {

 // Method to validate the grade
 public static void validateGrade(char grade) throws InvalidGradeException {
	 grade = Character.toUpperCase(grade);
     if (grade < 'A' || grade > 'F') {
         throw new InvalidGradeException("Invalid grade. Grade must be between 'A' and 'F'.");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Prompt user for grade input
     System.out.print("Enter the student's grade: ");
     char grade = scanner.next().charAt(0);
     
     try {
         // Validate the grade
         validateGrade(grade);
         System.out.println("The grade is valid.");
     } catch (InvalidGradeException e) {
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
