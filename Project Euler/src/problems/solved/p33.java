package problems.solved;

/**
 *
 * @author Sam
 */
public class p33 {
    public static void main(String[] args) {
        int denproduct = 1;
        int nomproduct = 1;
        
        for( int i = 1; i < 10; i++ ){
            for( int den = 1; den < i; den++ ){
                for( int nom = 1; nom < den; nom++ ){
                    if( (nom * 10 + i) * den == nom * (i * 10 + den) ){
                        denproduct *= den;
                        nomproduct *= nom;
                    }
                }
            }
        }
        
        denproduct /= gcd( nomproduct, denproduct );
        
        System.out.println( "Solution:: " + denproduct );
    }
    
    private static int gcd( int a, int b ){
        int x,y;
        if( a > b ){
            x = a;
            y = b;
        }else{
            x = b;
            y = a;
        }
        
        int temp;
        while( ( x % y ) != 0 ){
            temp = x;
            x = y;
            y = temp % x;
        }
        
        return y;
    }
    
}
