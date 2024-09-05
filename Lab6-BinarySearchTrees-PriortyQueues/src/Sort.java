
public class Sort {

	/*
	 * Part 4: complete method
	 */
	/**Method that sorts the given array using a priority queue
	 * @param arr array of type int 
	 */
	public static void sort(int[] arr){
		//Instantiate a priority queue of size of the array
		PriorityQueue pq = new PriorityQueue(arr.length);
		
		//iterates thru the array and inserts the value into the priority queue
		for(int i=0; i<arr.length; i++) {
			pq.insert(arr[i]);
		}
		
		//adds the lowest vale to the array
		for(int j=0; j<arr.length; j++) {
			arr[j] = pq.removeMin();
		}

	}
	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Sort.sort(arr);
		// should be printed in order
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}
