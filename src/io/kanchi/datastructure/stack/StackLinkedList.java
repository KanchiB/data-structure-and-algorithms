package io.kanchi.datastructure.stack;

import io.kanchi.datastructure.queue.Node;

/** Stack implementation using Linkedlist
 *
 */

public class StackLinkedList {

	private Node head;

	boolean isEmpty(){
		return (head==null);
	}

	/**
	 * 
	 * @param data
	 */
	void push(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		System.out.println("Element pushed" + data);
	}

	/**
	 * 
	 * @return
	 */
	Object pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			Object data = head.getData();
			head = head.getNext();
			System.out.println("Element popped : " + data);
			return data;
		}
	}

	/**
	 * 
	 */
	void print() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println("Element : " + currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(5);
		s.push(2);
		s.push(10);
		s.print();
		s.pop();
		s.print();
	}

}
