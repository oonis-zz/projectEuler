package Driver;
import util.Problem;
import problems.solved.*;

/**
 *
 * @author Sam
 */
public class Driver {
    public static void main(String[] args) {
        Problem p = new p57();
        System.out.println( "Problem " + p.getID() + " : " +
                p.getTitle() );
        System.out.println( "Solution:: " + p.run() );
    }
}
