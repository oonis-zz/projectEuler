
package problems.unsolved;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p92 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p92().run() );
    }
    
    @Override
    public String getTitle(){
        return "Square digit chains";
    }
    
    @Override
    public int getID(){
        return 92;
    }
    
    @Override
    public String run(){
        
        int count = 0;
        for( int i = 1; i < 10000000; i++ ){
            if( isAt89( i ) )
                count++;
        }
        
        return Integer.toString( count );
    }
    
    private static boolean isAt89( int n ){
        for(;;){
            if( n == 1 )
                return false;
            else if( n == 89 )
                return true;
            else
                n = getNextNum(n);
        }
    }
    
    private static int getNextNum( int n ){
        int sum = 0;
        // Just the traditional way to break apart the number
        while( n != 0 ){
            sum += ( n % 10 ) * ( n % 10 );
            n /= 10;
        }
        return sum;
    }
    
    
    
    
}
