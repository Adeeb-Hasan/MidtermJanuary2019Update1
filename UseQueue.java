package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue q = new LinkedList();
		for (int i = 0; i <10; i++){
			q.add(i);
		}

		System.out.println("Queue: " + q);
		q.remove(); //removes the first inserted element.
		System.out.println("q after removed element: " + q);
		System.out.println("Peek: " + q.peek());
	}
}
