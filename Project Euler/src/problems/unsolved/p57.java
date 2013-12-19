/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problems.unsolved;

import java.math.BigInteger;
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
        int numerator = 0;
        int denominator = 1;
        int count = 0;
        // numerator = ( (1-sqrt(2))^n + (1+sqrt(2))^n )/2
        
        for( int i = 0; i <= 10; i++ ){
            System.out.println( "Numerator: ");
        }
        
        
        return "";
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
