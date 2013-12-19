/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems;

import java.util.ArrayList;

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
        ArrayList<Integer> primes = new ArrayList<Integer>();
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
    
}
