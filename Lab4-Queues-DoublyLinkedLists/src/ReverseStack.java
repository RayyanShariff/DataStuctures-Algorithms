public class ReverseStack {


	
	/**Reverses a stack using only a queue
	 * @param st stack, which is being passed to be reversed
	 */
	public static void reverseStack(Stack st){
		
		//instantiating a queue
		Queue q = new Queue();
		
		//till the stack is empty, it will pop from the stack and enqueue it to the queue
		while(!st.isEmpty()) {
			q.enqueue(st.pop());
		}
		
		//till the queue is empty, it will dequeue from the stack and push it to the stack
		while(!q.isEmpty()) {
			st.push(q.dequeue());
		}
		

	}
	
	
	
	
}
