import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author Rayyan Shariff
 *
 */
public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testSizeEmpty() {
		// test l.size() for an empty linked list
		assertEquals(0, l.size());
		
	}

	@Test
	public void testSizeMany() {
		// test l.size() after adding some numbers to the linked list
		l.addAtHead(1);
		l.addAtTail(2);
		assertEquals(2, l.size());

	}
	
	@Test
	public void testSizeTwice() {
		// test l.size() twice after adding some numbers to the linked list
		l.addAtHead(1);
		l.addAtTail(2);
		assertEquals(2, l.size());
		
		l.addAtHead(3);
		l.addAtTail(4);
		assertEquals(4, l.size());
			
	}

	@Test
	public void testTotalEmpty() {
		// test l.total() for an empty linked list
		assertEquals(0, l.total());
		
	}

	@Test
	public void testTotalMany() {
		// test l.total() after adding some numbers to the linked list
		l.addAtHead(2);
		l.addAtTail(2);
		l.addAtHead(2);
		
		assertEquals(6, l.total());
		
	}
	
	@Test
	public void testTotalTwice() {
		// test l.total() twice after adding some numbers to the linked list
		l.addAtHead(2);
		l.addAtTail(2);
		l.addAtHead(2);
		
		assertEquals(6, l.total());
		assertEquals(6, l.total());
		
	}
	
	/*
	 * Optional part
	 */
	
//	@Test
//	public void testReverse() {
//		l.addAtHead(5);
//		l.addAtHead(2);
//		l.addAtHead(10);
//		l.reverse();
//		assertEquals(5, l.removeAtHead());
//		assertEquals(2, l.removeAtHead());	
//		assertEquals(10, l.removeAtHead());	
//	}

}
