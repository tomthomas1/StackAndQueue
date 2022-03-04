package com.bridgelabz;

/**
 * In this class we have defined the services of the Queue;
 * Procedure:
 * 1. We have created a method isEmpty to check if the LinkedList or Queue is empty or not.
 * 2. We have created the enqueu method to add the data to the Queue .
 * 3. Method dequeue to delete the head element
 * 4. Method peek to check the head element
 * 5. Method display to print the Queue
 */
public class QueueServices {
	// we have defined 2 variable as in queue we will require a head and tail. We will add from tail and remove from head
	static Node head = null;
	static Node tail = null;

	/**
	 * [1] Method to check if the Queue is empty
	 * 1. If head and tail is null then it will return true.
	 * 2. If not null then will return false
	 * @return
	 */
	public boolean isEmpty() {
		return head == null & tail == null;
	}

	/**
	 * [2] Method to add data to the Queue.
	 * 1. First we have created a new node for the data
	 * 2. If Queue is empty then we will add tail and make the tail as head
	 * 3. If elements exists then the tail next will point to newNode
	 * 4. And the newNode will be tail now.
	 * @param data
	 */
	public void enqueu(int data) {
		Node newNode = new Node(data);
		if (tail == null) {
			tail = head = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	/**
	 * [3] Method dequeue to delete the head 
	 * 1. First we check if it is empty
	 * 2. Then we create variable front and assign head data to it.
	 * 3. If there is only 1 element then head == tail so we will make the tail null
	 * 4. Or we will make the head as head.next and then return front
	 * @return : we are deleting and returning the top element
	 */
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int front = head.data;
		if (head == tail) {
			tail = null;
		}
		head = head.next;
		return front;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	public void display() {
		System.out.println("Elements in the queue are : ");
		while(!isEmpty()) {
			System.out.println(peek());
			dequeue();
		} 
	}
}
