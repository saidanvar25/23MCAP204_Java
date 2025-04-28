package tkm;
import java.util.Scanner;
class Bank{
	String accountNumber;
	String accountHolder;
	double balance;
	double amount;
	
	Bank(String accountNumber, String accountHolder, double balance,double amount) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.amount = amount;
    }
	
	public void deposit() {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println(" Invalid Amount");
		}
	}
	
	public void withdraw() {
		if(amount>balance) {
			System.out.println("Insufficient Balance ");
		}
		else if(amount>0) {
			balance-=amount;
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void displayAccountInfo() {
		System.out.println();
		System.out.println("--Account Details--");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Balance: "+balance);
		
	}
	
}
public class Accountf {

	public static void main(String[] args) {
		
			
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Account Number: ");
		String Ano = sc.nextLine();
		System.out.print("Enter the Account Holder Name: ");
		String Ana = sc.nextLine();
		System.out.print("Enter the Balance Amount: ");
		int ABa = sc.nextInt();
		
		System.out.println("If you want to Deposit Click 1 OR Withdraw Click 0");
		int ch = sc.nextInt();
		
		if (ch == 0 || ch == 1) {
		System.out.print("Enter the Amount: ");
		int Amt = sc.nextInt();
		Bank p1=new Bank(Ano,Ana,ABa,Amt);
		
		if(ch==1) {
			p1.deposit();
		}
		else {
			p1.withdraw();
		}
		
		p1.displayAccountInfo();
		}
		else {
			System.out.print("invalid choice,Enter 0 or 1");
		}
	}
		

	}

