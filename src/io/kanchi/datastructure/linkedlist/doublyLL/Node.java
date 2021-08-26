package io.kanchi.datastructure.linkedlist.doublyLL;



public class Node<T> {
	
	T data;
	Node<T> previous;
	Node<T> next;
	
	
	public Node(T data){
		this.data = data;
		this.previous = null;
		this.next= null;
	}
	
	
	

}
