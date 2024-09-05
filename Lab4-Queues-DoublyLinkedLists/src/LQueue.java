public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		/**Creates a Node that has an element(value) and next (the node that this node links to)
		 * @param e element or value of the node
		 * @param n the next node
		 */
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		/**Creates a Node that has an element(value) and next that is set to null
		 * @param e element or value of the node
		 */
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	/**
	 * Creates a queue with the head and tail set to null
	 */
	public LQueue(){
		head = null;
		tail = null;	
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	/**
	 * @return true if its empty and false if its not
	 */
	public boolean isEmpty(){
		return (head == null);
	}
	
	// Part 3: complete
	/**
	 * @return the size of the queue 
	 */
	public int size(){
		return size;
	}
	
	// Part 3: complete
	/**adds object to the rear of the queue
	 * @param o the value of the newNode
	 */
	public void enqueue(Object o){
		//Creates new node
		Node newNode = new Node(o);

        //Enqueue empty queue
		if(isEmpty()) {
			
			//Set head and tail to point to new node
			head = newNode;
			tail = newNode;
			
		}else {// Enqueue non-empty queue
             //Set tail’s next element to the new node
			 tail.next = newNode;
			 
			 //Set tail to new node
			 tail = newNode;
		}
		//Increment size by one
		size++;

	}
	
	// Part 3: complete	
	/**remove and returns element at the front
	 * @return the element that is removed
	 * @throws QueueException if the queue is empty
	 */
	public Object dequeue() throws QueueException{
		// Check the queue isn’t Null
		if(head == null) {
			throw new QueueException("queue is empty");
		}else {
            //Get the first element
			Object temp;
			temp = head.element;
			
			//Set head to the next element of top
			head = head.next;
			
			//Decrement size by 1
			size--;
			
			//Set tail to NULL if new queue is empty
			if(head == null) {
				tail = null;
			}
			
			return temp;
			
		}
		
		
	}
	
	// Part 3: complete
	/**
	 * @return the front element
	 * @throws QueueException if the queue is empty
	 */
	public Object front() throws QueueException{
		if(head == null) {
			throw new QueueException("queue is empty");
		}else {
			return head.element;
		}
		
	}
	
}
