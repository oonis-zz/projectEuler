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
public class p31 {
    public static void main(String[] args) {
        int target = 200;
        int[] coinSizes = {1,2,5,10,20,50,100,200};
        int[] ways = new int[target+1];
        ways[0] = 1;
        
        for( int i = 0; i < coinSizes.length; i++ ){
            for( int j = coinSizes[i]; j <= target; j++ ){
                ways[j] += ways[j - coinSizes[i]];
            }
        }
        
        System.out.println( "Solution:: " + ways[ways.length-1] );
    }
}
