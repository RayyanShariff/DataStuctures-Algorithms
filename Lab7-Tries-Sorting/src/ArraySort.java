import java.util.ArrayList;
import java.util.Iterator;

public class ArraySort {

	/** Insertion sort of an array
	 * @param arr the array to be sorted in-place
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int cur = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > cur) {
				arr[j + 1] = arr[j--];
				arr[j + 1] = cur;
			}
		}
	}

	/** Insertion sort of an array
	 * 
	 * This is Question 3
	 * 
	 * @param arr the array to be sorted in-place
	 */
	public static void bubbleSort(int[] arr) {
		boolean swaps = true;
		//holds state of boolean as true 
		
		if(arr.length == 0) {
			swaps = false;
		}
		
		while(swaps) {
			//step through the array from beginning to end (minus the last element)
				swaps = false;
				// it iterates thru the array 
				for(int j=0; j<arr.length-1; j++) {
					
					//compares index j value with index j+1 value 
					if (arr[j]> arr[j + 1]) {
						
						//temp holds value of index j
						int temp = arr[j];
						
						//index j hold value index j+1
						arr[j] = arr[j + 1];
						
						//index j+1 hold value temp 
						arr[j + 1] = temp;
						
						//state of boolean set of true 
						swaps = true;
			
						
					}
				}
			}
		}

	

	// Part 5 : complete implementation
	/**Quick sort of an ArrayList
	 * @param S Arraylist thats need to be sorted
	 * @return a sorted version of the input array
	 */
	public static ArrayList<Integer> quickSort(ArrayList<Integer> S) {
		//If the size of (input) S is less than or equal to one, then S is sorted so you can return
		//base case
		if(S.size() <= 1) {
			return S;
		}
		
		//Select an element of S to be the pivot
		int mid = (int) S.size() / 2;
		int pivot = S.get(mid);
		
		//Create 3 new ArrayLists (holding values of type Integer
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		
		// While ArrayList is not empty
		// get and delete the first element and add it to one of lesser, equal and greater, according to how it compares with the pivot
		while(S.size() != 0) {
			for(int i=0; i<S.size(); i++) {
				if(S.get(i) > pivot) {
					G.add(S.get(i));
				}
				else if (S.get(i) < pivot) {
					L.add(S.get(i));
				}
				else E.add(S.get(i));
				S.remove(i);
			}
		}
		
		//recursively perform quick sort on lesser and greater and assign those sorted lists into newArrayLists called sortedLesser and sortedGreater
		ArrayList<Integer> sortedL = quickSort(L);
		ArrayList<Integer> sortedG = quickSort(G);
		
		//Create a new empty ArrayList called result then combine all three sorted ArrayLists into this ArrayList in order
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.addAll(sortedL);
		result.addAll(E);
		result.addAll(sortedG);
		

		return result; 
	}

	
	/** predicate to check if array is sorted
	 * @param arr the array to be checked
	 * @return true if the array is sorted, false otherwise
	 */
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] > arr[i + 1])
				return false;
		return true;
	}

	
	/** predicate to check if arrayList is sorted.
	 *  Useful for checking ArrayList<Integer> lists returned
	 *  from Quick Sort.
	 * 
	 * @param arr the array to be checked
	 * @return true is the array is sorted, false otherwise
	 */
	public static boolean isSorted(ArrayList<Integer> arr) {
		Iterator i = arr.iterator();
		int val;
		if (i.hasNext())
			val = (int) i.next();
		else
			return true;
		while (i.hasNext()) {
			int nv = (int) i.next();
			if (val > nv)
				return false;
			val = nv;
		}
		return true;
	}

	
	/** Helper printing methods for testing
	 * @param arr the array to print
	 */
	private static void printIntArray(int[] arr) {
		System.out.print("[ ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	private static void printIntArrayList(ArrayList<Integer> arr) {
		System.out.print("[ ");
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	public static void main(String[] args) {
		// testing part1
		int[] arr1 = { 5, 4, 3, 2, 1 };
		bubbleSort(arr1);
		printIntArray(arr1);

		// testing part2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(1);
		arr2.add(6);
		arr2.add(5);
		ArrayList<Integer> arr2_sorted = quickSort(arr2);
		printIntArrayList(arr2_sorted);
		// {5,4,3,5,1};

	}

}
