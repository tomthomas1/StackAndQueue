package com.bridgelabz;

/**
 * In this class we have defined the services of the Stack;
 * Procedure:
 * 1. We have created a method isEmpty to check if the LinkedList or Stack is empty or not.
 * 2. We have created the push method to push the data to the Stack.
 * 3. Method pop to delete the top element
 * 4. Method peek to check the top element
 * 5. Method display to print the stack
 */
public class StackServices {
	//the head is head of LinkedList and top for Stack
	public static Node head;
	
	/**
	 * [1] Method to check if the stack is empty
	 * 1. If head is null then it will return true.
	 * 2. If not null then will return false
	 * @return
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * [2] Method to push data to the stack.
	 * 1. First we have created a new node for the data
	 * 2. If Stack is empty then we will make the new node as head
	 * 3. If elements exists then the newNode next will point to the current head
	 * 4. And the newNode will be new head.
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	/**
	 * [3] Method pop to delete the top element
	 * 1. We assign the top as the data of head
	 * 2. We delete the top element as making the next element as head.
	 * 3. And then we return the top
	 * @return : we are deleting and returning the top element
	 */
	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top = head.data;
		head = head.next;
		return top;
	}

	/**
	 * [4] Method peep to check the top element
	 * 1. In this we return the head data as it is the top element. 
	 * @return: we return the head data
	 */
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}
	
	/**
	 * [5] Method to print the stack
	 * 1. In this we display the peek method and then we pop the top element
	 * 2. We continue till the stack is empty
	 */
	public void display() {
		while(!isEmpty()) {
			System.out.println(peek());
			pop();
			
		}
	}

}

