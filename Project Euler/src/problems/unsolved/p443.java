
package problems.unsolved;
import util.Problem;
import java.math.BigInteger;

/**
 *
 * @author Sam
 */
public class p443 implements Problem{
    public static void main(String[] args) {
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
        //long LIMIT = 1000000000000000;
        BigInteger LIMIT = new BigInteger("1000000000000000");
        BigInteger In = new BigInteger("20");
        BigInteger solution = BigInteger.ZERO; // For the end
        for(;;){
            
            
            if( In.compareTo( LIMIT ) > 0 )
                break;
        }
        
        return solution.toString();
    }
    
}
