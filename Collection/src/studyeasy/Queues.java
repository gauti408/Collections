package studyeasy;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Queues {

	public static void main(String[] args) {
//		Queue<Integer> queue = new LinkedBlockingQueue<>();
		Queue<Integer> queue = new ArrayBlockingQueue<>(4);
		try {
			queue.remove();
		} catch (NoSuchElementException e1) {
			// TODO Auto-generated catch block
			System.out.println("queue is empty");
		}
		try {
			queue.add(1);
			queue.add(3);
			queue.add(2);
			queue.add(6);
			queue.add(5);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			System.out.println("String is full");
		}
		
		for(Integer number : queue) {
			System.out.println(number);
		}

	}

}
