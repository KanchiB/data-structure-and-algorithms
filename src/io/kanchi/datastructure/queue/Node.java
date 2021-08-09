package io.kanchi.datastructure.queue;

public class Node {
	
	private Object data;
	private Node next;
	
	public Node(Object data){
		this.setData(data);
		this.setNext(null);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
