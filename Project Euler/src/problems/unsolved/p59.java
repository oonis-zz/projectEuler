
package problems.unsolved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import util.Problem;

/**
 *
 * @author Sam
 */
public class p59 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p59().run() );
    }
    
    @Override
    public String getTitle(){
        return "XOR decryption";
    }
    
    @Override
    public int getID(){
        return 59;
    }
    
    @Override
    public String run(){
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                p59.class.getResourceAsStream("/input_files.cipher1.txt")));
        
        
        return "";
    }
    
}
