/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.solved;

import util.Problem;
import util.Methods;
import java.math.BigInteger;

/**
 *
 * @author Sam
 */
public class p56 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p56().run() );
    }
    
    @Override
    public String run(){
        BigInteger currPow = BigInteger.ZERO;
        int max = -1;
        for( int a = 1; a < 100; a++ ){
            for( int b = 1; b < 100; b++ ){
                currPow = BigInteger.valueOf(a).pow(b);
                max = Math.max( Methods.sumDigits(currPow), max ); // See if this is larger than our current max
            }
        }
        
        return Integer.toString( max );
        
    }
    
    @Override
    public String getTitle(){
        return "Powerful digit sum";
    }
    
    @Override
    public int getID(){
        return 56;
    }
    
}
