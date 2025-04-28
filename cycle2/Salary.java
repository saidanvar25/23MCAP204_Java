package tkm;

 abstract class Employee{
	 
	 protected String name;
	 protected int id;
	 
	 public Employee(String name,int id){
		 
		 this.name=name;
		 this.id=id;
	 }
	 
	 public abstract double calculatesalary();
	 	 	
}
 
 class FullTimeEmployee extends Employee{
	 
	 double monthlysalary;
	 
	 public FullTimeEmployee(String name,int id,double monthlysalary){
		 
		 super(name,id);
		 this.monthlysalary=monthlysalary;
	 }
	 
	 public double  calculatesalary() {
		 return monthlysalary;
	 }
	 
 } 
 
 class PartTimeEmployee extends Employee {
	     double hourlyRate;
	     int hoursWorked;

	    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
	        super(name, id);
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	    }
	    
	    public double calculatesalary() {
	        return hourlyRate * hoursWorked;
	    }
	}


public class Salary {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 15, 5000.0);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 18, 10, 60);

        System.out.println("Salary of " + fullTimeEmp.name + ": $" + fullTimeEmp.calculatesalary());
        System.out.println("Salary of " + partTimeEmp.name + ": $" + partTimeEmp.calculatesalary());

	}

}
