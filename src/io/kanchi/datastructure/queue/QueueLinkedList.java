package io.kanchi.datastructure.queue;

public class QueueLinkedList {

	Node front;
	Node rear;
	
	QueueLinkedList(){
		front = null;
		rear = null;
	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean enqueue(Object data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = rear = newNode;
		}
		else {
			rear.setNext(newNode);
		}

		System.out.println("Element Enqueued " + data);
		return true;
	}

	/**
	 * 
	 * @return
	 */
	public Object dequeue() {
		Object data =0;
		if(front == null) {
			System.out.println("Empty");
			return null;
		}
		else {
			data = front.getData();
			System.out.println("Element dequeued : " + data);
			front = front.getNext();
		}
		if(front == null) {
			rear = null;
		}

		return data;
	}

	public void print() {
		Node currentNode = front;
		while(currentNode.getNext() != null) {
			System.out.println("Elements : " + currentNode.getData());
			currentNode = currentNode.getNext();
		}

	}

	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();

		//Case : Empty
		queue.dequeue();

		//Insertion
		queue.enqueue(5);
		queue.enqueue(7);
		queue.print();

		//Insertionn and deletion
		queue.enqueue(2);
		queue.dequeue();
		queue.print();

		//Insertion including shifting of values
		queue.enqueue(11);
		queue.enqueue(3);
		queue.enqueue(6);
		queue.print();

	}


}
