package problems.solved;

import java.util.Arrays;
import java.util.ArrayList;
import util.Methods;

/**
 *
 * @author Sam
 */
public class p49 {
    public static void main(String[] args) {
        ArrayList<Integer> primes= new ArrayList<Integer>();
        primes = Methods.listPrimes(10000-1);
        
        
        
    }
    
    // This method will check to see if the two numbers have the same digits
    private static boolean checkSameDigits( int x, int y ){
        char[] xdigits = Integer.toString(x).toCharArray();
        char[] ydigits = Integer.toString(y).toCharArray();
        Arrays.sort(xdigits);
        Arrays.sort(ydigits);
        return Arrays.equals(xdigits, ydigits);
    }
    
    
}
