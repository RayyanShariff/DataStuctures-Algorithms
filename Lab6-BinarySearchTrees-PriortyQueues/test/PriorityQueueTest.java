import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PriorityQueueTest {

	/*
	 * Part 1: complete
	 */
	
	PriorityQueue pq;
	
	@Before
	public void setup(){
		pq = new PriorityQueue(20);
	}
	
	@Test
	public void insertTestMin() {
		// insert a few numbers then test pq.min()
		pq.insert(6);
		pq.insert(2);
		pq.insert(1);
		pq.insert(5);
		assertEquals(1, pq.min());
	}
	
	@Test
	public void insertTestSize() {
		// insert a few numbers then test pq.size()
		pq.insert(6);
		pq.insert(2);
		pq.insert(1);
		pq.insert(5);
		assertEquals(4, pq.size());
	}

	@Test
	public void removeMinTest() {
		// step 1: add a few numbers to pq
		pq.insert(6);
		pq.insert(2);
		pq.insert(1);
		pq.insert(5);
		pq.insert(7);
		pq.insert(9);
		pq.insert(8);
		pq.insert(10);
		
		
		// step 2: call pq.removeMin() a few times to check
		//         numbers are returned in ascending order 
		assertEquals(1, pq.removeMin());
		assertEquals(2, pq.removeMin());
		assertEquals(5, pq.removeMin());
		
	}
	
	
	@Test(expected=PriorityQueueException.class)
	public void removeMinEmptyTest() {
		pq.removeMin();
	}
}	
