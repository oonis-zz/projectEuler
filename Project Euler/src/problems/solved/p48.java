package problems.solved;
import util.Problem;

import java.math.BigInteger;

/**
 *
 * @author Sam
 */
public class p48 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p48().run() );
    }
    
    @Override
    public String getTitle(){
        return "Self powers";
    }
    
    @Override
    public int getID(){
        return 48;
    }
    
    @Override
    public String run(){
        
        
        BigInteger result = BigInteger.ZERO;
        BigInteger max = new BigInteger("1000");
        for( BigInteger i = BigInteger.ONE; i.compareTo(max) <=0; i = i.add(BigInteger.ONE) ){
            result = result.add( i.pow( i.intValue() ) );
        }
        
        return result.toString(); // Just cut the last 10 from the output 
    }
    
}
