import java.util.Scanner;

/**
 *  This program is designed to ask the user for a number and display the 
 *  number's next power of two
 *  
 *  @author mkrtschjan
 *	Due 09/18/2020
 */

public class PowerOfTwo {
	public static void main(String[] args) {
	
		int userNumber;				// To hold number provided by user
		int count = 0;			    // To hold count of bitwise operation
		int exponent = 0;			// To hold exponent value
		long powerOfTwo = 0;		// To hold the value of the next power of 2
		
		//To ask user for input of an integer within certain limits
		Scanner keyboard = new Scanner(System.in);
	 
		System.out.print("Please type an integer between 0 and 1073741824: "); 
		
		//To assign user input
		userNumber = keyboard.nextInt();
				
		//To use bitwise operation and increment exponent
		while(userNumber > 0) {
		
			if((userNumber & 0x01) > 0) {	
				++count;
			}
			
			userNumber = userNumber >> 1;
			++exponent;
		} //while
		
		//To check if user input is a power of 2 and adjust exponent value
		if (count == 1) {
			powerOfTwo = (long) Math.pow(2, --exponent);
		}
		else {
			assert(count != 1);
			powerOfTwo = (long) Math.pow(2, exponent);
		}
		
		//To display results to user
		
		if (count ==1) {
			System.out.printf("\nThere is %d binary 1s in the number's binary "
					+ "format.\n", count);
		}
		else {
			assert (count != 1);
			System.out.printf("\nThere are %d binary 1s in the number's binary "
						+ "format.\n", count);
		}
		
		System.out.printf("\nThe next power of two is 2^%d = %d.\n", exponent, 
						powerOfTwo);
		System.out.printf("\nThe exponent value is %d.\n", exponent);
		
		keyboard.close();
	} //main
} //Class
