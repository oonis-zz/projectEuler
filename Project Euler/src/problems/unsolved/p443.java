
package problems.unsolved;
import util.Problem;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Sam
 */
public class p443 implements Problem{
    public static void main(String[] args) {
        //System.out.println( primeFactors( new BigInteger("39") ) );
        System.out.println( "Solution::" + new p443().run() );
    }
    
    @Override
    public String getTitle(){
        return "GCD sequence";
    }
    
    @Override
    public int getID(){
        return 443;
    }
    
    @Override
    public String run(){
        BigInteger LIMIT = new BigInteger("1000000");
        BigInteger In = new BigInteger("20");
        BigInteger bigTwo = new BigInteger("2");
        BigInteger q = BigInteger.ZERO;
        List<BigInteger> pFacts = new ArrayList<BigInteger>();
        BigInteger k = BigInteger.ZERO;
        BigInteger x[];
        BigInteger n = BigInteger.ZERO;
        BigInteger temp = BigInteger.ZERO;
        BigInteger solution = BigInteger.ZERO; // For the end
        for(;;){
            q = bigTwo.multiply(In);
            q = q.subtract(BigInteger.ONE);
            //pFacts = primeFactors(q); // Can we simplify this to just one element (the first, smallest one)?
            temp = smallestPrimeFactor(q); // We only want the quotient
            temp = temp.subtract( new BigInteger("3") );
            //k = temp.divide(bigTwo);
            x = temp.divideAndRemainder(bigTwo);
            k = x[0];
            n = In.add(k);
            n = n.add( BigInteger.ONE );
            
            System.out.println( "Current In:: " + In );
            if( In.compareTo( LIMIT ) > 0 )
                break;
            In = n;
        }
        solution = In.multiply( new BigInteger("3") );
        temp = LIMIT.subtract(In);
        solution = solution.add( temp );
        System.out.println(solution);
        return In.toString();
    }
    
    private static BigInteger smallestPrimeFactor( BigInteger n ) {
        BigInteger two = new BigInteger("2");
        if (n.mod(two) == BigInteger.ZERO) {
            return two;
        }

        for (BigInteger i = new BigInteger("3"); n.compareTo(i.multiply(i)) >= 0; i = i.add(two)) {         
            if (n.mod(i) == BigInteger.ZERO) {
                return i;
            }

        }
        return n;
    }
    
}
