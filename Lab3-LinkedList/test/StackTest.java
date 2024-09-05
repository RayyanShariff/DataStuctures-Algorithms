import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {
	
	Stack st;
	@Before
	public void setup()
	{
		st = new Stack();
	}

	@Test
	public void testPush() {
		//test the size and top of an non-empty stack
		assertEquals(0,st.size());
		st.push(10);
		assertEquals(1,st.size());
		assertEquals(10,st.top());
	}
	
	@Test
	public void testPushPopEmpty() {
		//test if the stack is empty or not after pushing and popping
		st.push(10);
		st.pop();
		assertTrue(st.isEmpty());
	}

	@Test
	public void testTop() {
		//test top after pushing 2 elements into the stack and then popping one of them
		st.push(10);
		st.push(20);
		assertEquals(20,st.top());
		st.pop();
		assertEquals(10,st.top());
	}
	
	@Test
	public void testPushTopNotEmpty() {
		//test to see if top method removes an element or not
		st.push(10);
		st.top();
		assertFalse(st.isEmpty());
	}
	
	@Test
	public void testPop() {
		//test popping element from a stack
		st.push(10);
		st.push(20);
		assertEquals(20,st.pop());
		assertEquals(1,st.size());	
		assertEquals(10,st.pop());
		assertEquals(0,st.size());
	}
	
	@Test(expected = StackException.class)  
	public void testEmptyPop() { 
	  //test popping from an empty stack
	  st.pop();
	}
	
	@Test(expected = StackException.class)  
	public void testEmptyTop() {  
	  //test top method from an empty stack
	  st.top();
	}
	
}
