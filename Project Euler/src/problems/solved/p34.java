package problems.solved;

/**
 *
 * @author Sam
 */
public class p34 {
    public static void main(String[] args) {
        int result = 0;
        int num;
        int sumOfFacts;
        for( int i = 10; i < 2540161; i++ ){
            sumOfFacts = 0;
            num = i;
            while( num > 0 ){
                int d = num % 10;
                num /= 10;
                sumOfFacts += factorial( d );
            }
            
            if( sumOfFacts == i ){
                result += 1;
            }
            
        }
        
        System.out.println( "Solution:: " + result );
    }
    
    private static int factorial( int x ){
        if( x == 0 )
            return 1;
        int y = x;
        for( int i = 1; i < x; i++ ){
            y *= i;
        }
        
        return y;
    }
}
