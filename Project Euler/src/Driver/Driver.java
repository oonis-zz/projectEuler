package Driver;
import javax.script.ScriptEngineManager;
import util.Problem;
import problems.solved.*;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class Driver {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner( System.in );
            Class<?> c = Class.forName( "problems.solved.p19" );
            System.out.println( "Enter a problem to run::" );
            int pNum = userInput.nextInt();
            
            Class<Problem> p =(Class<Problem>) Class.forName( "problems.solved.p"+pNum );
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
