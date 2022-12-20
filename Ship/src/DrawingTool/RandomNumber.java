/**
 * Provides a Random number generator.
 * 
 * @author Chidolue Zikora, Mohammad Raisul Hasan Shamim
 * @version 1.0
 */

package DrawingTool;

public class RandomNumber {
	
	public static int between(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1) + min);
	}
}