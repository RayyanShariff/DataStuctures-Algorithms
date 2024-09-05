
/**
 * @author Rayyan Shariff
 *
 */
public class LinkedList {

	private class Node {
		private int value;
		private Node nextNode;

		/**creates a node that has a value and nextNode (the node that this node links to)
		 * @param i the value of the node
		 */
		public Node(int i) {
			value = i;
			nextNode = null; 
		}

		// returns the value stored in the node
		public int getValue() {
			return value;
		}

		// sets the value stored in the node
		public void setValue(int i) {
			value = i;
		}

		// Returns the Node that this Node links to
		// Note this may return null
		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}

		// adds Node n to the tail of the list
		public void addNodeAtTail(Node n) {
			if (this.nextNode == null) {
				this.nextNode = n;
			} else {
				this.nextNode.addNodeAtTail(n);
			}
		}

		public Node removeAtTail(Node valueAtTail) {
			if (this.nextNode == null) { // if this is the last node
				valueAtTail.setValue(this.getValue()); // copy out the value
				return null; // return null
			} else { // move onto the next Node
				this.nextNode = this.nextNode.removeAtTail(valueAtTail);
				return this;
			}

		}
	} // End of Node Class implementation

	private Node headNode; // Holds a reference to the head of the list

	public LinkedList() {
		headNode = null;
	}

	/**adds a new node to the head of the linked list
	 * @param i the value of the node
	 */
	public void addAtHead(int i) {
		Node newNode = new Node(i); 
		newNode.setNextNode(headNode); 
		headNode = newNode; // the newNode becomes the head node
	}

	/**creates a new node and adds it to the tail of the linked list
	 * @param i the value of the node
	 */
	public void addAtTail(int i) {
		Node newNode = new Node(i); //creates a new node and sets the value
		if (headNode == null) { //if headNode is equal to null
			headNode = newNode; // then the newNode becomes the headNode
		} else {
			headNode.addNodeAtTail(newNode); //adds newNode to the tail of the list by using recursion
		}
	}

	/*
	 * removes and returns the value at the head of the list
	 * note, this may return -1 if the list is empty
	 */ 
	public int removeAtHead() {
		if (headNode == null) {
			return -1; // return -1 if the list is empty
		} else {
			Node returnedNode = headNode;
			headNode = headNode.getNextNode();
			return returnedNode.getValue();
		}
	}

	/*
	 * See https://web.microsoftstream.com/video/5a15e714-bf98-4bf6-9124-573638723795
	 */
	public int removeAtTail() {
		if (headNode == null) {
			return -1;
		} else {
			Node returnedNode = new Node(-1);
			headNode = headNode.removeAtTail(returnedNode);
			return returnedNode.getValue();
		}
	}

	/*
	 * PART 2: complete the following methods
	 */

	/** The number of nodes in the linked list, and 0 for an empty linked list. 
	 * @return the number of nodes in the linked list
	 */
	public int size(){
		int count = 0;
		Node currentNode = headNode; //makes head node the current node 
		while(currentNode != null){ //iterates thru the nodes until currentNode is equal to null
			count++;
			currentNode = currentNode.nextNode;	//goes to the next node		
		}
		return count;
	}
	
	
	/** The sum of all integer nodes in the linked list, and 0 for an empty linked list.
	 * @return the sum of all nodes in the linked list
	 */
	public int total() {
		Node currentNode = headNode; // makes head node the current node
		int sum = 0;

		while (currentNode != null) { // iterates thru the nodes until currentNode is equal to null
			sum = sum + currentNode.getValue(); // gets the value of the current node and adds it to sum
			currentNode = currentNode.nextNode; // goes to the next node

		}
		return sum;
	}

	/*
	 * Optional: reverse the linked lists so that the first element becomes
	 * the last, the second becomes the second last, and so on.
	 */
	public void reverse(){
			
	}

}
