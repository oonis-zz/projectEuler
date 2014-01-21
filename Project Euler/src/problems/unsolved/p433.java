
package problems.unsolved;
import util.Problem;

import java.math.BigInteger;

/**
 *
 * @author Sam
 */
public class p433 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p433().run() );
    }
    
    @Override
    public String getTitle(){
        return "Steps in Euclid's algorithm";
    }
    
    @Override
    public int getID(){
        return 433;
    }
    
    @Override
    public String run(){
        BigInteger count = BigInteger.ZERO;
        BigInteger LIMIT = new BigInteger("10");
        
        for( BigInteger i = BigInteger.ONE; i.compareTo(LIMIT) <= 0; i = i.add(BigInteger.ONE) ){
            //for( BigInteger j = BigInteger.ONE; j.compareTo(new BigInteger("5000000")) <= 0; j = j.add(BigInteger.ONE) ){
            for( BigInteger j = BigInteger.ONE; j.compareTo(LIMIT) <= 0; j = j.add(BigInteger.ONE) ){
                count = count.add( E(i,j) );
            }
            System.out.println(i);
        }
        
        return count.toString();
    }
    
    private BigInteger E( BigInteger i, BigInteger j ){
        BigInteger ret = getSmallestFactor( i,j );
        return ret;
    }
    
    private BigInteger getSmallestFactor( BigInteger i,BigInteger j ){
        if( i.compareTo(j) == 0 ) // They are the same
            return BigInteger.ONE;
        
        BigInteger steps = BigInteger.ZERO;
        BigInteger i0 = BigInteger.ZERO;
        
        while( j.compareTo( BigInteger.ZERO ) != 0 ){
            i0 = i;
            i = j;
            j = i0.mod( j );
            
            steps = steps.add( BigInteger.ONE );
        }
        
        return steps;
    }
    
    /*public static final BigInteger sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }*/
    
}
