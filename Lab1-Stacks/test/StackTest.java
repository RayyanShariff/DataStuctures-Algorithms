import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author Rayyan Shariff
 */
public class StackTest {

	Stack st;
	@Before
	public void setup()
	{
		st = new Stack(2);
	}
	
	/*
	 * Part1: complete the following test methods as specified. 
	 * Note that you will need to add new methods in order to test that exceptions are thrown
	 */
	
	@Test
	public void testPushEmptySize() {
		// test the size of an empty stack (hint: test st.size() )
		assertEquals(0,st.size());
	}
	
	@Test
	public void testPushNonEmptySize() {
		st.push("A");
		st.push("B");
		// test the size of a non-empty stack
		assertEquals(2,st.size());
	}
	
	@Test
	public void testPopTwo() {
	    st.push("A");
		st.push("B");
		// step 1: test what st.pop() returns
		// step 2: test what st.pop() returns
		assertEquals("B",st.pop());
		assertEquals("A",st.pop());
		assertEquals(0,st.size());
	}
	
	@Test
	public void testTopTwo() {
		// step 1: test what st.top() returns
		// step 2: test what st.top() returns
		
		st.push(10);
		st.push(20);
		st.top();
		assertEquals(20,st.top());
		st.top();
		assertEquals(20,st.top());
	}
	
	
	@Test(expected = StackException.class)
	public void testEmptyPop() {
		// try popping from an empty stack
		st.pop();
	}

	@Test(expected = StackException.class)
	public void testFullPush() {
		// try pushing too many elements to the stack
		// (which has a capacity of 2 elements)

		st.push(10);
		st.push(20);
		st.push(30);
		
	}

}
