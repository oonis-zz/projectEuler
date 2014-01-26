
package problems.solved;

import java.math.BigInteger;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p63 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p63().run() );
    }
    
    @Override
    public String getTitle(){
        return "Powerful digit counts";
    }
    
    @Override
    public int getID(){
        return 63;
    }
    
    @Override
    public String run(){
        int count = 0;
        //double temp;
        for( int n = 1; n <= 21; n++ ){
            for( int val = 1; val <= 9; val++ ){
                if ( BigInteger.valueOf(val).pow(n).toString().length() == n )
                    count++;
            }
        }
        
        
        
        
        
        return String.valueOf( count );
    }
    
}
