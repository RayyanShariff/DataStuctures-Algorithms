/**
 * @author Rayyan Shariff
 *
 */
public class Recursion {

	// Part 1: complete
	/**Method that sums when given a number n and returns the sum of all positive numbers up to n 
	 * @param n the number that you want to add till
	 * @return the sum of all positive numbers up to n
	 */
	public static int sum(int n){
		if(n <= 1) {
			return n;
		}
		else {
			return n + sum(n-1);
		}
		
	}

	// Part 1 complete
	
	/**Method that multiplies two integers using only Java’s addition operator +
	 * @param m the first int number 
	 * @param n the second int number
	 * @return the product of m and n
	 */
	public static int multiply(int m, int n){
		//Anything multiplied with 0, gives 0
        if (n == 0) {
            return 0;
        }
        
        //It makes n positive and m negative if n is negative 
        if (n < 0) {
            return -multiply(m, -n);
        }
        
        //Adds m together n number of times
        if (n > 0) {
            return m + multiply(m, n - 1);
        }
        
        else {
        	return 0;
        }
        
    }
	
	// Part 1: complete
	/**A method that returns a sequence of numbers where each number (Fibonacci number) equals the sum of the two numbers before it 
	 * @param n the number where you want the sequence to end
	 * @return the nth Fibonacci number
	 */
	public static int Fibonacci(int n){
		if(n <= 1) {
			return n;
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2); 
		
		}
		
	}
	


}