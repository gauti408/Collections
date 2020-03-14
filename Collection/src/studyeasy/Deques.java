package studyeasy;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Deques {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		deque.offer(1);
		deque.offer(2);
		deque.offer(5);
		deque.offer(3);
		
		for(Integer name : deque) {
			System.out.println(name);
		}
		System.out.println("*************");
		
		deque.addFirst(0);
		deque.addLast(9);
		for(Integer name : deque) {
			System.out.println(name);
		}

	}

}
