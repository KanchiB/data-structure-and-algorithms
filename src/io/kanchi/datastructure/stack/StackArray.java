package io.kanchi.datastructure.stack;

import java.util.Arrays;

/** Stack Implementation using Array
 *
 */
public class StackArray {

	static final int MAX = 100;
	int arr[] = new int[MAX];
	private int top;

	StackArray() {
		top = -1;
	}

	boolean  isEmpty(){
		return (top == -1);
	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean push(int data){
		if(top >= (MAX -1)){
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			arr[top++] = data;
			System.out.println("Element pushed into Stack");
			return true;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack Underflow");
		}
		else {
			int d = arr[top--];
			return d;
		}

		return -1;
	}

	/**
	 * 
	 */
	public void print(){
		System.out.print("Elements in Stack ::: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i]);
		}
	}


	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(1);
		s.push(2);
		s.push(3);
		s.print();
		System.out.println(s.pop() + " Removed from stack");
		s.print();

	}

}
