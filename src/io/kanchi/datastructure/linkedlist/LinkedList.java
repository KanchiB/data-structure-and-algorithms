package io.kanchi.datastructure.linkedlist;

/**
 * 
 *
 * @param <T>
 */
public class LinkedList<T> {	

	private Node<T> head;

	/**
	 * @param list
	 * @param data
	 * @return
	 */

	public  LinkedList<T> insert(LinkedList<T> list, T data) {
		Node<T> newNode = new Node<T>(data);

		//Adding first element
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node<T> currentNode = list.head;
			while(currentNode.next !=null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		return list;
	}

	/**
	 * 
	 * @param list
	 * @param data
	 * @return
	 */

	public LinkedList<T> delete(LinkedList<T> list, T data) {
		Node<T> currentNode = list.head;
		Node<T> previousNode = null;


		//If first element has to be removed
		if(currentNode != null && currentNode.data == data) {
			list.head = currentNode.next;
			System.out.println("Element found and deleted");
			return list;
		}

		//To remove element in middle or end
		while(currentNode !=null) {

			previousNode = currentNode;
			currentNode = currentNode.next;

			if(currentNode !=null && currentNode.data == data) {
				previousNode.next = currentNode.next;
				System.out.println("Element found and deleted");
				return list;
			}
		}

		if(currentNode == null)
			System.out.println("Element not found");

		return list;
	}

	/**
	 * 
	 */

	public void print(LinkedList<T> list) {
		Node<T> currentNode = list.head;
		while(currentNode !=null) {
			System.out.println("Element : " + currentNode.data);
			currentNode = currentNode.next;
		}
	}

	/**
	 * 
	 * @param list
	 * @param data
	 * @return
	 */

	public boolean contains(LinkedList<T> list, T data) {
		Node<T> currentNode = head;

		while(currentNode.next !=null) {
			if(currentNode.data == data) {
				System.out.println("Element found");
				return true;
			}
			currentNode = currentNode.next;
		}

		return false;
	}

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.insert(list, "First");
		list.insert(list, "Second");
		list.print(list);
		list.delete(list, "Second");
		list.delete(list, "Third");
		list.print(list);

	}

}
