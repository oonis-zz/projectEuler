/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems.solved;

import java.util.ArrayList;

/**
 *
 * @author Sam
 */
public class p29 {
    public static void main(String[] args) {
        ArrayList set = new ArrayList();
        
        for( int a = 2; a <= 100; a++ ){
            for( int b = 2; b <= 100; b++ ){
                double result = Math.pow(a,b);
                if( !set.contains(result) )
                    set.add( result );
            }
        }
        
        System.out.println( "Solution:: " + set.size() );
                
    }
}
