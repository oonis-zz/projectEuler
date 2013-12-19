package problems.solved;

import util.Problem;

/**
 *
 * @author Sam
 */
public class p31 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution:: " + new p31().run() );
    }
    
    @Override
    public String run(){
        int target = 200;
        int[] coinSizes = {1,2,5,10,20,50,100,200};
        int[] ways = new int[target+1];
        ways[0] = 1;
        
        for( int i = 0; i < coinSizes.length; i++ ){
            for( int j = coinSizes[i]; j <= target; j++ ){
                ways[j] += ways[j - coinSizes[i]];
            }
        }
        
        return String.valueOf( ways[ways.length-1] );
    }
    
    @Override
    public int getID(){
        return 31;
    }
    
    @Override
    public String getTitle(){
        return "Coin sums";
    }
    
}
