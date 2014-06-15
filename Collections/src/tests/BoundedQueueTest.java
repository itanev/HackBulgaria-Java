package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercises.BoundedQueue;

public class BoundedQueueTest {
	private BoundedQueue<Integer> queue;

	@Test
	public void test() {
		queue = new BoundedQueue<>(3);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		assertTrue(queue.toString().equals("1,2,3"));
	}

}
