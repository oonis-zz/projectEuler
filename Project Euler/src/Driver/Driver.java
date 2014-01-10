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
            
            String className = String.format("problems.solved.p%d", pNum);
            Class<Problem> clazz = (Class<Problem>) Class.forName(className);
            Problem problem = clazz.newInstance();
            System.out.println("Solution:: "+problem.run());
            //problem.run();
            
            
        } catch (ClassNotFoundException ex) { // Problem not found under solved
            //Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem not completed yet");
        } catch (InstantiationException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
