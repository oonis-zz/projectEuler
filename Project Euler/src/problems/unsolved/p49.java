package problems.unsolved;

import java.util.Arrays;
import java.util.ArrayList;
import util.Methods;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p49 implements Problem{
    public static void main(String[] args){
        System.out.println( "Solution::" + new p49().run() );
        
        
        
    }
    
    @Override
    public String run(){
        ArrayList<Integer> primes= new ArrayList<Integer>();
        primes = Methods.listPrimes(10000-1);
        
        return "";
    }
    
    @Override
    public String getTitle(){
        return "Prime permutations";
    }
    
    @Override
    public int getID(){
        return 49;
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
