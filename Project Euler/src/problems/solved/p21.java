package problems.solved;

import util.Problem;

/**
 *
 * @author Sam
 */
public class p21 implements Problem{
    public static void main(String[] args) {
        System.out.println( "Solution::" + new p21().run() );
    }
    
    @Override
    public String run(){
        return String.valueOf( sum_amicable_pairs(1,10000) );
    }
    
    @Override
    public int getID(){
        return 21;
    }
    
    @Override
    public String getTitle(){
        return "Amicable numbers";
    }
    
    public static int sum_amicable_pairs( int low, int high ){
        int a = low;
        int b;
        int sum = 0;
        
        while( a <= high ){
            b = sum_divisors( a );
            if(b > a && sum_divisors(b) == a)
                sum += ( a + b );
            a++;
        }
        return sum;
        
    }
    
    public static int sum_divisors( int n ){
        int s = 0;
        int i = 1;
        while( i < n ){
            if( n % i == 0 )
                s += i;
            i++;
        }
        return s;
    }
    
}
