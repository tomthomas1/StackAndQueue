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
			tail = newNode;
			head = newNode;	
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
		//if single element in LinkedList
		if (head == tail) {
			tail = null;
		}
		head = head.next;
		
		return front;
	}

	/**
	 * [4] Method peep to check the head or first element
	 * 1. In this we return the head data as it is the first element. 
	 * @return: we return the head data
	 */
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	/**
	 * [5] Method to print the Queue
	 * 1. If head is null then the Queue is empty
	 * 2. Here we are printing the current node data and update it. 
	 */
	public void display() {
		if(head == null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Data in the queue is: ");
		//we are not moving the head to traverse. We are assigning the currNode to head as changing the currNode
		Node currNode = head;
		//Here we are traversing till the currNode is not null and then display the data of currNode 
		while(currNode!= null) {
			System.out.println(currNode.data);
			// then we are incrementing the currNode to next
			currNode = currNode.next;
		}
		} 
	}

