package problems.solved;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sam
 */
public class p22 {
    public static void main(String[] args) throws IOException {
        String[] a = Import( "C:\\Users\\Sam\\Desktop\\names.txt" ); // hm...
        long b = 0;
        
        for( int i = 0; i < a.length; i++ )
            b += tally( a[i] ) * ( i + 1 );
        
        System.out.println( "Solution:: " + b );
    }
    
    public static String[] Import( String path ) throws IOException{
        BufferedReader a;
        String s = "ERROR";
        try {
             a = new BufferedReader(new FileReader(path));
            //a = new BufferedReader( InputStreamReader( p22.class.getResourceAsStream("/input_files/names.txt") ) );
             s = a.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(p22.class.getName()).log(Level.SEVERE, null, ex);
        }
        //String[] b = a[0].split( ',' ); // otherwsise it's just a giant elememt
        //Array.sort( b );
        
        String names[] = s.split( "," );
        for( int i = 0 ; i < names.length ; i++ ) // Cut off the quotation marks
            names[i] = names[i].substring( 1, names[i].length()-1 );
        Arrays.sort(names); // Might as well sort before returning
        return names;
    }
    
    public static int tally( String a ){
        char[] b = a.toCharArray();
        int c = 0;
        int d = 0;
        
        for( int i = 0; i < b.length; i++ ){
            c = ((b[i] - '0') + 10) % 26;
            if( c == 0 )
                c = 26;
            d += c;
        }
        
        return d;
    }
    
}
