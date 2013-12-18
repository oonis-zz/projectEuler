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
        private static final String ranks = "23456789TJQKA";
        private static final String suites = "SHCD";
        public Card( int rank, int suit ){
            this.rank = rank;
            this.suit = suit;
        }
        
        public Card( String s ){
            this( ranks.indexOf( s.charAt(0) ), suites.indexOf( s.charAt(1) ) );
        }
        
        @Override
        public int hashCode(  ){
            return ( rank * 4 + suit + 1 ); // k = 4, c = 1. Do we even need c?
        }
        
        @Override
        public boolean equals( Object obj ){
            if( obj instanceof Card ) {
            } else {
                return false;
            }
            
            Card temp = (Card)obj;
            return ( rank == temp.rank && suit == temp.suit );
        }
        
        
    }
    
    public static void main(String[] args) {
        
    }
}
