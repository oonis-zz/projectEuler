package util;

/**
 *
 * @author Sam
 */
public interface Problem {
    
    /**
     * 
     * @return The problem ID number
     * @Deprecated No longer needed
     */
    @Deprecated
    public int getID();
    
    /**
     * 
     * @return The title of the current problem
     */
    public String getTitle();
    
    /**
     * The solution to the problem
     * @return String representation of the solution
     */
    public String run();
}
