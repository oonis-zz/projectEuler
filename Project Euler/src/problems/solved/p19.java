package problems.solved;

import util.Problem;

/**
 *
 * @author Sam
 */
public class p19 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p19().run() );
    }
    
    @Override
    public String run(){
        int iter = 0;
        long total = 0;
        while(iter < 100000) {
            total = month_range(0,1901,2000);
            iter++;
        }
        return String.valueOf( total );
    }
    
    @Override
    public int getID(){
        return 19;
    }
    
    @Override        
    public String getTitle(){
        return "Counting Sundays";
    }
    
    
    public static long month_range( int day, int year_start, int year_end ){
        long total = 0;
        int year, month;
        for( year = year_start; year < year_end; year++ ){
            for( month = 1; month <= 12; month++ ){
                if( day_of_week( year, month, 1 ) == day )
                    total++;
            }
        }
        return total;
    }
    
    public static int day_of_week( int year, int month, int day ){
        int d = day;
        
        double m = (double) ((month - 3) % 12 + 1);
        int Y;
        if( m > 10 ){
            Y = year - 1;
        }else{
            Y = year;
        }
        int y = Y%100;
        int c = (Y - (Y % 100)) / 100;
        
        int w = ((d+(int)Math.floor(2.6*m-0.2)+y+ y/4 + c/4 -2*c))%7;
        
        return w;
        
    }
    
}
