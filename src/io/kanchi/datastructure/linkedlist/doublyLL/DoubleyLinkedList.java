package io.kanchi.datastructure.linkedlist.doublyLL;

import io.kanchi.datastructure.linkedlist.LinkedList;

public class DoubleyLinkedList<T> {

	Node<T> head;


	DoubleyLinkedList(){
		head = null;
	}


	void insert(T data) {
		Node<T> newNode = new Node<T>(data);

		if(head == null) {
			head = newNode;
		}
		else {
			Node<T> currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			newNode.previous = currentNode;
			currentNode.next = newNode;

		}
	}

	T remove(T data) {
		if(head == null) {
			System.out.println("Empty List");
			return null;
		}

		if(head.data == data) {
			head = head.next;
			head.previous = null;
			return head.data;
		}

		Node<T> currentNode = head;
		Node<T> previousNode;
		Node<T> temp;

		while(currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
			if(currentNode.data == data) {
				temp = currentNode.next;
				previousNode.next = temp;
				if(temp != null) {
					temp.previous = previousNode;

				}
				return currentNode.data;
			}
		}

		System.out.println("Key not found");
		return null;
	}

	void print() {
		Node<T> currentNode = head;
		if(head==null)
			return;
		System.out.println("------Print-----");
		while(currentNode != null) {
			System.out.println("Elemnts are " + currentNode.data);
			currentNode = currentNode.next;
		}


	}

	void reversePrint() {
		Node<T> currentNode = head;
		if(head==null)
			return;
		System.out.println("-------Print in Reverse Order-----");
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}

		while(currentNode != null) {
			System.out.println("Elemnts are " + currentNode.data);
			currentNode = currentNode.previous;
		}

	}

	public static void main(String[] args) {
		DoubleyLinkedList<String> list = new DoubleyLinkedList<>();
		list.insert("First");
		list.insert("Second");
		list.print();
		list.remove("Second");
		list.insert("Third");
		list.reversePrint();

	}

}
