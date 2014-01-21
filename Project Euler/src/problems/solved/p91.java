
package problems.solved;

import util.Problem;

/**
 *
 * @author Sam
 */
public class p91 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p91().run() );
    }
    
    @Override
    public String getTitle(){
        return "Right triangles with integer coordinates";
    }
    
    @Override
    public int getID(){
        return 91;
    }
    
    @Override
    public String run(){
        
        int count = 0;
        int LIMIT = 50;
        
        for( int x1 = 0; x1 <= LIMIT; x1++ ){
            for( int y1 = 0; y1 <= LIMIT; y1++ ){
                for( int x2 = 0; x2 <= LIMIT; x2++ ){
                    for( int y2 = 0; y2 <= LIMIT; y2++ ){
                        if( y1*x2 > y2*x1 && isRight(x1,y1,x2,y2) )
                            count++;
                    }
                }
            }
        }
        
        
        return Integer.toString( count );
    }
    
    /**
     * Determines if the coordinates are of a right triangle
     * @param x1 first x
     * @param y1 first y
     * @param x2 second x
     * @param y2 second y
     * @return If the coordinates create a right triangle
     */
    private boolean isRight( int x1, int y1, int x2, int y2 ){
        
        int dx = x2 - x1;
        int dy = y2 - y1;
        return x1*x1 + y1*y1 + x2*x2 + y2*y2 == dx*dx + dy*dy
            || x1*x1 + y1*y1 + dx*dx + dy*dy == x2*x2 + y2*y2
            || x2*x2 + y2*y2 + dx*dx + dy*dy == x1*x1 + y1*y1;
        
    }
    
}