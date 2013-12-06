/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems;

import java.math.BigInteger;

/**
 *
 * @author Sam
 */
public class p48 {
    public static void main(String[] args) {
        new p48().runTest();
        
    }
    
    private void runTest(){
        
        
        BigInteger result = BigInteger.ZERO;
        BigInteger max = new BigInteger("1000");
        for( BigInteger i = BigInteger.ONE; i.compareTo(max) <=0; i = i.add(BigInteger.ONE) ){
            result = result.add( i.pow( i.intValue() ) );
        }
        
        System.out.println("Solution:: " + result.toString()); // Just cut the last 10 from the output 
    }
    
}
