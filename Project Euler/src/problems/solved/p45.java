package problems.solved;

/**
 *
 * @author Sam
 */
public class p45 {
    public static void main(String[] args) {
        long result = 0;
        int i = 143;
 
        while (true) {
            i++;
            result = i * (2 * i - 1);
 
            if (isPentagonal(result)) {
                break;
            }
        }
        
        System.out.println( "Solution:: " + result );
        
    }
    
    // Used in problem 44 as well
    private static boolean isPentagonal( long num ){
        double pen = ( Math.sqrt( 1 + 24 * num ) + 1.0 ) / 6.0; // inverse function found on wikipedia
        return pen == ( ( int )pen );
    }
}
