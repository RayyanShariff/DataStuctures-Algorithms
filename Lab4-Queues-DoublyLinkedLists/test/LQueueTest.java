import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	/**
	 * Checks if its empty or not when the queue is actually empty and expects to return true
	 */
	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		assertTrue(q.isEmpty());
		
	}
	
	/**
	 * Checks if its empty or not after enqueueing an element and expects to return false
	 */
	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		q.enqueue("A");
		
		// then test that q is not an empty queue.
		assertFalse(q.isEmpty());
		
		
	}

	/**
	 * Checks the size of an empty queue and expects 0
	 * 
	 */
	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		assertEquals(0, q.size());
		
		
	}
	
	/**
	 * Checks the size of queue after enqueueing 2 elements and expects to return 2 for the size of the queue
	 */
	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue
		q.enqueue("A");
		q.enqueue("B");

		// then test the size of the queue
		assertEquals(2, q.size());
		
	}

	/**
	 * Checks the front element of the queue after enqueueing 3 elements (A,B,C) and expects it to be "A"
	 */
	@Test
	public void testEnqueue() {
		// enqueue an element(s) to the queue
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");
		
		// then test that the correct element is at the front
		assertEquals("A", q.front());
	}
	
	/**
	 * Checks after enqueueing, if dequeuing a queue returns it in the correct order
	 */
	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue
		q.enqueue("A");
		q.enqueue("B");
		q.enqueue("C");

		// then check that they are returned in the
		// correct order with dequeue.
		assertEquals("A", q.dequeue());
		assertEquals("B", q.dequeue());
		assertEquals("C", q.dequeue());
		
	}
	
	/**
	 * Checks if an exception is raised when you dequeue from an empty queue
	 */
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		// try to dequeue an empty queue
		q.dequeue();
	}
	
	/**
	 * Checks if an exception is raised when you do q.front from an empty queue
	 */
	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		// try to get the front value of an empty queue
		q.front();
	}
}
