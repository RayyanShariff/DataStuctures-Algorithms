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
	private Object[] S;
	private int top;
	private int capacity;
	
	private static int DEFAULT_SIZE = 100;
	
	/**creates a stack with given maximum capacity
	 * @param size the maximum capacity of the stack
	 */
	public Stack(int size){
		capacity = size;
		S = new Object[size];
		top = -1;
	}

	/**
	 * creates a stack with default maximum capacity of 100
	 */
	public Stack(){
		this(DEFAULT_SIZE);
	}
	
	/**checks if the stack is empty
	 * @return true if there is no element in the stack or if the top < 0
	 */
	public boolean isEmpty(){
		return top < 0;
	}
	
	/**returns the number of elements in the stack
	 * @return the number of elements in the stack
	 */
	public int size(){
		return top+1; 
	}
	
	/**
	 * adds an object to the top of the stack
	 * @param e the object which is added to the stack at the top
	 */
	public void push(Object e){
		if(size() == capacity)
			throw new StackException("stack is full");
		S[++top] = e; //top = -1 initially so it adds first and makes it 0 and then assigns it
	}
	
	/**remove and returns the element at the top
	 * @return the object that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public Object pop() throws StackException{
		if(isEmpty())
			throw new StackException("stack is empty");
		return S[top--];
	}
	
	
	/**returns the element at the top of the stack
	 * @return the element at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public Object top() throws StackException{
		if(isEmpty())
			throw new StackException("stack is empty");
		return S[top];
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		if(size() > 0)
			buf.append(S[0]);
		for(int i = 1; i <= top;i++){
			buf.append(", " + S[i]);
		}
		buf.append("]");
		return buf.toString();
	}
}
