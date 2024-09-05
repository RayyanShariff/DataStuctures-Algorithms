public class LSearch {


	private class Node {
		private Entry value;
		private Node nextNode;

		public Node(Entry v) {
			value = v;
			nextNode = null;
		}

		public Entry getValue() {
			return value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}
	}

	// Holds a reference to the head of the list
	private Node headNode;

	public LSearch() {
		headNode = null;
	}

	public void addAtHead(Entry e) {
		Node newNode = new Node(e); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}
	
	/*
	 * Part 3: complete
	 */	
	/**Method that uses linear search on a linked list to find the name and return the corresponding phone number
	 * @param name passing the person's name to find the person's phone number
	 * @return the corresponding phone number for the name the user has chosen
	 */
	public int linearSearch(String name){
		// your code
		Node currentNode = headNode;
		while(currentNode != null) {
			if(currentNode.getValue().getName().equals(name))
				return currentNode.getValue().getNumber();
			currentNode = currentNode.nextNode;
			
		}
		return -1; 
	}
}
