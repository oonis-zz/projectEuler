/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author Sam
 */
public class p54 {
    
    private static class Card{
        public final int rank;
        public final int suit;
        //private final String ranks = "23456789TJQKA";
        //private final char[] suites = "SHCD";
        public Card( int rank, int suit ){
            this.rank = rank;
            this.suit = suit;
        }
        
        public Card( String s ){
            this( "23456789TJQKA".indexOf( s.charAt(0) ), "SHCD".indexOf( s.charAt(1) ) );
        }
        
        // This function will return the hash value whch is rank times k + suit + c
        public int hashValue(  ){
            return ( rank * 4 + suit + 1 ); // k = 4, c = 1. Do we even need c?
        }
        
        @Override
        public boolean equals( Object obj ){
            Card temp = (Card)obj;
            return ( rank == temp.rank && suit == temp.suit );
        }
        
        
    }
    
    public static void main(String[] args) {
        
    }
}
