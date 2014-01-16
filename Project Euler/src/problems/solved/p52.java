
package problems.solved;
import util.Methods;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p52 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p52().run() );
    }
    
    @Override
    public String getTitle(){
        return "Permuted multiples";
    }
    
    @Override
    public int getID(){
        return 52;
    }
    
    @Override
    public String run(){
        
        int x = 0;
        int n = 2; // What we are multiplying by
        //boolean flag = false; // When true, we found the solution
        
        while( true ){
            x++;
            for( ; n < 6; n++ ){
                if( !Methods.sameDigits( x*n, x*(n+1) ) ){
                    n = 2;
                    break;
                }
            }
            if( n > 2 ) // It worked!
                break;
        }
        
        return Integer.toString( x );
    }
    
}
