
public class Queue {
	private int f; // front of queue
	private int r; // rear of queue
	private int capacity;
    private Object[] Q;
    private static int MAX = 100; 

    /**Creates a queue with given capacity
     * @param capacity the maximum capacity of the queue
     */
    public Queue(int capacity){
       this.capacity = capacity;
       Q =  new Object[capacity];
       f = 0;
       r = 0;
    } 

    /**
     * If the capacity is not mentioned then it sets the size to 100
     */
    public Queue(){
       this(MAX);
    }

    /**Calculates the size of the queue
     * @return the size of the queue
     */
    public int size(){
        return (Q.length - f + r) % capacity;
    }
    /**
     * @return boolean value if its empty or not
     */
    public boolean isEmpty(){
        return (f==r);
    }

    /**
     * @return the front element of the queue
     * @throws QueueException if the stack is empty
     */
    public Object front() throws QueueException {
        if (isEmpty())
           throw new QueueException("Queue is empty.");
        return Q[f];
     }

    /**Removes and returns the element at the front
     * @return the value of the element that is removed
     * @throws QueueException if the stack is empty
     */
    public Object dequeue() throws QueueException {
        if (isEmpty())
          throw new QueueException("Queue is empty.");
        Object tmp = Q[f];
        Q[f] = null;
        f = (f+1) % capacity;
        return tmp;
    }
    
    /**Adds object to the rear of the queue
     * @param e the element that you want to add or enqueue
     * @throws QueueException if the queue if full
     */
    public void enqueue(Object e) throws QueueException {
        if (size() == Q.length - 1)
          throw new QueueException("Queue is full.");
        Q[r] = e;
        r = (r+1) % Q.length;
    }

	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		if(size() > 0)
			buf.append(Q[f]);
		for(int i = 1; i < size();i++){
			buf.append(", " + Q[f + i % capacity]);
		}
		buf.append("]");
		return buf.toString();
	}
}
