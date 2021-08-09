package io.kanchi.datastructure.queue;

/** Queue Array Implementation
 * 
 *  Insertion from rear and deletion from the front.
 * 
 */
public class QueueArray {

	private static final int DEFAULT_SIZE = 5;
	private Object[] arr;
	private int rear;

	QueueArray(){
		arr = new Object[DEFAULT_SIZE];
		rear = -1;
	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean enqueue(Object data) {

		if(rear == (DEFAULT_SIZE -1)) {
			System.out.println("Queue is full");
			return false;
		}

		arr[++rear] = data;
		System.out.println("Element Enqueued " + data);
		return true;
	}

	/**
	 * 
	 * @return
	 */
	public Object dequeue() {
		Object data =0;
		if(rear ==-1) {
			System.out.println("Queue is Empty");
		}
		else {
			data = arr[0];
			for( int i = 0; i < rear ; i++) {
				arr[i] = arr[i+1];
			}
			rear--;
			System.out.println("Element dequeued : " + data);
		}

		return data;
	}

	public void print() {
		for(int i = 0 ; i <= rear ; i++)
			System.out.println("Elements : " + arr[i]);

	}

	public static void main(String[] args) {
		QueueArray queue = new QueueArray();

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

		//Case : Full
		queue.enqueue(4);


	}

}
