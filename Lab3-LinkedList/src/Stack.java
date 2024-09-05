class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

/**
 * @author Rayyan Shariff
 *
 */
public class Stack {
	
	private class Node{
		int element;
		Node next;
		
		/**creates a node that has an element and next (the Node that this node links to)
		 * @param e the element of the node
		 * @param n the next node
		 */
		public Node(int e, Node n){
			element = e;
			next = n;
		}
		
		/**
		 * @return the element stored in the node
		 */
		public int getValue() {
			return element;
		}
		
		/**
		 * @return the Node that this node links to
		 */
		public Node getNext() {
			return next;
		}
	}
	
	// this is a reference to the head node of the linked list
	private Node top;
	
	// keep track of the number of elements in the stack
	private int size;
	
	/**creates a stack and sets the top to null and the size to 0
	 * 
	 */
	public Stack(){
		top = null;
		size = 0;
	}
	
	/**checks if the stack is empty
	 * @return true if top is equal to null
	 */
	public boolean isEmpty(){
		return top == null;
	}
	
	/**
	 * @return the number of items in the stack
	 */
	public int size(){
		return size; 
	}
	
	// part 3: complete
	/** Adds a new element to the stack
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o){
		Node newNode = new Node(o, top); //creates a new node and sets the element which is the argument provided by the user and next which is set to top
			top = newNode; //makes the newNode the top
			size++; //increases the size of the stack
		}

	
	
	// part 3: complete
	/** Removes an element from the top of the stack
	 * 
	 * @return the integer that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public int pop() throws StackException {
		if (top == null) {
			throw new StackException("stack is empty");
		} else {
			int temp;
			temp = top.getValue(); //gets the top value and assigns it to temp
			top = top.next; //assigns the next node as the top
			size--; //decreases the size of the stack

			return temp;
		}

	}
	
	// part 3: complete
	/** Returns the integer at the top of the stack
	 * 
	 * @return the integer at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public int top() throws StackException{
		if(top == null) {
			throw new StackException("stack is empty");
		}
		return top.getValue(); 
	}
	
	
	

}
