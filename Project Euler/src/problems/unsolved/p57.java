/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.unsolved;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p57 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p57().run() );
    }
    
    @Override
    public String run(){
        //int numerator = 0;
        BigDecimal numerator;
        //int denominator = 1;
        int count = 0;
        BigInteger A0 = BigInteger.ZERO;
        BigInteger An = BigInteger.ONE; // Starting with n = 1
        BigDecimal firstPart = BigDecimal.valueOf(1-Math.sqrt(2));
        BigDecimal secondPart = BigDecimal.valueOf( 1+Math.sqrt(2) );
        BigInteger denominator;
        
        for( int n = 2; n <= 1000; n++ ){ // start with n = 2
            numerator = ( firstPart.pow(n).add(secondPart.pow(n)) ).divide(new BigDecimal("2"),RoundingMode.HALF_UP) ;
            //denominator = A0 + (2*An); // A_(n-2) + 2*A_(n-1)
            denominator = A0.add( An.multiply(BigInteger.valueOf(2)) );
            A0 = An;
            An = denominator;
            
            //if( numerator.toString(). > denominator.toString().length() )
                //count++;
            
            
            System.out.println( "Numerator: " + numerator );
            System.out.println( "Denominator: " + denominator );
            System.out.println("");
        }
        
        
        return Integer.toString(count);
    }
    
    @Override
    public String getTitle(){
        return "Square root convergents";
    }
    
    @Override
    public int getID(){
        return 57;
    }
    
}
