/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems.solved;

/**
 *
 * @author Sam
 */
public class p44 {
    public static void main(String[] args) {
        int result = 0;
        boolean notFound = true;
        int i = 1;
        int n = 0;
        int m = 0;
        
        while( notFound ){
            i++;
            n = i * ( 3 * i - 1 ) / 2;
            
            for( int j = i-1; j > 0; j-- ){
                m = j * (3 * j - 1) / 2;
                if ( isPentagonal(n - m) && isPentagonal(n + m) ) {
                    System.out.println("Found!");
                    result = n - m;
                    notFound = false;
                    break;
                }
            }
            
        }
        
        System.out.println( "Solution:: " + result );
    }
    
    private static boolean isPentagonal( int num ){
        double pen = ( Math.sqrt( 1 + 24 * num ) + 1.0 ) / 6.0; // inverse function found on wikipedia
        return pen == ( ( int )pen );
    }
}
