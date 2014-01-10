package problems.solved;

import java.util.ArrayList;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p29 implements Problem{
    public static void main(String[] args) {        
        System.out.println( "Solution::" + new p29().run() );
    }
    
    @Override
    public String getTitle(){
        return "Distinct powers";
    }
    
    @Override
    public int getID(){
        return 29;
    }
    
    @Override
    public String run(){
        ArrayList set = new ArrayList();
        
        for( int a = 2; a <= 100; a++ ){
            for( int b = 2; b <= 100; b++ ){
                double result = Math.pow(a,b);
                if( !set.contains(result) )
                    set.add( result );
            }
        }
        
        return String.valueOf( set.size() );
        
    }
    
}
