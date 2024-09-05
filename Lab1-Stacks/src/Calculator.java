// exception used for Q5
class CalculateException extends RuntimeException {
	public CalculateException(String err) {
		super(err);
	}
}

/**
 * @author Rayyan Shariff
 *
 */
public class Calculator {
	/*
	 * Methods for Part 3
	 */

	// Deceleration of variables
	private static int result, stackCalculation;

	/**The method which does all the main calculation and calls all the other methods.
	 * It first creates a new stack and reverses the elements in the array and pushes it back to the stack. 
	 * Then it iterates through the stack and checks if its a number or an operator. 
	 * If its a number, then it pushes the number to the stack.
	 * If it is an operator, then you pop the first two elements of the stack and apply the applyOp method with the operator and it then pushes the answer back. 
	 * @param cmds the array of type string which contains either an operator or an operand
	 * @return stackCalculation the end result of the calculation
	 */
	public static int calculate(String[] cmds) {

		Stack pstack = new Stack(100);

		Reverse.reverse(cmds);

		// iterating thru Reverse(cmds)
		for (int i = 0; i < cmds.length; i++) { 
			if (isNumber(cmds[i])) {
				pstack.push(cmds[i]);
			}

			else {
				stackCalculation = applyOp((String) pstack.pop(), cmds[i], (String) pstack.pop());
				pstack.push(Integer.toString(stackCalculation));
			}
		}
		return stackCalculation;

	}

	/**converts a string to an integer
	 * @param s the string which will be converted into an integer
	 * @return an integer
	 * @throws NumberFormatException if it cannot convert a string to an integer
	 */
	public static int convert(String s) throws NumberFormatException {
		return Integer.parseInt(s); 
	}

	/**checks if the given string is a number or an operator
	 * @param s the string which will used to check if its a number or not
	 * @return true if its a number
	 */
	public static boolean isNumber(String s) {
		try {
			convert(s);
			return true;
		} catch (NumberFormatException e) {
			return false;

		}
		
	}

	// apply the operator after converting the numbers
	/**checks which operator is being used either + or - and according to that the appropriate calculation takes place
	 * @param fst the first string number which will be converted into an integer and will be used for calculation
	 * @param op the operator, either + or -
	 * @param snd the second string number which will be converted into an integer and will be used for calculation
	 * @return result of the calculation
	 */
	public static int applyOp(String fst, String op, String snd) {
		if (op.equals("+")) {
			result = convert(fst) + convert(snd);
		}
		else if (op.equals("-")) {
			result = convert(fst) - convert(snd);
		}
		return result;

	}

	// main operation to calculate using Polish notation directly
	public static int calculatePolish(String[] cmds) {
		return -1;

	}

}
