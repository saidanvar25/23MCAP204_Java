package tkm;
import java.util.Scanner;
class Student{
	
	int studentId;
	String name;
	double mark;
	
	
	Student(int studentId,String name,double mark){
		this.studentId=studentId;
		this.name=name;
		this.mark=mark;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+name);
		System.out.println("Student Mark: "+mark);
		System.out.println();
	}
	
	public void check() {
		if(mark>=40) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}

public class pass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		
		while(i==1) {
			System.out.print("Enter the Student_ID: ");
			int Sid=sc.nextInt();
			
			System.out.print("Enter the Student_Name: ");
            String Sna = sc.nextLine(); 
            sc.nextLine();
            
			System.out.print("Enter the Mark: ");
			double Sm=sc.nextDouble();
			
			Student s1=new Student(Sid,Sna,Sm);
			s1.display();
			s1.check();
			
			System.out.print("\n Do you want to check another Student \n If yes Press 1 Else Press0: ");
			i=sc.nextInt();
			if(i==0) {
				System.out.println("---Exited---");
			}
		}// TODO Auto-generated method stub

	}

}
