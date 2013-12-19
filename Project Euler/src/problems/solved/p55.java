/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems.solved;

import java.math.BigInteger;
import util.Methods;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p55 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p55().run() );
    }
    
    @Override
    public String run(){
        int count = 0;
        for( int i = 0; i < 10000; i++ ){
            if( isLychrelNumber(i) )
                count++;
        }
        
        return Integer.toString(count);
    }
    
    private static boolean isLychrelNumber( int n ){
        BigInteger temp = BigInteger.valueOf( n );
        //BigInteger reverseTemp = BigInteger.ZERO;
        
        for( int i = 0; i < 49; i++ ){
            temp = temp.add(new BigInteger( Methods.reverseString( temp.toString() ) ));
            if( Methods.isPalindrome( temp.toString() ) )
                return false;
        }
        
        
        return true;
    }
    
    @Override
    public int getID(){
        return 055;
    }
    
    public String getTitle(){
        return "Lychrel numbers";
    }
    
    
    
}
