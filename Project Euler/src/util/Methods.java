package util;

import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Sam
 */
public class Methods {
    
    private static boolean isPrime( int n ){
        if( n < 2 )
            return false;
        
        double maxIteration = Math.ceil( Math.sqrt(n) );
        for( int i = 2; i < maxIteration; i++ ){
            if( n % i == 0 )
                return false;
        }
        return true;
    }
    
    public static ArrayList listPrimes( int n ){
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2); primes.add(3);
        
        int counter = 4;
        int temp;
        
        while( primes.size() < n ){
            if( counter % 2 != 0 && counter % 3 != 0 ){
                temp = 4;
                while( temp*temp <= counter ){
                    if( counter % temp == 0 )
                        break;
                    temp++;
                }
                if( temp*temp > counter ){
                    primes.add( counter );
                }
            }
            counter++;
        }
        
        return primes;
        
    }
    
    public static String reverseString( String s ){
        return new StringBuilder(s).reverse().toString();
    }
    
    public static boolean isPalindrome( String num ){
        return num.equals( reverseString(num) );
    }
    
    // Maybe generalize this away from BigInteger if needed later
    public static int sumDigits( BigInteger n ){
        int sum = 0;
        String s = n.toString();
        for( int i = 0; i < s.length(); i++ ){
            sum += ( s.charAt(i)-'0' );
        }
        return sum;
    }
    
    public static boolean sameDigits( int x, int y ){
        char[] xDigits = Integer.toString( x ).toCharArray();
        char[] yDigits = Integer.toString( y ).toCharArray();
        
        // Sort the char array
        Arrays.sort( xDigits );
        Arrays.sort( yDigits );
        
        return Arrays.equals( xDigits, yDigits );
    }
    
    
}
