public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	/**Method that returns the corresponding phone number of the name if it exists in the catalogue array of Entry objects
	 * @param name passing the person's name to find the person's phone number
	 * @return the corresponding phone number for the name the user has chosen 
	 */
	public int linearSearch(String name){
		// your code
		//Iterates thru the catalogue array until it finds the name that you are searching for and returns its corresponding phone number
		//else if it doesn't then it returns -1
		for(int i = 0; i<current; i++) {
			if(catalogue[i].getName().equals(name)) {
				return catalogue[i].getNumber();
			}
		}
		return -1;
	}

	/*
	 * Part 4: complete implementation
	 */
	/**Method that uses binary search on an array to find the name and return the corresponding phone number
	 * @param first left-most array index 0 to initialise the search
	 * @param last right-most array index current-1, which is the index position with the last entry in the catalogue array
	 * @param name passing the person's name to find the person's phone number
	 * @return the corresponding phone number for the name the user has chosen
	 */
	private int binarySearch(int first,int last,String name){
		// your code
		if(first>last)
			return -1;
		else {
			//splits the search space in half with each recursive call
			int middle = (first+last)/2;
			String middle_name = catalogue[middle].getName();
			
			//compares the searched name with middle value
			if(middle_name.equals(name))
				return catalogue[middle].getNumber();
			
			//If the searched for name is alphabetically smaller than the name of the middle entry, the recursive binary search focuses on the bottom half of the catalogue
			else if(catalogue[middle].getName().compareTo(name) > 0)
				return binarySearch(first, middle-1, name);
			
			//If the searched for name is alphabetically larger than the name of the middle entry, the recursive binary search focuses on the top half of the catalogue
			else {
				return binarySearch(middle+1, last, name);
			}
		}
		
	}

	// helper method exposed to the programmer
	public int binarySearch(String name){
		return binarySearch(0,current-1,name);
	}
	
	
}
