package com.bridgelabz;
/**
 * Main method for the Queue
 * We have called the methods in the main class
 * @author Tom
 *
 */
public class Queue {
	public static void main(String[] args) {

		/**
		 * Created a object of service class and called the method
		 */
		QueueServices queue = new QueueServices();
		queue.enqueu(56);
		queue.enqueu(30);
		queue.enqueu(70);

		queue.display();
		
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		

		

	}
}