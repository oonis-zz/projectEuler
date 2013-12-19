/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems.solved;

/**
 *
 * @author Sam
 */
public class p21 {
    public static void main(String[] args) {
        System.out.println( "Solution:: " + sum_amicable_pairs(1,10000) );
    }
    
    public static int sum_amicable_pairs( int low, int high ){
        int a = low;
        int b;
        int sum = 0;
        
        while( a <= high ){
            b = sum_divisors( a );
            if(b > a && sum_divisors(b) == a)
                sum += ( a + b );
            a++;
        }
        return sum;
        
    }
    
    public static int sum_divisors( int n ){
        int s = 0;
        int i = 1;
        while( i < n ){
            if( n % i == 0 )
                s += i;
            i++;
        }
        return s;
    }
    
}
