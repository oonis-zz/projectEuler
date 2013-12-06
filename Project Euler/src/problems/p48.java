/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems;

import java.math.BigDecimal;

/**
 *
 * @author Sam
 */
public class p48 {
    public static void main(String[] args) {
        BigDecimal result = BigDecimal.ZERO;
        for( int i = 1 ; i <= 1000; i++ ){
            result = result.add( BigDecimal.valueOf( Math.pow(i, i) ) );
        }
        
        System.out.println("Solution:: " + result.toString());
        
    }
    
}
