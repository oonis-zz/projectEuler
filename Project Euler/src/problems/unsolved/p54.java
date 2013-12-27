package problems.unsolved;

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
    
    public String run(){
        
        return "";
    }
    
    // This will do the actual checking of the score for the players hand
    private static int getScore( Card[] hand ){
        
        int isFlush = 1; // Start with the assumption that we have a flush
        int[] numRanks = new int[13]; // This will tell us how many of each rank we have
        int suitForFlush = hand[0].suit; // If it's a flush then they will all have the same suit
        for( Card card : hand ){ // Iterate through each chard in the hand
            numRanks[card.rank]++; // Mark that we have this card
            if( card.suit != suitForFlush )
                isFlush = 0; // We no longer have a flush option
        }
        
        
        
        return 0;
    }
    
    private static int getHighestStraight( int[] ranks ){
        outer:
        for( int i = ranks.length-1; i >= 3; i-- ){
            for( int j = 0; j < 5; j++ )
                if( ranks[i - j + 13 % 13] == 0 )
                    continue outer;
            return i;
        } 
        
        return -1;
        
    }
    
}
