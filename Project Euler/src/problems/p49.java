/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems;

import java.util.Arrays;
import java.util.ArrayList;

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
