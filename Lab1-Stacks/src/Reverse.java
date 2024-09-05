import java.util.Arrays;

/**
 * @author Rayyan Shariff
 *
 */
public class Reverse {

	// Part 2
	/**Reverses the elements in the array
	 * @param arr the array of type string which is being passed as a parameter to be reversed
	 */
	public static void reverse(String[] arr){ 

		Stack st = new Stack();
		
		for(int i=0; i<arr.length; i++) {
			st.push(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = st.pop().toString(); 		
		}
	}
	
}
