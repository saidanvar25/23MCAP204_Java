package tkm;

class SharedBuffer {
    private int data;
    private boolean available = false;

    // Producer calls this method
    public synchronized void produce(int value) {
        while (available) { // If data is already produced, wait
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer
    }

    // Consumer calls this method
    public synchronized void consume() {
        while (!available) { // If no data, wait
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // Notify producer
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {  // Produce 5 numbers
            buffer.produce(i);
            try {
                Thread.sleep(500); // Just to slow down the production
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) { // Consume 5 numbers
            buffer.consume();
            try {
                Thread.sleep(500); // Just to slow down the consumption
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {

	public static void main(String[] args) {
SharedBuffer buffer = new SharedBuffer();
        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.start();
        consumer.start();
	}

}
