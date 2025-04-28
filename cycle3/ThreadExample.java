package tkm;

//Class for generating Fibonacci numbers
class Fibonacci extends Thread {
 private int n;

 public Fibonacci(int n) {
     this.n = n;
 }

 @Override
 public void run() {
     int a = 0, b = 1, c;
     System.out.println("Fibonacci numbers:");
     System.out.print(a + " " + b + " ");
     for (int i = 2; i < n; i++) {
         c = a + b;
         System.out.print(c + " ");
         a = b;
         b = c;
     }
     System.out.println();
 }
}

//Class for displaying even numbers in a given range
class EvenNumbers extends Thread {
 private int start, end;

 public EvenNumbers(int start, int end) {
     this.start = start;
     this.end = end;
 }

 @Override
 public void run() {
     System.out.println("Even numbers between " + start + " and " + end + ":");
     for (int i = start; i <= end; i++) {
         if (i % 2 == 0) {
             System.out.print(i + " ");
         }
     }
     System.out.println();
 }
}

public class ThreadExample {

	public static void main(String[] args) {
		Fibonacci fibonacciThread = new Fibonacci(15);
	    EvenNumbers evenNumbersThread = new EvenNumbers(1, 30);

	    // Start Fibonacci thread first
	    fibonacciThread.start();
	    try {
	        fibonacciThread.join();  // Wait for Fibonacci to finish
	    } catch (InterruptedException e) {
	        System.out.println("Thread interrupted: " + e.getMessage());
	    }

	    // Then start Even Numbers thread
	    evenNumbersThread.start();
	    try {
	        evenNumbersThread.join();  // Wait for Even Numbers to finish
	    } catch (InterruptedException e) {
	        System.out.println("Thread interrupted: " + e.getMessage());
	    }

	    System.out.println("Both threads have finished execution.");
	}

}
