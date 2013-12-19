/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Driver;
import util.Problem;
import problems.solved.p55;

/**
 *
 * @author Sam
 */
public class Driver {
    public static void main(String[] args) {
        Problem p = new p55();
        System.out.println( "Problem " + p.getID() + " : " +
                p.getTitle() + "\n" );
        System.out.println( "Solution:: " + p.run() );
    }
}
